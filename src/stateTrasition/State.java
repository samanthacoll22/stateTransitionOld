package stateTrasition;

interface State<T extends Application> {
    void process(T app, TransitionTable<?> table);
}