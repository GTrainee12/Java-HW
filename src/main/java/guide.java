
import java.io.*;
import java.util.*;
import java.util.ArrayList;

public class guide {


    public static void main(String[] guide) throws IOException {


        File file = new File("D:\\javaPro1\\untitled\\src\\main\\java\\Data.txt");
        if (!file.exists()) {
            file.createNewFile();
            System.out.print("exists");
        }
        BufferedWriter BffW = new BufferedWriter(new FileWriter(file, true));
        Scanner in = new Scanner(System.in);
        System.out.println("Select method: ");
        System.out.println("1 method:Search by id");
        System.out.println("2 method: Open the entire list ");
        System.out.println("3 method: Entering a new person ");
        System.out.println("4 method: Click  enter o end the program");
        FileReader fileR = new FileReader(file);
        BufferedReader BffR = new BufferedReader(fileR);
        ArrayList<String> arrayList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            while (reader.ready()) {
                arrayList.add(reader.readLine());

            }
            Collections.sort(arrayList);
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            if (a == 1) {


                System.out.print("Input a id: ");
                String id1 = in.nextLine();;
                for (String lang : arrayList) {
                    if (lang.startsWith(String.valueOf(id1))) {
                        System.out.println(lang);
                    }
                }
            } else if (a == 2) {
                String line;
                while ((line = reader.readLine()) != null) {
                    arrayList.add(line);
                }
                reader.close();
                for (String s : arrayList) {
                    System.out.println(s);

                }
            } else if (a == 3) {
                System.out.print("Input a id: ");
                String id = in.nextLine();
                System.out.print("Input a name: ");
                String name = in.nextLine();
                System.out.print("Input a gender: ");
                String gender = in.nextLine();
                System.out.print("Input a age: ");
                String age = in.nextLine();
                BffW.append(id + ".");
                BffW.append(name + ".");
                BffW.append(' ');
                BffW.append(gender + ".");
                BffW.append(' ');
                BffW.append(age);
                BffW.newLine();
                BffW.close();
            }
            else if (a == 4){
                System.exit(0);
            }
        }
    }
}
