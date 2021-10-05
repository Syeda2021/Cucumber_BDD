package codeEclipse;

public class PalindromeCallClass {
    public void palindrome() {
        String s = "ROTATOR";
        String n = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            n = n + s.charAt(i);
        }
        System.out.println("After reverse the new string is= "+ n);

        if (n.contentEquals(s)) {
            System.out.println("String s is a Palindrome");
        } else {
            System.out.println("String s isn't a Palindrome.");
        }

    }
}
