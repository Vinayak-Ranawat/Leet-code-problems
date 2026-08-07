class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int MIN = arrays.get(0).get(0);
        int MAX = arrays.get(0).get(arrays.get(0).size() - 1);
        int result = 0;
        for(int i=1; i<arrays.size(); i++){
            List<Integer> currArray = arrays.get(i);
            int currMin = currArray.get(0);
            int currMax = currArray.get(currArray.size() - 1);

            result = Math.max(result, Math.max(Math.abs(currMin - MAX), Math.abs(currMax - MIN)));
            MAX = Math.max(MAX, currMax);
            MIN = Math.min(MIN, currMin);
        }
        return result;
    }
}