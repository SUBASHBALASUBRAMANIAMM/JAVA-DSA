public class IsSubsequence {
    //https://leetcode.com/problems/is-subsequence/
    public static void main(String[] args) {
        String s = "abc", t = "ahbgdc";
        isSubsequence(s,t);

    }
    static  boolean issubsequence(String s, String t){
            for(int i = 0;i<s.length();i++){
                for (int j = 0; j < t.length(); j++) {
                    if(s.charAt(i) != t.charAt(j)){
                        
                    }

                }
            }
    }
}
