import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class UserName {
    public static void main(String[] args) {
        try {
            String userData = getUserData();
            String[] inputData = parseUserData(userData);
            saveUserData(inputData);
        } catch (IncompleteDataException e) {
            System.out.println("Ошибка: не введены все данные.");
        } catch (InvalidDataFormatException e) {
            System.out.println("Ошибка: неверный формат данных.");
        } catch (IOException e) {
            System.out.println("Ошибка при сохранении данных.");
        }
    }

    private static String getUserData() {
         Scanner scanner = new Scanner(System.in);
         System.out.print("Enter user data: ");
         String userData = scanner.nextLine();
         return userData;

    }

    private static String[] parseUserData(String userData) throws IncompleteDataException, InvalidDataFormatException {
        String[] inputData = userData.split(" ");

        if (inputData.length != 6) {
            throw new IncompleteDataException();
        }

        String surname = inputData[0];
        String firstName = inputData[1];
        String patronymic = inputData[2];
        String birthDate = inputData[3];
        String phoneNum = inputData[4];
        String gender = inputData[5];

        if (!isValidDate(birthDate)) {
            throw new InvalidDataFormatException("Неверный формат даты рождения.");
        }

        try {
            long phoneNumber = Long.parseLong(phoneNum);
        } catch (NumberFormatException e) {
            throw new InvalidDataFormatException("Неверный формат номера телефона.");
        }

        if (!isValidGender(gender)) {
            throw new InvalidDataFormatException("Неверный формат пола.");
        }

        return inputData;
    }

    private static boolean isValidDate(String date) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            sdf.parse(date);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }

    private static boolean isValidGender(String gender) {
        return gender.equals("f") || gender.equals("m");
    }

    private static void saveUserData(String[] inputData) throws IOException {
        String surname = inputData[0];
        String data = String.join(" ", inputData) + "\n";

        FileWriter fileWriter = new FileWriter(surname + ".txt", true);
        fileWriter.write(data);
        fileWriter.close();
    }
}

class IncompleteDataException extends Exception {
    public IncompleteDataException() {
        super("Неполные данные.");
    }
}

class InvalidDataFormatException extends Exception {
    public InvalidDataFormatException(String message) {
        super(message);
    }
}
