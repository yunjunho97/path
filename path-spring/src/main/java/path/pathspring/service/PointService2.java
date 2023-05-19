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
        graph.put(4001, Arrays.asList(new DijkstraAlgorithm.Edge(4010, 2)));
        graph.put(4010, Arrays.asList(new DijkstraAlgorithm.Edge(4001, 2), new DijkstraAlgorithm.Edge(438, 1), new DijkstraAlgorithm.Edge(4011, 2)));
        graph.put(438, Arrays.asList(new DijkstraAlgorithm.Edge(4010, 2), new DijkstraAlgorithm.Edge(439, 1)));
        graph.put(439, Arrays.asList(new DijkstraAlgorithm.Edge(440, 1), new DijkstraAlgorithm.Edge(438, 1)));
        graph.put(440, Arrays.asList(new DijkstraAlgorithm.Edge(441, 1), new DijkstraAlgorithm.Edge(439, 1)));
        graph.put(441, Arrays.asList(new DijkstraAlgorithm.Edge(440, 1)));
        graph.put(4011, Arrays.asList(new DijkstraAlgorithm.Edge(4010, 2), new DijkstraAlgorithm.Edge(433, 1), new DijkstraAlgorithm.Edge(401, 1), new DijkstraAlgorithm.Edge(403, 1)));
        graph.put(433, Arrays.asList(new DijkstraAlgorithm.Edge(4011, 1), new DijkstraAlgorithm.Edge(434, 1)));
        graph.put(434, Arrays.asList(new DijkstraAlgorithm.Edge(433, 1), new DijkstraAlgorithm.Edge(435, 1)));
        graph.put(435, Arrays.asList(new DijkstraAlgorithm.Edge(436, 1), new DijkstraAlgorithm.Edge(434, 1)));
        graph.put(436, Arrays.asList(new DijkstraAlgorithm.Edge(435, 1), new DijkstraAlgorithm.Edge(437, 1)));
        graph.put(401, Arrays.asList(new DijkstraAlgorithm.Edge(4011, 1), new DijkstraAlgorithm.Edge(402, 1)));
        graph.put(402, Arrays.asList(new DijkstraAlgorithm.Edge(401, 1)));
        graph.put(437, Arrays.asList(new DijkstraAlgorithm.Edge(436, 1)));
        graph.put(403, Arrays.asList(new DijkstraAlgorithm.Edge(4011, 2), new DijkstraAlgorithm.Edge(404, 1)));
        graph.put(404, Arrays.asList(new DijkstraAlgorithm.Edge(403, 1), new DijkstraAlgorithm.Edge(405, 1)));
        graph.put(405, Arrays.asList(new DijkstraAlgorithm.Edge(404, 1), new DijkstraAlgorithm.Edge(4012, 1)));
        graph.put(4012, Arrays.asList(new DijkstraAlgorithm.Edge(405, 1), new DijkstraAlgorithm.Edge(430, 1), new DijkstraAlgorithm.Edge(406, 1)));
        graph.put(430, Arrays.asList(new DijkstraAlgorithm.Edge(4012, 1), new DijkstraAlgorithm.Edge(431, 1)));
        graph.put(431, Arrays.asList(new DijkstraAlgorithm.Edge(432, 1), new DijkstraAlgorithm.Edge(430, 1)));
        graph.put(432, Arrays.asList(new DijkstraAlgorithm.Edge(431, 1), new DijkstraAlgorithm.Edge(4013, 1)));
        graph.put(4013, Arrays.asList(new DijkstraAlgorithm.Edge(432, 1), new DijkstraAlgorithm.Edge(449, 1), new DijkstraAlgorithm.Edge(4015, 1)));
        graph.put(4015, Arrays.asList(new DijkstraAlgorithm.Edge(4013, 1), new DijkstraAlgorithm.Edge(448, 1)));
        graph.put(449, Arrays.asList(new DijkstraAlgorithm.Edge(4013, 1), new DijkstraAlgorithm.Edge(448, 1)));
        graph.put(448, Arrays.asList(new DijkstraAlgorithm.Edge(449, 1), new DijkstraAlgorithm.Edge(447, 1), new DijkstraAlgorithm.Edge(4015, 1)));
        graph.put(447, Arrays.asList(new DijkstraAlgorithm.Edge(448, 1), new DijkstraAlgorithm.Edge(4014, 1)));
        graph.put(4014, Arrays.asList(new DijkstraAlgorithm.Edge(447, 1), new DijkstraAlgorithm.Edge(424, 1), new DijkstraAlgorithm.Edge(4016, 1)));
        graph.put(424, Arrays.asList(new DijkstraAlgorithm.Edge(4014, 1), new DijkstraAlgorithm.Edge(422, 1)));
        graph.put(422, Arrays.asList(new DijkstraAlgorithm.Edge(424, 1), new DijkstraAlgorithm.Edge(420, 1)));
        graph.put(420, Arrays.asList(new DijkstraAlgorithm.Edge(422, 1), new DijkstraAlgorithm.Edge(4017, 1)));
        graph.put(4017, Arrays.asList(new DijkstraAlgorithm.Edge(420, 1), new DijkstraAlgorithm.Edge(411, 1), new DijkstraAlgorithm.Edge(4019, 1)));
        graph.put(406, Arrays.asList(new DijkstraAlgorithm.Edge(4012, 1), new DijkstraAlgorithm.Edge(407, 1)));
        graph.put(407, Arrays.asList(new DijkstraAlgorithm.Edge(406, 1), new DijkstraAlgorithm.Edge(408, 1)));
        graph.put(408, Arrays.asList(new DijkstraAlgorithm.Edge(407, 1), new DijkstraAlgorithm.Edge(409, 1)));
        graph.put(409, Arrays.asList(new DijkstraAlgorithm.Edge(408, 1), new DijkstraAlgorithm.Edge(410, 1)));
        graph.put(410, Arrays.asList(new DijkstraAlgorithm.Edge(409, 1), new DijkstraAlgorithm.Edge(411, 1)));
        graph.put(411, Arrays.asList(new DijkstraAlgorithm.Edge(410, 1), new DijkstraAlgorithm.Edge(4017, 1)));
        graph.put(4016, Arrays.asList(new DijkstraAlgorithm.Edge(4014, 1), new DijkstraAlgorithm.Edge(4018, 1), new DijkstraAlgorithm.Edge(446, 1)));
        graph.put(4018, Arrays.asList(new DijkstraAlgorithm.Edge(4016, 1), new DijkstraAlgorithm.Edge(419, 1), new DijkstraAlgorithm.Edge(445, 1)));
        graph.put(446, Arrays.asList(new DijkstraAlgorithm.Edge(4016, 1), new DijkstraAlgorithm.Edge(419, 1), new DijkstraAlgorithm.Edge(445, 1)));
        graph.put(419, Arrays.asList(new DijkstraAlgorithm.Edge(4018, 1), new DijkstraAlgorithm.Edge(446, 1), new DijkstraAlgorithm.Edge(418, 1)));
        graph.put(418, Arrays.asList(new DijkstraAlgorithm.Edge(419, 1), new DijkstraAlgorithm.Edge(417, 1)));
        graph.put(417, Arrays.asList(new DijkstraAlgorithm.Edge(418, 1), new DijkstraAlgorithm.Edge(416, 1)));
        graph.put(416, Arrays.asList(new DijkstraAlgorithm.Edge(417, 1), new DijkstraAlgorithm.Edge(415, 1)));
        graph.put(415, Arrays.asList(new DijkstraAlgorithm.Edge(416, 1), new DijkstraAlgorithm.Edge(4019, 1)));
        graph.put(4019, Arrays.asList(new DijkstraAlgorithm.Edge(415, 1), new DijkstraAlgorithm.Edge(4017, 1), new DijkstraAlgorithm.Edge(412, 1)));
        graph.put(412, Arrays.asList(new DijkstraAlgorithm.Edge(4019, 1), new DijkstraAlgorithm.Edge(413, 1)));
        graph.put(413, Arrays.asList(new DijkstraAlgorithm.Edge(412, 1), new DijkstraAlgorithm.Edge(414, 1)));
        graph.put(414, Arrays.asList(new DijkstraAlgorithm.Edge(413, 1)));
        graph.put(445, Arrays.asList(new DijkstraAlgorithm.Edge(4018, 1), new DijkstraAlgorithm.Edge(446, 1)));
        System.out.println(graph.get(0));
    }

    public void findNewPath(Point point, Integer endPoint){
        Map<Integer, Integer> previous = DijkstraAlgorithm.dijkstra(graph, 4001);
        List<Integer> path = DijkstraAlgorithm.getPath(previous, endPoint);
        System.out.println("Path: " + path);
        point.setPath(path);
    }
}
