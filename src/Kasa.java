public class Kasa {
    int toplamSatisMiktari;
    double gunlukKar;
    double salatalardaEldeEdilenKar;
    int tatliSayisi;
    int salataSayisi;



    public Kasa(){

        System.out.println("Hoş geldin");
    }
    public Kasa(String isim) {
        System.out.println("Hoş geldin" + isim);

    }


    }

    public void hesapla (int secim, double fiyat){
        topSatHesapla();
        gunlukKrHesapla();
    }
     private void topSatHesapla(double fiyat){

        toplamSatisMiktari = toplamSatisMiktari+fiyat;
     }
     private void gunlukKrHesapla(int secim, double fiyat){
        gunlukKar += secim.

        if secim= salata(){
            salataKari(0.3);
         }
        if secim= tatli(){
            tatliSayisiArttir();
         }

     }
     private void salataKari(double kar){
        salatalardaEldeEdilenKar += kar

     }
     private void tatliSayisiArttir(){
        tatliSayisi +=1;
     }
     public void fisYazdir(){
         System.out.println(toplamSatisMiktari);
         System.out.println(gunlukKar);
         System.out.println(sala);
         System.out.println(tatliSayisi);
     }

    public int getToplamSatisMiktari() {

    return toplamSatisMiktari;
    }

    public void setToplamSatisMiktari(int toplamSatisMiktari) {

    this.toplamSatisMiktari = toplamSatisMiktari;
    }

    public double getGunlukKar() {
        return gunlukKar;
    }

    public void setGunlukKar(double gunlukKar) {

    this.gunlukKar = gunlukKar;
    }

    public double getSalatalardaEldeEdilenKar() {
        return salatalardaEldeEdilenKar;
    }

    public void setSalatalardaEldeEdilenKar(double salatalardaEldeEdilenKar) {
        this.salatalardaEldeEdilenKar = salatalardaEldeEdilenKar;
    }

    public int getTatliSayisi()
    {
        return tatliSayisi;
    }

    public void setTatliSayisi(int tatliSayisi) {
        this.tatliSayisi = tatliSayisi;
    }

    public int getSalataSayisi() {
        return salataSayisi;
    }

    public void setSalataSayisi(int salataSayisi) {
        this.salataSayisi = salataSayisi;
    }

    public Kasa(int toplamSatisMiktari, double gunlukKar, double salatalardaEldeEdilenKar, int tatliSayisi, int salataSayisi) {
        this.toplamSatisMiktari = toplamSatisMiktari;
        this.gunlukKar = gunlukKar;
        this.salatalardaEldeEdilenKar = salatalardaEldeEdilenKar;
        this.tatliSayisi = tatliSayisi;
        this.salataSayisi = salataSayisi;
    }
}
