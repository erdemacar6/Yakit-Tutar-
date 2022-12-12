import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Aracınız km de kaç kuruş yakıyor? (Örnek:0,27): ");
        double kurus = scanner.nextDouble();
        System.out.print("Kaç km yol gittiniz? (Örnek:186): ");
        int km = scanner.nextInt();

        System.out.print("Yakıt tutarınız " + (kurus * km) + " TL dir.");

        //erdemacar6
    }
}
