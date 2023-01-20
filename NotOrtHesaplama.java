import java.util.Scanner;

public class NotOrtHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
     
        int matematik, fizik, kimya, turkce, tarih, muzik;

        System.out.print("Matematik notunuzu giriniz : ");
        matematik = input.nextInt();
        
        System.out.print("Fizik notunuzu giriniz : ");
        fizik = input.nextInt();
        
        System.out.print("Kimya notunuzu giriniz : ");
        kimya = input.nextInt();
        
        System.out.print("Türkçe notunuzu giriniz : ");
        turkce = input.nextInt();
        
        System.out.print("Tarih notunuzu giriniz : ");
        tarih = input.nextInt();
        
        System.out.print("Müzik notunuzu giriniz : ");
        muzik = input.nextInt();

        double ort = (matematik+fizik+kimya+turkce+tarih+muzik)/6.0;
        
        System.out.println("\nNot Ortalamanız = " + ort);
        
        String gectikaldi = ort>=60 ? "Sınıfı geçti" : "Sınıfta kaldı";
        System.out.println(gectikaldi);


    }
}
