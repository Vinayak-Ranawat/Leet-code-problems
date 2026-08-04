class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        List<Integer> result = new ArrayList<>();

        int st = Integer.MAX_VALUE;
        int end   = Integer.MIN_VALUE;

        for (int num : nums) {
            set.add(num); // fill
            st = Math.min(st, num); // max
            end   = Math.max(end, num); // min
        }
        for (int i = st; i <= end; i++) {
            if (!set.contains(i)) { // check
                result.add(i);
            }
        }
        return result;
    }
}