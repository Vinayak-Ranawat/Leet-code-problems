class Solution {
    public List<List<Integer>> combinationSum2(int[] arr, int tar) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(arr);
        backtrack(arr, tar, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] nums, int remaining, int start, List<Integer> curr, List<List<Integer>> result) {
        // base case - found valid combination
        if (remaining == 0) {
            result.add(new ArrayList<>(curr));
            return;
        }

        for (int i = start; i < nums.length; i++) {
            // skip duplicates at same level
            if (i > start && nums[i] == nums[i - 1]) continue;

            // no point going further
            if (nums[i] > remaining) break;

            curr.add(nums[i]);
            backtrack(nums, remaining - nums[i],i + 1, curr, result);// explore
            curr.remove(curr.size() - 1);// unchoose
        }
    }
}