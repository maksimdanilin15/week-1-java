import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину ребра додекаэдра: ");
        double a = scanner.nextDouble();
        double volume = ((15 + 7 * Math.sqrt(5)) / 4) * Math.pow(a, 3);
        System.out.printf("Объем додекаэдра равен: %.4f\n", volume);
        scanner.close();
    }
}
