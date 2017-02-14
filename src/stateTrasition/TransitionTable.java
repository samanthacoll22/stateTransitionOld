package stateTrasition;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public final class TransitionTable<T extends State<?>> {
    private Map<T, StateNode> nodes = new HashMap<>();
    private StateNode currentNode, startNode;
    
    public StateNode createNode(T state) {
        StateNode node = new StateNode(state);
        nodes.put(state, node);
        if(startNode == null) {
            startNode = currentNode = node;
        }
        return node;
    }

    public void transitionTo(int index) {
        T nextState = currentNode.containsTransition(index) ? currentNode.states.get(index) : startNode.mainState;
        currentNode = nodes.get(nextState);
    }

    public T getCurrentState() {
        return currentNode.mainState;
    }
    
    public void reset() {
        currentNode = startNode;
    }

    public class StateNode {
        private final ArrayList<T> states = new ArrayList<>();
        private final T mainState;

        private StateNode(T state) {
            this.mainState = state;
        }

        private boolean containsTransition(int index) {
            return index >= 0 && index <= states.size();
        }

        public void addTransitions(T...states) {
            for(T state : states) {
                this.states.add(state);
            }
        }
    }
}