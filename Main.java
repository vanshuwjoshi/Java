import java.util.Scanner;

public class Main{
    public static final Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        Generator generator = new Generator();
        generator.generate();
        keyboard.close();
    }
}