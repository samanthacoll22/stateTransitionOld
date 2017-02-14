package stateTrasition;

public class SearchState implements DemoState {
    @Override
    public void process(DemoApplication app, TransitionTable<?> table) {
        System.out.println("Searching a place...");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        table.transitionTo(0);
    }
}
