import java.util.Scanner;

public class harmonikHesap {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);

        System.out.println("lütfen bir sayı giriniz:" );
        int n= inp.nextByte();
        double result=0.0;

        for (double i=1; i<=n;i++){

            result+=(1.0/i);
        }
        System.out.println(result);
    }
}
