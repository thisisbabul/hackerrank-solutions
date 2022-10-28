package javaBasic;

import java.util.Scanner;

public class StringIntroduction {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        int abLength = A.length() + B.length();

        String aIsGreater = A.compareTo(B) > 0 ? "Yes" : "No";
        String capitalizedOfA = A.substring(0, 1).toUpperCase().concat(A.substring(1));
        String capitalizedOfB = B.substring(0, 1).toUpperCase().concat(B.substring(1));

        System.out.println(abLength);
        System.out.println(aIsGreater);
        System.out.println(capitalizedOfA.concat(" ").concat(capitalizedOfB));
    }
}
