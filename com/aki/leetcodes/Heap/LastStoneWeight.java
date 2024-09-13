package com.aki.leetcodes.Heap;

import java.util.PriorityQueue;

// LeetCode : 1046
public class LastStoneWeight {

    public static int lastStoneWeight(int[] stones) {

        if (stones == null) return 0 ;
        if (stones.length == 1) return stones[0] ;

        // Create a max heap (priority queue with descending order)
        PriorityQueue<Integer> pq = new PriorityQueue<>(stones.length, (o1, o2) -> o2 - o1);

        // Init stones into the priority queue
        for (int stone : stones) {
            pq.add(stone) ;
        }

        // Process the stones
        while (pq.size() > 1) {
            int heavyStone1 = pq.poll() ;
            int heavyStone2 = pq.poll() ;
            int difference = Math.abs(heavyStone1 - heavyStone2) ;

            // If one of them is bigger, add the difference back to the priority queue
            if (difference != 0) pq.add(difference) ;
        }

        // Return the last stone weight or 0 if no stones are left in the priority queue
        return pq.isEmpty() ? 0 : pq.poll() ;
    }

    public static void main(String[] args) {

        int[] stones1 = {2, 7, 4, 1, 8, 1};
        System.out.println(lastStoneWeight(stones1)) ;

        int[] stones2 = {1};
        System.out.println(lastStoneWeight(stones2)) ;
    }
}