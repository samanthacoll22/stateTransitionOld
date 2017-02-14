package stateTrasition;

public class TypeState implements DemoState {
    @Override
    public void process(DemoApplication app, TransitionTable<?> table) {
        System.out.println("User is typing");
        if(app.typing) {
            table.transitionTo(0);
        } else if(app.looking) {
            table.transitionTo(1);
        } else {
        	table.transitionTo(2);
        }
    
    }
}
