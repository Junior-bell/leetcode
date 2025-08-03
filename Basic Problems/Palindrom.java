public class Palindrom {

    public static void main(String[] args) {

        String str = "level";
        String reversedStr = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr = reversedStr + str.charAt(i);
        }

        if (str.equals(reversedStr)) {
            System.out.println(str + " is a Palindrome String.");
        } else {
            System.out.println(str + " is not a Palindrome String.");
        }
    }
}