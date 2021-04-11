import java.util.Scanner;

public class lineIfTheFrame {

    public static void printErr() {
        System.out.println("Ошибка");
    }

    public static void printBorder(int j, int width) {
        if ((j == 0) || (j == width - 1))
            System.out.print("*");
        else
            System.out.print(" ");
    }

    public static void printString(int j, int width, String line) {
        char[] ch = line.toCharArray();
        int med = (width - line.length()) / 2;

        if ((j == 0) || (j == width - 1))
            System.out.print("*");
        else if (j >= med && j - med < line.length())
            System.out.print(ch[j - med]);
        else
            System.out.print(" ");
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int len = input.nextInt(); //6
        int width = input.nextInt(); //20
        String line = input.next();
        int medium;

        if (len % 2 == 0)
            medium = len / 2 - 1;
        else
            medium = len / 2;

        if ((line.length() > width - 2) || len < 3)
            printErr();
        else {
            for (int i = 0; i < len; i++) {
                for (int j = 0; j < width; j++) {
                    if ((i == 0) || (i == len - 1))
                        System.out.print('*');
                    else if (i == medium)
                        printString(j, width, line);
                    else
                        printBorder(j, width);
                }
                System.out.println();
            }
        }
    }
}
