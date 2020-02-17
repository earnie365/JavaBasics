package x33_inputOutput;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class InputOutput {

    public static void main(String[] args) {
        writeToFile();
        readFromFile();
    }

    static void writeToFile(){
        File file = new File("mytext.txt");
        try (PrintWriter writer = new PrintWriter(file)) {
            writer.println("some row");
            writer.println("some another row");
            writer.println("row another some");
        } catch (IOException e) {
            System.out.println("Cannot save to file " + e);
        }
        System.out.println("Сделанно. Проверь в директории проекта файл: " + file.getName());


    }

    static void readFromFile() {
        File file = new File("mytext.txt");
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                System.out.println("читаем по словам - " + scanner.next());
//                System.out.println("читаем строчку - " + scanner.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Cannot load from a file " + e);
        }
    }
}
