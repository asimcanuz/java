import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mat, fizik, turkce, kimya, muzik;

        System.out.print("Matematik Notunu giriniz: ");
        mat = input.nextInt();
        System.out.print("Fizik Notunu giriniz: ");
        fizik = input.nextInt();
        System.out.print("Turkce Notunu giriniz: ");
        turkce = input.nextInt();
        System.out.print("Kimya Notunu giriniz: ");
        kimya = input.nextInt();
        System.out.print("Muzik Notunu giriniz: ");
        muzik = input.nextInt();

        if ((mat < 0 || mat > 100) && (fizik < 0 || fizik > 100) && (turkce < 0 || turkce > 100)
                && (kimya < 0 || kimya > 100) && (muzik < 0 || muzik > 100)) {
            System.out.println("Ortalamaya katılamazsınız!");
            return;
        }

        if ((mat + fizik + turkce + kimya + muzik) / 5 < 55) {
            System.out.println("KALDINIZ");
        } else {
            System.out.println("GEÇTİNİZ");
        }


    }
}