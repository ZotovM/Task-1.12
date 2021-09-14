

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введите радиус цилиндра: ");
        double R = input.nextInt();
        System.out.println("Введите высоту цилиндра: ");
        double h = input.nextInt();

        double V = Math.PI * Math.pow(R, 2) * h;
        System.out.println("Объем цилиндра V: " + V);


    }

}
