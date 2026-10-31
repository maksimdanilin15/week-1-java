import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ваше имя: ");
        String user = scanner.nextLine();
        System.out.println("Привет, " + user + "!");
        scanner.close();
    }
}
