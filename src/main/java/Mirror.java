import java.util.Scanner;
public class Mirror {
    static boolean Rotations(String frst, String second) {

        return (frst.length() == second.length()) &&
                ((frst + second).indexOf(second) != -1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первую строку: ");
        String frst = in.nextLine();
        System.out.println("Введите вторую строк: ");
        String second = in.nextLine();

        if (Rotations(frst, second))
            System.out.println("Строки зеркальные друг другу");
        else
            System.out.printf("Строки не зеркальные друг другу");
    }
}