import junit.framework.TestCase;

public class ValidPalindromeTest extends TestCase {

    public void testProfit1(){
        String s = "A man, a plan, a canal: Panama";
        boolean actual = Main.Solution.isPalindrome(s);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    public void testProfit2(){
        String s = "race a car";
        boolean actual = Main.Solution.isPalindrome(s);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    public void testProfit3(){
        String s = "0P_";
        boolean actual = Main.Solution.isPalindrome(s);
        boolean expected = false;
        assertEquals(expected, actual);
    }
}
