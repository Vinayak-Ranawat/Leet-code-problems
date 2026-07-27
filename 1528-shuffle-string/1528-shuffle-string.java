class Solution {
    public String restoreString(String s, int[] idx) {
        char str[] = new char[s.length()];

        for(int i=0; i<s.length(); i++){
            str[idx[i]] = s.charAt(i);
        }
        // retunr restored string
        return String.valueOf(str);
    }
}