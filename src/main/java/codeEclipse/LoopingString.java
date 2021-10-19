package codeEclipse;

public class LoopingString {
    // print string using for loop
    public static void main(String[] args) {

    String bd = "Bangladesh";
    char[] bdBreak = bd.toCharArray();
        for(int l = 0; l <= bd.length() - 1; l++) {
            System.out.print(bdBreak[l]);
        }
    }
}
