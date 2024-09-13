package com.aki.leetcodes.Graph;

import java.util.*;

// LeetCode : 1971
public class FindIfPathExistsInGraph {

    // source is start node, destination is goal node
    public static boolean validPath(int n, int[][] edges, int source, int destination) {

        Map<Integer, List<Integer>> graph = new HashMap<>();    // <currentNode, neighborNodes(can arrive nodes)>

        // Iterate every path, adding neighbor nodes into graph Map.
        for (int[] edge : edges) {

            int a = edge[0] ;
            int b = edge[1] ;

            graph.computeIfAbsent(a, k -> new ArrayList<>()).add(b) ;
            graph.computeIfAbsent(b, k -> new ArrayList<>()).add(a) ;
        }

        Set<Integer> visitedNodesSet = new HashSet<>();

        return dfs(source, destination, graph, visitedNodesSet);
    }

    private static boolean dfs(int source, int destination, Map<Integer, List<Integer>> graph, Set<Integer> visitedNodesSet) {

        // Arrived the destination (have source-to-destination path)
        if (source == destination) return true ;

        visitedNodesSet.add(source);

        for (int neighborNode : graph.getOrDefault(source, new ArrayList<>())) {

            if (!visitedNodesSet.contains(neighborNode)) {

                // To check the value of node (neighborNode) hasn't visited equals to destination by recursion.
                if (dfs(neighborNode, destination, graph, visitedNodesSet)) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int nodeNum1 = 3 ;
        int[][] edges1 = {{0,1}, {1, 2}, {2, 0}} ;
        int source = 0, destination = 2 ;
        System.out.println(validPath(nodeNum1, edges1, source, destination)) ;


        int nodeNum2 = 6 ;
        int[][] edges2 = {{0,1}, {0, 2}, {3, 5}, {5, 4}, {4, 3}} ;
        int source2 = 0, destination2 = 5 ;
        System.out.println(validPath(nodeNum2, edges2, source2, destination2)) ;
    }
}
