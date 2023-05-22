import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double kilo, boy, kitleIndex;

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz :");
        boy = input.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz :");
        kilo = input.nextDouble();

        kitleIndex = kilo/(boy*boy);

        System.out.println("Vücut Kitle İndeksiniz :" + kitleIndex);
    }
}