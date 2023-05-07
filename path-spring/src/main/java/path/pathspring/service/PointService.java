package path.pathspring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import path.pathspring.domain.Point;
import path.pathspring.repository.CreateMMM;

import java.util.*;

@Service
public class PointService {
    /*public static Map<Integer, List<DijkstraAlgorithm.Edge>> graph;

    public void createMap(){
        graph = new HashMap<>();
        graph.put(0, Arrays.asList(new DijkstraAlgorithm.Edge(1, 5), new DijkstraAlgorithm.Edge(2, 3)));
        graph.put(1, Arrays.asList(new DijkstraAlgorithm.Edge(3, 7)));
        graph.put(2, Arrays.asList(new DijkstraAlgorithm.Edge(1, 2), new DijkstraAlgorithm.Edge(3, 8)));
        graph.put(3, Arrays.asList(new DijkstraAlgorithm.Edge(4, 2)));
        graph.put(4, Arrays.asList(new DijkstraAlgorithm.Edge(0, 4)));
    }*/

    //private final CreateMMM createMMM;
    //public PointService(MemberRepository memberRepository){
        //this.memberRepository = memberRepository;
    //}
    /*@Autowired
    public PointService(CreateMMM createMMM){
        this.createMMM = createMMM;
    }

    public void join2(){
        createMMM.createMap();
        System.out.println("createMap");
    }

    public void join3(Point point, int endPoint){
        ArrayList<Integer> path = (ArrayList<Integer>) createMMM.findPath(endPoint);
        point.setPath(path);

    }

    public void join(Point point){
        ArrayList<String> listP = new ArrayList<>();
        System.out.println(point.getStartPoint());

        listP.add("노드1");
        listP.add("노드2");

        *//*Map<Integer, Integer> previous = DijkstraAlgorithm.dijkstra(graph, 0);
        List<Integer> path = DijkstraAlgorithm.getPath(previous, 4);
        System.out.println("Path: " + path);*//*

        point.setList(listP);

    }*/

    /*public void join(Point point, Map<Integer, List<DijkstraAlgorithm.Edge>> graph){
        ArrayList<String> listP = new ArrayList<>();
        System.out.println(point.getStartPoint());

        listP.add("노드1");
        listP.add("노드2");

        Map<Integer, Integer> previous = DijkstraAlgorithm.dijkstra(graph, 0);
        List<Integer> path = DijkstraAlgorithm.getPath(previous, 4);
        System.out.println("Path: " + path);

        point.setList(listP);
    }*/


}
