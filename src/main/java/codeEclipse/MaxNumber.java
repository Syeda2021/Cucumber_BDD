package codeEclipse;

public class MaxNumber {
    public static void main(String[] args) {
        int[] a = { 10, 20, 85, 99, 100, 15, 84 };
        int maxNumber = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > maxNumber) {
                maxNumber = a[i];
            }
        }
        System.out.println("The largest number " + maxNumber);



    }
}
