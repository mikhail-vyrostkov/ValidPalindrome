public class Main {
    public static void main(String[] args) {
        String s = "0P_";
        System.out.println(Solution.isPalindrome(s));
    }

    public static class Solution {
        public static boolean isPalindrome(String s) {
            // Runtime = 16 ms; Memory = 43.2 MB
            boolean b = true;
            String newS = s.toLowerCase().replaceAll("[^a-z0-9]","").trim();
            char[] newSArr = newS.toCharArray();
            for (int i = 0; i < newSArr.length; i++){
                if (newSArr[i] != newSArr[(newSArr.length -1) - i]){
                    b = false;
                    break;
                }
            }
            return b;
        }
    }
}
