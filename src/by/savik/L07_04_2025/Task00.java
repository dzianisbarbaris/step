package by.savik.L07_04_2025;

import java.io.*;
import java.util.Scanner;

public class Task00 {
    public static void main(String[] args) {

        try (FileReader fileReader = new FileReader("file.txt")) {
            int ch;
            while ((ch = fileReader.read()) != -1) {
                System.out.print((char) ch);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("");

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("file.txt"))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Файл не найден или повреждён file.txt");
        }

        System.out.println("");

        File file = new File("file.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Файл не найден или повреждён file2.txt");
        }

        try (FileWriter fileWriter = new FileWriter("file2.txt", true)) {
            fileWriter.write("Привет, я новая строка 3 \n");
        } catch (IOException e) {
            System.out.println("Не удалось записать в файл");
        }

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("file2.txt", true))) {
            bufferedWriter.newLine();
            bufferedWriter.write("Строка");
        } catch (IOException e) {
            System.out.println("Не удалось записать в файл");
        }

        try (PrintWriter writer = new PrintWriter("file2.txt")) {
        writer.println("С новой строки");
        } catch (IOException e) {
            System.out.println("Не удалось записать в файл");
        }
    }
}
