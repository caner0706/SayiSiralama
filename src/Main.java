import java.util.Scanner;

public class Main {
    
    public static void main(String[]args){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Kaç Tane Sayı Gireceksiniz : ");
        
        int adet = scanner.nextInt();
        double enBuyuk = Double.MIN_VALUE;
        double enKucuk = Double.MAX_VALUE;
        
        for(int i = 1;i<= adet;i++){
            System.out.print(i + ". Sayıyı Girin : ");
            double sayi = scanner.nextDouble();     
            
            if(sayi>enBuyuk){
                enBuyuk = sayi;
            }
            if(sayi<enKucuk){
                enKucuk = sayi;
            }

        }
        
        System.out.println("Girilen En Büyük Sayı : "  + enBuyuk);
        System.out.println("Girilen En Küçük Sayı : "  + enKucuk);
    }
}
