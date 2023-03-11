import java.util.Scanner;

public class entry {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = in.nextLine();
        System.out.print("Введите первый символ: ");
        String frst = in.nextLine();
        System.out.print("Введите второй сиввол: ");
        String second = in.nextLine();

        boolean bool = str.contains(frst);
        System.out.println(frst+" найден ?:" );
        System.out.println(bool);
        int firstIndex = str.indexOf(frst);
        System.out.println("Индекс символа");
        System.out.println(firstIndex);


        boolean sqFound = str.contains(second);
        System.out.println(second+" найден ?:" );
        System.out.println(sqFound);
        int lastIndex = str.indexOf(second);
        System.out.println("Индекс символа");
        System.out.println(lastIndex);


    }

}