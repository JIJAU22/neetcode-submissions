class Solution {
    public int scoreOfString(String s) {
      int score = 0;
        int i=0 ; int j=1;
        while(j < s.length()){
            int charDiff = Math.abs(s.charAt(j) - s.charAt(i));
            score += charDiff;
            i++;
            j++;
        }
        return score;  
    }
}