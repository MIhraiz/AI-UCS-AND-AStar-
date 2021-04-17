package application;

import java.util.Comparator;

public class AStarCompare implements Comparator<AStarCity> {

    @Override
    public int compare(AStarCity city1, AStarCity city2) {

        return (int) (city1.getHeuristic() - city2.getHeuristic());
    }

}
