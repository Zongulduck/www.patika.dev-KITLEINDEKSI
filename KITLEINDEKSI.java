import java.util.Scanner;
public class KITLEINDEKSI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double kg,boy,indeks;
        System.out.println("Boyunuzu metre cinsinden(ör:1,85) giriniz; ");
        boy=input.nextDouble();
        System.out.println("Kilonuzu giriniz; ");
        kg=input.nextDouble();
        indeks=kg/(boy*boy);
        System.out.println("Vücut kitle indeksiniz; ");
        System.out.println(indeks);
    }
}
