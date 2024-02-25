import java.util.Scanner;

public class ArtikYilHesaplama {
    public static void main(String[] args) {
        int yil;

        Scanner scanner= new Scanner(System.in);
        System.out.print("Yılı Giriniz : ");
        yil=scanner.nextInt();

        if (yil %4==0){
            System.out.print(yil + " Bir Artık Yıldır");
        }else System.out.print(yil + " Bir Artık Yıl Değildir");


    }
}
