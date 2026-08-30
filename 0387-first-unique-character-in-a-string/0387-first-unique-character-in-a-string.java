class Solution {
    public int firstUniqChar(String s) {
        int freq[] = new int[26];
        // count freq
        for(char c : s.toCharArray()){
            freq[c - 'a']++;
        }
        // find 1st unique
        for(int i=0; i<s.length(); i++){
            if(freq[s.charAt(i) - 'a'] == 1){
                return i;
            }
        }
        return -1;
    }
}