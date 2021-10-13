import java.util.Scanner; //Вычислить объем цилиндра c основанием радиуса R и высотой H.
import java.util.Locale;
public class Volume {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        double R = readNumber("Введите значение R: ");
        double h = readNumber("Введите значение h: ");
        double V = calc(R, h);
        answer(V);
    }
    private static double calc(double R, double h) {
        double V = Math.pow(R, 2) * Math.PI * h;
        return V;
    }
    private static void answer(double V) {
        if (V <= 0) {
            System.out.println("Ошибка! ");
        }
        else {
            System.out.println("Объем равен: " + V);
        }
    }
    private static double readNumber(String text) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(text);
        return scanner.nextDouble();
    }
}