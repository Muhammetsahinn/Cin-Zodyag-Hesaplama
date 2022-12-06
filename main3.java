import java.util.Scanner;

public class main3 {

    public static void main(String[] args ) {

        double dgm, burc;

        Scanner gir = new Scanner(System.in);

        System.out.print("Dogum yilinizi giriniz :");

        dgm = gir.nextDouble();
        burc = dgm % 12;
        if (burc == 0) {
            System.out.println("Burcunuz : Maymun");
        }
        else if (burc == 1) {
            System.out.println("Burcunuz : Horoz");
        }
        else if (burc == 2) {
            System.out.println("Burcunuz : Kopek");
        }
        else if (burc == 3) {
            System.out.println("Burcunuz : Domuz");
        }
        else if (burc == 4) {
            System.out.println("Burcunuz : Fare");
        }
        else if (burc == 5) {
            System.out.println("Burcunuz : Okuz");
        }
        else if (burc == 6) {
            System.out.println("Burcunuz : Kaplan");
        }
        else if (burc == 7) {
            System.out.println("Burcunuz : Tavsan");
        }
        else if (burc == 8) {
            System.out.println("Burcunuz : Ejderha");
        }
        else if (burc == 9) {
            System.out.println("Burcunuz : Yilan");
        }
        else if (burc == 10) {
            System.out.println("Burcunuz : At");
        }
        else if (burc == 11) {
            System.out.println("Burcunuz : Koyun");
        }





    }
}
