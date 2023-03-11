import java.util.Scanner;
public class equality_method {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое целое число: ");
        int a = scanner.nextInt();
        System.out.println("Введите второе целое число: ");
        int b = scanner.nextInt();


        System.out.println("Выберите метод: ");
        System.out.println("1 - Используем метод StringBuilder.append()");
        System.out.println("2 - Заменяем символ = на слово равно. Используйте методы StringBuilder.insert(),StringBuilder.deleteCharAt()");
        System.out.println("3 - Заменяем символ = на слово равно. Используйте метод StringBuilder.replace()");





        int choice = scanner.nextInt();
        StringBuilder builder = new StringBuilder();
        builder.append(String.format("%d + %d = %d\n", a, b, a + b));
        builder.append(String.format("%d - %d = %d\n", a, b, a - b));
        builder.append(String.format("%d * %d = %d\n", a, b, a * b));
        builder.append(String.format("%d / %d = %d\n", a, b, a / b));
        switch (choice ){

            case 1:
                System.out.println(builder);
                break;
            case 2:
                int index = 0;
                while(index != -1){
                    index = builder.indexOf("=", index);
                    if (index != -1) {
                        builder.deleteCharAt(index).insert(index, "равно").toString();
                        index++;
                    }
                }
                System.out.println(builder);
                break;
            default:
                System.out.println(builder.toString().replaceAll("=", "равно"));
        }

    }
}
