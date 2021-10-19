package codeEclipse;

public class Loopping {
    // Print 1-10 without 8
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            if (i == 8) {
                continue;

            }
            System.out.println(i);
        }
        System.out.println("*****//print the array values until zero is found");


        int[] k = {23, 34, 56, 0, 56, 78};

        for (int g = 0; g < 4; g++) {
            System.out.println(k[g]);
        }
    }
}
