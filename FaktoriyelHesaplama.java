import java.util.Scanner;

public class FaktoriyelHesaplama {
    public static void main(String[] args) {

        int sayi,total=1;

        Scanner input = new Scanner(System.in);
        System.out.print("Son Sayiyi giriniz: ");
        sayi = input.nextInt();

        for (int i = 1; i<=sayi; i++) {
            total=total*i;
        }
        System.out.println(sayi+ "!=" + total);
    }
}

