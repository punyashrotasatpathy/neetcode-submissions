class Solution {
    public int lastStoneWeight(int[] stones) {
        int n = stones.length;
        if(n == 1){
            return stones[n-1];
        }
        if(n == 0){
            return 0;
        }
        for(int i = 0; i < n; i++){
            Arrays.sort(stones);
            int heavyRock = stones[n-1];
            int secondHeavyRock = stones[n-2];

            stones[n-1] = heavyRock - secondHeavyRock;
            stones[n-2] = 0;
            Arrays.sort(stones);
        }
        return stones[n-1];
    }
}
