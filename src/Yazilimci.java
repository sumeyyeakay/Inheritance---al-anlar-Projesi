/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sumeyyeakay
 */
public class Yazilimci extends Calisan
{
    private String diller;
    //Const.
    public Yazilimci(String ad, String soyad, int id, String diller) {
        super(ad, soyad, id);
        this.diller = diller;
    }
    public void formatAt(String isletim_sistemi)
    {
        System.out.println(getAd() + " " + isletim_sistemi + " ni yüklüyor...");
    }

    @Override // üst sınıfın  bilgileri göster metodunu override ettik
    public void bilgileriGoster() {
        super.bilgileriGoster(); 
        System.out.println("Yazılımcının bildiği diller: " + diller);
    }
    
    
}
