import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String input = "input.txt";
        String output = "output.txt";
        thaytheFile(input, output);
    }
    private static void thaytheFile(String input, String output) {
        try {
            FileInputStream fis = new FileInputStream(input);
            Scanner scanner = new Scanner(fis);
            FileWriter writer = new FileWriter(output);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                line = line.replaceAll("Nha Trang", "Vũng Tàu");
                writer.write(line + "\n");
            }
            scanner.close();
            writer.close();
            fis.close();
            System.out.println("Thay thế thành công.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
