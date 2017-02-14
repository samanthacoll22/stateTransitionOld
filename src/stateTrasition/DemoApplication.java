package stateTrasition;

public final class DemoApplication extends Application {
    private TransitionTable<DemoState> table;

    protected void init() {
 //   	DemoState start =new StartState();
        DemoState type = new TypeState();
        DemoState look = new LookState();
        DemoState pick = new PickState();
        DemoState search = new SearchState();
 

        table = new TransitionTable<>();
 //       table.createNode(start).addTransitions(type); 
        table.createNode(type).addTransitions(type, look, search);
        table.createNode(look).addTransitions(type, pick);
        table.createNode(pick).addTransitions(search);
        table.createNode(search);
    }

    protected void process() {
        table.getCurrentState().process(this, table);
    }

    /* This is for demonstration purposes only */
    public boolean typing, looking=true, picking, searching;
    //Other states..

    
}