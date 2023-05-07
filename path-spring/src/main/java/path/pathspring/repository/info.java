package path.pathspring.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import path.pathspring.service.DijkstraAlgorithm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class info {
    /*private final Map<Integer, List<DijkstraAlgorithm.Edge>> graph = new HashMap<>();
    public void createMap(){
        graph.put(0, Arrays.asList(new DijkstraAlgorithm.Edge(1, 5), new DijkstraAlgorithm.Edge(2, 3)));
        graph.put(1, Arrays.asList(new DijkstraAlgorithm.Edge(3, 7)));
        graph.put(2, Arrays.asList(new DijkstraAlgorithm.Edge(1, 2), new DijkstraAlgorithm.Edge(3, 8)));
        graph.put(3, Arrays.asList(new DijkstraAlgorithm.Edge(4, 2)));
        graph.put(4, Arrays.asList(new DijkstraAlgorithm.Edge(0, 4)));
    }*/

    /*public void findPath(){
        Map<Integer, Integer> previous = DijkstraAlgorithm.dijkstra(graph, 0);
        List<Integer> path = DijkstraAlgorithm.getPath(previous, 4);
        System.out.println("Path: " + path);
    }*/
}
