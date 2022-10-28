package javaBasic;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String ans = "";
        if(n%2 == 1) {
            ans = "Weird";
        }
        else {
            if(2 <= n && 5 >= n) {
                ans = "Not Weird";
            }
            else if(6 <= n && 20 >= n) {
                ans = "Weird";
            }
            else if(n > 20) {
                ans = "Not Weird";
            }
        }
        System.out.println(ans);
    }
}
