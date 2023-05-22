import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String userName, password;

        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı Adı: ");
        userName = input.nextLine();

        if (!userName.equals("patika")) {
            System.out.println("Kullanıcı Adı Hatalıdır!");
            return;
        }

        System.out.print("Şifre: ");
        password = input.nextLine();

        if (!password.equals("java123")) {
            System.out.println("Hatalı Şifre! Şifre güncellemek ister misiniz?Evet/Hayır");
            String karar = input.nextLine();

            if (karar.equals("Evet")) {
                System.out.println("Eski şifreyi hatalı girdiniz. Yeni şifre eski şifre ile farklı giriniz!");
                password = input.nextLine();

                if (password.equals("patika")) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre deneyiniz!");
                } else {
                    System.out.println("Şifre oluşturuldu");
                }

            }

        }

    }
}