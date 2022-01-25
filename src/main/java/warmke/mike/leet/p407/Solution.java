package warmke.mike.leet.p407;

import java.util.*;

public class Solution {

    static class Node implements Comparable<Node> {
        int value;
        int x;
        int y;

        public Node(int value, int x, int y) {
            this.value = value;
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Node)) return false;
            Node node = (Node) o;
            return value == node.value && x == node.x && y == node.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(value);
        }

        @Override
        public int compareTo(Node o) {
            return Integer.compare(this.value, o.value);
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    ", x=" + x +
                    ", y=" + y +
                    '}';
        }
    }

    public int trapRainWater(int[][] heightMap) {

        Queue<Node> que = new PriorityQueue<>(Comparator.comparing(node -> node.value));
        List<Node> removedNodes = new ArrayList<>();

        var yLength = heightMap[0].length;
        var xLength = heightMap.length;

        for(int i = 0; i < heightMap[0].length; i++) {
            que.add(new Node(heightMap[0][i], 0, i));
        }

        for(int i = 0; i < heightMap[heightMap.length - 1].length; i++) {
            que.add(new Node(heightMap[heightMap.length - 1][i], heightMap.length - 1, i));
        }

        for(int i = 1; i < heightMap.length - 1; i++) {
            que.add(new Node(heightMap[i][0], i, 0));
            que.add(new Node(heightMap[i][heightMap[0].length - 1], i, heightMap[0].length - 1));
        }

        var result = 0;

        while (!que.isEmpty()) {
            Node node = que.remove();
            removedNodes.add(node);

            var lowestNeighbor = 0;

            if (node.x < xLength - 1) {
                var newX = node.x + 1;
                var rightNeighbor = new Node(heightMap[newX][node.y], newX, node.y);

                if (!removedNodes.contains(rightNeighbor)) {
                    if (!que.contains(rightNeighbor)) {
                        que.add(rightNeighbor);
                    }

                    if (lowestNeighbor > rightNeighbor.value) {
                        lowestNeighbor = rightNeighbor.value;
                    }
                }
            }

            if (node.x > 0) {
                var newX = node.x - 1;
                var leftNeighbor = new Node(heightMap[newX][node.y], newX, node.y);

                if (!removedNodes.contains(leftNeighbor)) {
                    if (!que.contains(leftNeighbor)) {
                        que.add(leftNeighbor);
                    }

                    if (lowestNeighbor > leftNeighbor.value) {
                        lowestNeighbor = leftNeighbor.value;
                    }
                }
            }

            if (node.y > yLength - 1) {
                var newY = node.y + 1;
                var topNeighbor = new Node(heightMap[node.x][newY], node.x, newY);

                if (!removedNodes.contains(topNeighbor)) {
                    if (!que.contains(topNeighbor)) {
                        que.add(topNeighbor);
                    }

                    if (lowestNeighbor > topNeighbor.value) {
                        lowestNeighbor = topNeighbor.value;
                    }
                }
            }

            if (node.y > 0) {
                var newY = node.y - 1;
                var bottomNeighbor = new Node(heightMap[node.x][newY], node.x, newY);

                if (!removedNodes.contains(bottomNeighbor)) {
                    if (!que.contains(bottomNeighbor)) {
                        que.add(bottomNeighbor);
                    }

                    if (lowestNeighbor > bottomNeighbor.value) {
                        lowestNeighbor = bottomNeighbor.value;
                    }
                }
            }

            if (lowestNeighbor > node.value) {
                result += lowestNeighbor - node.value;
            }
        }

        return result;
    }

}
