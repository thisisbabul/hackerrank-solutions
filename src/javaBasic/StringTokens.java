package javaBasic;

import java.util.Scanner;

public class StringTokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        if (s.trim().isEmpty()) {
            System.out.println(0);
        }
        else {
            String[] result = s.trim().split("[ !,?._'@]+");
            System.out.println(result.length);
            for (String a: result) {
                System.out.println(a);
            }
        }
        scan.close();
    }
}
