public class Main {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama".toLowerCase().replaceAll("[^a-z0-9]","").trim();;

        if (Solution.isPalindrome(s)){
            System.out.println(s + " is a palindrome");
        }else {
            System.out.println(s + " is not a palindrome.");
        }
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
