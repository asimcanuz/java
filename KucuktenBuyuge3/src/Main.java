import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int n1, n2, n3, enK;

        System.out.print("Sayi1 : ");
        n1 = inp.nextInt();

        System.out.print("Sayi2 : ");
        n2 = inp.nextInt();

        System.out.print("Sayi3 : ");
        n3 = inp.nextInt();

        if (n1 < n2 && n1 < n3) {
            if (n2 < n3) {
                System.out.println(n1 + " " + n2 + " " + n3);
            } else {
                System.out.println(n1 + " " + n3 + " " + n2);
            }
        } else if (n2 < n1 && n2 < n3) {
            if (n1 < n3) {
                System.out.println(n2 + " " + n1 + " " + n3);
            } else {
                System.out.println(n2 + " " + n3 + " " + n1);
            }
        } else {
            if (n1 < n2) {
                System.out.println(n3 + " " + n1 + " " + n2);
            } else {
                System.out.println(n3 + " " + n2 + " " + n1);
            }
        }
    }
}