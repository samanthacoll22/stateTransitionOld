package stateTrasition;

public class PickState implements DemoState {
    @Override
    public void process(DemoApplication app, TransitionTable<?> table) {
        System.out.println("Picking from the list of suggestions");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        table.transitionTo(0);
    }
}
