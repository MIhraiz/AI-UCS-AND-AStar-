package application;

public class AStarCity{
    Node node;
    Double heuristic;

    public AStarCity(Node node, Double heuristic) {
        this.node = node;
        this.heuristic = heuristic;
    }
    public AStarCity(Node node) {
        this.node = node;
        ;
    }
    public AStarCity() {
    }


    public Node getCity() {
        return node;
    }

    public Double getHeuristic() {
        return heuristic;
    }

    public void setCity(Node node) {
        this.node = node;
    }

    public void setHeuristic(Double heuristic) {
        this.heuristic = heuristic;
    }

    @Override
    public String toString() {
        return "AStarCity{" +
                "city=" + node.toString() +
                ", heuristic=" + heuristic +
                '}';
    }


}
