public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome("Анна"));
        System.out.println(isPalindrome("Мотор"));
    }

    public static boolean isPalindrome(String text) {
        return text.equalsIgnoreCase(new StringBuffer(text).reverse().toString());
    }

}