
import java.util.Scanner;
public class Main 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Çalışanlar Programına Hoşgeldiniz..");
        String islemler = "İşlemler...\n"
                + "1.Yazılımcı işlermleri\n"
                + "2.Yönetici işlermleri\n"
                + "Çıkış için q'ya basın";
        System.out.println("*************************");
        System.out.println(islemler);
        System.out.println("*************************");
        
        while(true)
        {
            System.out.print("İşlemi seçiniz: ");
            String islem = input.nextLine();
            if (islem.equals("q"))
            {
                System.out.println("Programdan çıkılıyor...");
                break;
            }
            else if (islem.equals("1"))
            {
                Yazilimci yazilimci = new Yazilimci("Sümeyye", "Akay", 20, "Phyhon , Java");
                //yazılımcı işlemlerni sürekli yapmak için tekrardan bir while true döngüsü açarız
                String yazilimci_islem = "1.Format at \n"
                        + "2. Bilgileri göster\n"
                        + "Çıkış için q'ya basın..";
                System.out.println(yazilimci_islem);
                while (true) 
                {
                    System.out.println("İşlemi seçiniz.");
                    String y_islem = input.nextLine();
                    if (y_islem.equals("q")) 
                    {
                        System.out.println("Yazılımcı işleminden çıkılıyor..");
                        break; 
                    }
                    else if (y_islem.equals("1"))
                    {
                        System.out.print("İşletim sistemi: " );
                        String isletim_sistemi = input.nextLine();
                        yazilimci.formatAt(isletim_sistemi);
                    }
                    else if (y_islem.equals("2"))
                    {
                        yazilimci.bilgileriGoster();
                    }
                    else 
                    {
                        System.out.println("Geçersiz yazılımcı işlemi..");
                    }
                    
                }
            }
            else if (islem.equals("2"))
            {
                Yonetici yonetici = new Yonetici("Sum", "aky", 100, 10);
                String yonetici_islem = "Yonetici işlermleri\n"
                        + "1.Zam yap\n"
                        + "Bilgileri göster\n"
                        + "Çıkış için q'ya basınız..";
                System.out.println(yonetici_islem);
                while (true) 
                {
                    System.out.println("İşlemi seçiniz.");
                    String y_islem = input.nextLine();
                    if (y_islem.equals("q")) 
                    {
                        System.out.println("Yönetici işlemlerinden çıkılıyor..");
                        break; 
                    }
                    else if (y_islem.equals("1"))
                    {
                        System.out.print("Yöneticinin ne kadar zam yapmasını istiyorsunuz: : " );
                        int zam_miktari = input.nextInt();
                        input.nextLine();
                        yonetici.zamYap(zam_miktari);
                    }
                    else if (y_islem.equals("2"))
                    {
                        yonetici.bilgileriGoster();
                    }
                    else 
                    {
                        System.out.println("Geçersiz yönetici işlemi..");
                    }
                    
                }
                
            }
            else {
                System.out.println("Geçersiz işlem...");
            }
        }
        
                
    }
    
    
    
}
