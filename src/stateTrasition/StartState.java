package stateTrasition;

public class StartState implements DemoState {
	  @Override
	    public void process(DemoApplication app, TransitionTable<?> table) {
	        System.out.println("Starting application...");
	        try {
	            Thread.sleep(5000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	        table.transitionTo(0);
	    }
}
