package path.pathspring.service;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;
import path.pathspring.domain.Point;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PointService2 {
    private Map<Integer, List<DijkstraAlgorithm.Edge>> graph;

    @PostConstruct
    public void createNewMap(){
        System.out.println("createNewMap");
        graph = new HashMap<>();
        graph.put(0, Arrays.asList(new DijkstraAlgorithm.Edge(1, 5), new DijkstraAlgorithm.Edge(2, 3)));
        graph.put(1, Arrays.asList(new DijkstraAlgorithm.Edge(3, 7)));
        graph.put(2, Arrays.asList(new DijkstraAlgorithm.Edge(1, 2), new DijkstraAlgorithm.Edge(3, 8)));
        graph.put(3, Arrays.asList(new DijkstraAlgorithm.Edge(4, 2)));
        graph.put(4, Arrays.asList(new DijkstraAlgorithm.Edge(0, 4)));
        System.out.println(graph.get(0));
    }

    public void findNewPath(Point point, Integer endPoint){
        Map<Integer, Integer> previous = DijkstraAlgorithm.dijkstra(graph, 0);
        List<Integer> path = DijkstraAlgorithm.getPath(previous, endPoint);
        System.out.println("Path: " + path);
        point.setPath(path);
    }
}
