public class Deneme
{
    public static void main(String[] args) {
        yemek salata = new yemek();
        yemek hamburger = new yemek();
        yemek pizza = new yemek();
        yemek tatli = new yemek();

        Yemek salata = new Yemek();
        salata.Indis=1;
        salata.yiyecekTuru= "Salata";
        salata.karOrani=30/100;


        Yemek hamburger = new Yemek();
        hamburger.Indis=2;
        hamburger.yiyecekTuru="Hamburger";
        hamburger.karOrani=25/100;


        Yemek pizza = new Yemek();
        pizza.Indis=3;
        pizza.yiyecekTuru="Pizza";
        pizza.karOrani=35/100;


        Yemek tatli = new Yemek();
        tatli.Indis=4;
        tatli.yiyecekTuru="Tatli";
        tatli.karOrani=20/100;



        int menuSecim=input.nextInt();

        //if (menuSecim==salata.Indis){
        switch ()
            case(menuSecim==1){
            System.out.println("salata tutarını giriniz");
            int salataTutari= input.nextInt();

            case(menuSecim==2){
                System.out.println("hamburger tutarını giriniz");
                int hamburgerTutari=input.nextInt();
            }

            case(menuSecim==3){
                System.out.println("pizza tutarını giriniz");
                int pizzaTutari=input.nextInt();
            }

            case(menuSecim==4){
                System.out.println("tatli tutarını giriniz");
                int tatliTutari=input.nextInt();
            }

            case(menuSecim==5){
                break;

            }

        }








        kasiyer1;
        kasiyer1 = new Kasiyer();
        kasiyer2 = new Kasiyer(Ayse);

        kasiyer1.isVakti;
        kasiyer2.isVakti;
    }
}
