class Solution {
    public int totalNumbers(int[] digits) {
        int freq[] = new int[10];
        for(int digit : digits){
            freq[digit]++;
        }
        int cnt = 0;
        for(int i=100; i<=999; i++){
            if(i % 2 != 0){
                continue;
            }
            int n = i;
            int a = n % 10; // last digit
            n /= 10;
            int b = n % 10;
            n /= 10;
            int c = n % 10;

            // enough copies of each digit exist
            int req[] = new int[10];
            req[a]++;
            req[b]++;
            req[c]++;

            boolean possible = true;
            for(int d=0; d<=9; d++){
                if(req[d] > freq[d]){
                    possible = false;
                    break;
                }
            }
            if(possible){
                cnt++;
            }
        }
        return cnt;
    }
}