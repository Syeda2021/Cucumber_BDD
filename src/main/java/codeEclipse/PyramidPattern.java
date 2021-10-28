package codeEclipse;

import java.util.Scanner;

public class PyramidPattern {

    int i, j, k, user_input;

    public void pyramid(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of Layers for Pyramid");
        user_input = sc.nextInt();

        for (i =1; i<= user_input; i++) {
            for(j=i; j< user_input; j++)
                System.out.println("  ");

            for (k=1; k<(i*2); k++)
                System.out.println("*");

            System.out.print("\n");
        }


    }

    public static void main(String[] args) {
        //pyramid pp = new pyramid();


    }

}
