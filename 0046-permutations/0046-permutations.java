class Solution {
    public void swap(int nums[], int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void getPerms(int nums[], int idx, List<List<Integer>>ans){
        if (idx == nums.length) {
            List<Integer> currPerm = new ArrayList<>();
            for (int num : nums) {
                currPerm.add(num);
            }
            ans.add(currPerm);
            return;
        }
        for (int i = idx; i < nums.length; i++) {
            swap(nums, idx, i); // idx place - ith elemnt choice
            getPerms(nums, idx + 1, ans);
            swap(nums, idx, i); // backtracking
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        getPerms(nums, 0, ans);
        return ans;
    }
}