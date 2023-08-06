
import java.util.Scanner;


class Answer {
    public static float getUserInput() throws Exception {
        float number = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите дробное число: ");
        String input = scanner.nextLine();

        if (input.isEmpty()) {
            throw new Exception("Пустые строки вводить нельзя.");
        }

        try {
            number = Float.parseFloat(input);
        } catch (NumberFormatException e) {
            throw new Exception("Неверный формат числа.");
        }

        return number;
    }

    public static void main(String[] args) {
        try {
            float userInput = getUserInput();
            System.out.println("Вы ввели: " + userInput);
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}