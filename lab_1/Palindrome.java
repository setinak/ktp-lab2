/* Проверяет, является ли строка палиндромом */
public class Palindrome {
    
    //Переворачивает строку s
    public static String reverseString(String s) {
        String reverse = "";

        for (int i = 0; i < s.length(); i++) {
            reverse += s.charAt(s.length()-i-1);
        }
        return reverse;
    }

    //Проверяет, является ли строка s палиндромом
    public static boolean isPalindrome(String s) {
        return s.equals(reverseString(s));
    }
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String s = args[i];

            System.out.println(s + " : " + isPalindrome(s));
        }
    }
}