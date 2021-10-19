package codeEclipse;

public class Modulus {
    public static void main(String[] args) {
        // print from 1 to 30 if the number is divided by three then print three instead
        // of that number and if
        // the number by 4 print four instead of that number
        // if the number is divided by both 3 & 4 print both instead of that number

        for (int i = 1; i <= 30; i++) {
            //System.out.println(i);
            if (i % 3 == 0 && i % 4 == 0) {
                System.out.println("Both");
            } else if (i % 4 == 0) {
                System.out.println("Four");
            } else if (i % 3 == 0) {
                System.out.println("Three");
            } else {
                System.out.println(i);
            }
        }

    }
}
