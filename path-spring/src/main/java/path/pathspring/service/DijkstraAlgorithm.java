package path.pathspring.service;

import java.util.*;

public class DijkstraAlgorithm {

    public static Map<Integer, Integer> dijkstra(Map<Integer, List<Edge>> graph, int start) {
        Map<Integer, Integer> distances = new HashMap<>();
        Map<Integer, Integer> previous = new HashMap<>();
        PriorityQueue<Node> queue = new PriorityQueue<>();

        for (int node : graph.keySet()) {
            distances.put(node, Integer.MAX_VALUE);
            previous.put(node, null);
        }
        distances.put(start, 0);
        queue.offer(new Node(start, 0));

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            int currentNode = current.node;
            int currentDistance = current.distance;

            if (currentDistance > distances.get(currentNode)) {
                continue;
            }

            for (Edge edge : graph.get(currentNode)) {
                int nextNode = edge.to;
                int nextDistance = currentDistance + edge.weight;

                if (nextDistance < distances.get(nextNode)) {
                    distances.put(nextNode, nextDistance);
                    previous.put(nextNode, currentNode);
                    queue.offer(new Node(nextNode, nextDistance));
                }
            }
        }

        return previous;
    }

    public static List<Integer> getPath(Map<Integer, Integer> previous, Integer end) {
        List<Integer> path = new ArrayList<>();

        while (end != null) {
            path.add(end);
            end = previous.get(end);
        }

        Collections.reverse(path);
        return path;
    }

    private static class Node implements Comparable<Node> {
        int node;
        int distance;

        public Node(int node, int distance) {
            this.node = node;
            this.distance = distance;
        }

        public int compareTo(Node other) {
            return Integer.compare(distance, other.distance);
        }
    }

    public static class Edge {
        int to;
        int weight;

        public Edge(int to, int weight) {
            this.to = to;
            this.weight = weight;
        }
    }

}