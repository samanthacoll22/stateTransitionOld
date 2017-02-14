package stateTrasition;

public class LookState implements DemoState {
    @Override
    public void process(DemoApplication app, TransitionTable<?> table) {
        System.out.println("User is looking at list from suggestions");
        if(app.typing) {
            table.transitionTo(0);
        } else if(app.picking) {
            table.transitionTo(1);
        }
    }
}
