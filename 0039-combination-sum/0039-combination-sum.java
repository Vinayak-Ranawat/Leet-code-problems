class Solution {
    private Set<List<Integer>> s = new HashSet<>();
    private void getAllCombinations(int arr[], int idx, int tar, List<List<Integer>> ans, List<Integer> combin){
        if (idx == arr.length || tar < 0) {
            return;
        }
        if (tar == 0) {
            if (!s.contains(combin)) {
                ans.add(new ArrayList<>(combin));
                s.add(new ArrayList<>(combin));
            }
            return;
        }
        combin.add(arr[idx]);
        // include Single element
        getAllCombinations(arr, idx + 1, tar - arr[idx], ans, combin);
        // include multiple element
        getAllCombinations(arr, idx, tar - arr[idx], ans, combin);
        combin.remove(combin.size() - 1);
        // exclude
        getAllCombinations(arr, idx + 1, tar, ans, combin);
    }

    public List<List<Integer>> combinationSum(int[] arr, int tar) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> combin = new ArrayList<>();
        s.clear();
        
        getAllCombinations(arr, 0, tar, ans, combin);
        return ans;
    }
}