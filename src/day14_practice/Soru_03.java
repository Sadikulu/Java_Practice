package day14_practice;

public class Soru_03 {
    /*
    3.SORU :
    Kullanicidan 2 sayi girmesini isteyecegiz, girilen bu degerlerden biri saati digeri de dakikayi temsil edecek.
    bize akrep ile yelkovan arasindaki kucuk aciyi hesaplayip degeri acisal olarak donduren metodu yaziniz
    Ornek :
    input : hour : 12,  minutes : 30
    Output: 165
 */
    public static void main(String[] args) {
        double hour = 20;
        double minutes = 30;

        System.out.println("Akrep ile Yelkovan arasindaki aci farki : " + aciAkrepYelkovanFarki(hour, minutes));

    }

    public static double aciAkrepYelkovanFarki(double hour, double minutes) {
        double aci = 0;
        // TODO
        double dakikaAci=0;
        double saatAci=0;
        if (hour>11){
            hour=hour-12;
        }
        dakikaAci=6*minutes;
        saatAci=hour*30+0.5*minutes;
        aci=dakikaAci-saatAci;
        if (aci<0) {
            aci*=-1;
        }
        if(aci>180){
            aci=360-aci;
        }
        return aci;
    }
}
