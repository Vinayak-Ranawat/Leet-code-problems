class Solution { // TC-O(n) SC-O(1)
    public int climbStairs(int n) {
        if(n == 1 || n == 2){
         return n;
        }
        int curr = 0;
        int prev2 = 1, prev1 = 2;
        for(int i=3; i<=n; i++){
            curr = prev2 + prev1; // fibonacci
            prev2 = prev1;
            prev1 = curr;
        }
        return curr;
    }
}