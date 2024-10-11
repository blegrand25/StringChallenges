/***
 * Problem: You are given an email address, and you need to extract the username
 * (everything before the @ symbol).
 * Write a method that returns the username from an email string.
 * Expected output: Username: kim_possible25
 */

public class A_NameFinder {

    public static void main(String[] args) {
        A_NameFinder a = new A_NameFinder();
    }
    // int - string.indexOf (m', 10 ) --> starts counting at 0 not 1 , when has two parameters its gonna be string than int
    //boolean  string.contains (k')
    //  string.substring
    public A_NameFinder() {
        String email = "kim_possible25@milton.edu";
        System.out.println("Username: " + findUsername(email)); // Output: Username: kim_possible25

    }

    public String findUsername(String email) {
        int end = email.indexOf("@");
        String username = email.substring(0, end);


        return username;// this is a temporary return to avoid errors
    }

}
