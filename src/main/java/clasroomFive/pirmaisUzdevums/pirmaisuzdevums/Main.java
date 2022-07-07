package clasroomFive.pirmaisUzdevums.pirmaisuzdevums;


import clasroomFive.pirmaisUzdevums.encapsulation.Weather;
import clasroomFive.pirmaisUzdevums.pirmaisuzdevums.Autors;
import clasroomFive.pirmaisUzdevums.pirmaisuzdevums.Cena;
import clasroomFive.pirmaisUzdevums.pirmaisuzdevums.book;

public class Main {
    public static void main(String[] args) {
        Weather weather = new Weather();
        Autors JKRowling = new Autors("JK Rowling", "JK@gmail.com", 'F');
        Autors Rainis = new Autors("Jānis Rainis", "JR@gmail.com", 'M');

        Cena cena = new Cena(9.99, '€');
        book bookOne = new book("Harry Potter", "JKRowling", new Cena(15.99, '$'));
        book bookTwo = new book("Cits nosaukums", "Rainis", cena);
        System.out.println(bookTwo.toString());
        bookTwo.price.discount(30);
        System.out.println(bookTwo.toString());
        System.out.println(bookOne.author.toString());

    }
}
