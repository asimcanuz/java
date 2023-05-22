import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.00, toplamFiyat;
        int armutAdet, elmaAdet, domatesAdet, muzAdet, patlicanAdet;

        System.out.print("Armut kaç kilo? ");
        armutAdet = input.nextInt();
        System.out.print("Elma kaç kilo? ");
        elmaAdet = input.nextInt();
        System.out.print("Domates kaç kilo? ");
        domatesAdet = input.nextInt();
        System.out.print("Muz kaç kilo? ");
        System.out.print("Muz kaç kilo? ");
        muzAdet = input.nextInt();
        System.out.print("Patlıcan kaç kilo? ");
        patlicanAdet = input.nextInt();

        toplamFiyat = armutAdet * armut + elmaAdet * elma + domatesAdet * domates + muzAdet * muz + patlicanAdet * patlican;

        System.out.println("Toplam Tutar: " + toplamFiyat);


    }
}