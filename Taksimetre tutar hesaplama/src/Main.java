import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        double kmBasinaTutar = 2.20,acilisUcreti=10.00,gidilenYol,toplamTutar;

        Scanner input = new Scanner (System.in);
        System.out.println("gidilen yolu km cinsinden giriniz :");
        gidilenYol = input.nextDouble();
        System.out.println("Km Basina Tutar :"+kmBasinaTutar);
        toplamTutar = ((gidilenYol*kmBasinaTutar)+acilisUcreti);

        toplamTutar = (toplamTutar < 20)? 20: toplamTutar;
        System.out.println("TOPLAM TUTAR:" + toplamTutar);








    }


}