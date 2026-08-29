class Solution {
    public int arrangeCoins(int n) {
        long st = 1, end = n;
        // TC-O(n) SC-O(1)
        while(st <= end){
            long mid = (st + end) / 2;
            long coins = mid * (mid+1) / 2;

            if(coins == n) return (int)mid;
            else if(coins < n) st = mid+1;
            else end = mid-1;
        }
        return (int)end;
    }
}