package less_2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

import javax.management.RuntimeErrorException;

// Задание №4
// Напишите метод, который составит строку, состоящую из 100
// повторений слова TEST и метод, который запишет эту строку в
// простой текстовый файл, обработайте исключения.
public class ex_04 {
    private static Object FileHandler;

    public static void main(String[] args) {
        String filePath = "less_2/test.txt";
        String s = "Test";
        int n = 10;
        String res = repeat(s, n);
        writeInFile(res, filePath);
        readFIle(filePath);

    }

    static void writeInFile(String res, String filePath) {
        Logger logger = Logger.getAnonymousLogger();
        FileHandler handler = null;
        try {
            handler = new FileHandler("less_2/log.txt");
            logger.addHandler(handler);
        } catch (Exception e) {
            e.printStackTrace();

        }

        try (FileWriter writer = new FileWriter(filePath, true)) {

            writer.write(res);
            writer.write("\n");
            logger.info("Запись прошла успешно");
        } catch (IOException e) {

            e.printStackTrace();
            logger.warning("Запись в файл  не удалась");

        }
        handler.close();

    }

    static void readFIle(String filePath) {
        File file = new File(filePath);

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }

        } catch (Exception e) {
            e.printStackTrace();
            // TODO: handle exception
        }

    }

    static String repeat(String s, int n) {

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            stringBuilder.append("test");
            stringBuilder.append(" ");

        }
        return stringBuilder.toString();
    }

}
