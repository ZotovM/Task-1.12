import java.util.Scanner;
import java.util.Locale;
public class Volume {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        double R = readNumber("Введите значение: R ");
        double h = readNumber("Введите значение h: ");
        double V = Math.PI * Math.pow(R, 2) * h;
        System.out.println("Объем цилиндра равен: " + V);
        System.exit(0);
    }
        private static double readNumber(String text) {
            Scanner scanner = new Scanner(System.in);
            System.out.println(text);
            return scanner.nextDouble();
        }
    }