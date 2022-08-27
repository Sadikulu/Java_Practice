package day09_practice.restourant;

public class Mutfak {
    public String yemekler="Adanakebap, urfaciger, kusbasi, kusleme";
    public String arasıcak="yaylacorba, mercimek, duguncorba, corba";
    public String tatli="baklava, sutlac, gullac, kazandibi, kunefe";
    public String icecek="ayran, salgam, kola";

    public Mutfak(String adanakebap, String mercimek, String kunefe, String salgam) {
        this.yemekler="adanakebap";
        this.arasıcak="mercimek";
        this.tatli="kunefe";
        this.icecek="salgam";
    }

    public Mutfak() {

    }

    @Override
    public String toString() {
        return
                "\nyemekler=" + yemekler +
                "\narasıcak=" + arasıcak +
                "\ntatli=" + tatli +
                "\nicecek=" + icecek;
    }
}
