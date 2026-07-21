package level1;

import java.util.Scanner;

public class SubStringDemo {

    static String mySubstring(String text, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += text.charAt(i);
        }

        return result;
    }

    static boolean compare(String a, String b) {
        if (a.length() != b.length())
            return false;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i))
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String text = sc.next();
        System.out.print("Enter Start Index: ");
        int start = sc.nextInt();
        System.out.print("Enter End Index: ");
        int end = sc.nextInt();

        String user = mySubstring(text, start, end);
        String builtin = text.substring(start, end);

        System.out.println("User Substring : " + user);
        System.out.println("Built-in Substring : " + builtin);
        System.out.println("Equal : " + compare(user, builtin));
    }
}