package path.pathspring.domain;

import path.pathspring.service.DijkstraAlgorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Point {

    ArrayList<String> list = new ArrayList<>();
    public ArrayList<String> getList() {
        return list;
    }

    public void setList(ArrayList<String> list) {
        this.list = list;
    }

    private String startPoint;

    public String getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(String startPoint) {
        this.startPoint = startPoint;
    }

    List<Integer> path = new ArrayList<>();

    public List<Integer> getPath() {
        return path;
    }

    public void setPath(List<Integer> path) {
        this.path = path;
    }

    //Map<Integer, List<DijkstraAlgorithm.Edge>> graph;
}
