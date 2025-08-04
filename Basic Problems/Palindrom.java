import java.util.Scanner;

public class Palindrom {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("please enter a word to check if it is Palindrom or not");
        String str = sc.nextLine();
        String reversedStr = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr = reversedStr + str.charAt(i);
        }

        if (str.equals(reversedStr)) {
            System.out.println(str + " is a Palindrome String.");
        } else {
            System.out.println(str + " is not a Palindrome String.");
        }
        sc.close();
    }
}