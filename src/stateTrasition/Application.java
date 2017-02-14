package stateTrasition;

import java.util.concurrent.atomic.AtomicBoolean;

public abstract class Application {
    private AtomicBoolean running = new AtomicBoolean(false);
    private Thread thread;

    public final void start() {
        if(running != null && running.compareAndSet(false, true)) {
            init();

            thread = new Thread(logic);
            thread.start();
        }
    }

    private Runnable logic = () -> {
        while(running.get()) {
            process();
        }
    };

    protected abstract void init();
    protected abstract void process();
}