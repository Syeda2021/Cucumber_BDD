package codeEclipse;

public class Reverse {
    public static void main(String[] args) {
        // print string in reverse way

        String name = "infosys";
        char[] brkName = name.toCharArray();
        System.out.println(brkName.length);
        for (int i = 7 - 1; i >= 0; i--) {
            System.out.print(brkName[i]);
        }

        System.out.println();

    }
}
