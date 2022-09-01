package day14_practice.oop.cons;

public class Book {
    public String name;
    public int pageNumber;
    public String auther;
    public String publisher;
    public double price;

    public Book(String name, int pageNumber, String auther, String publisher, double price) {
        this.name = name;
        this.pageNumber = pageNumber;
        this.auther = auther;
        this.publisher = publisher;
        this.price = price;
    }

    public Book() {

    }

    public static void main(String[] args) {
        Book book1 = new Book();
        book1.name = "Şeker Portakalı";
        book1.pageNumber = 180;
        book1.auther = "Jose Mauro de Vasconceles";
        book1.publisher = "Can Yayınları";
        book1.price = 25;
        Book book2 = new Book("Kiraz Mevsimi",145,"Sadık Uluçay","ABC Yayınları",32);

    }
}
