import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TextFileSaver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the file name (with .txt extension):");
        String fileName = scanner.nextLine();

        System.out.println("Enter the text you want to save:");
        String text = scanner.nextLine();

        try (FileWriter fileWriter = new FileWriter(fileName)) {
            fileWriter.write(text);
            System.out.println("Text successfully saved to " + fileName);
        } catch (IOException e) {
            System.err.println("An error occurred while saving the text to file:");
            e.printStackTrace();
        }
    }
}
