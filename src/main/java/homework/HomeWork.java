package homework;

import java.util.Random;
import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int randomSkaitlis = rand.nextInt(50);
        int ievaditaisSkaitlis;
        int atlikusiMeginajumi = 10;

        System.out.println(randomSkaitlis);

        for (int i = 1; i <= 10; i++) {
            System.out.println("šī ir spēle. Jums jāuzmin skaitlis no 1 - 50! Jums ir 10 mēģinājumi,lai jums veicas!");
            ievaditaisSkaitlis = sc.nextInt();
            atlikusiMeginajumi--;
            if (ievaditaisSkaitlis == randomSkaitlis) {
                System.out.println("Apsveicu, jūs uzvarējāt! pareizais skaitlis ir - " + randomSkaitlis);
                break;
            }
            else if (i == 10) {
                    System.out.println("Jūs zaudējāt! Pareizais skaitlis bija - " + randomSkaitlis);
            }
            else if (ievaditaisSkaitlis > randomSkaitlis) {
                System.out.println("Jūsu skaitlis ir lielāks par random skaitli.");
                System.out.println("Šis ir jūsu - " + i + " mēģinājums!");
                System.out.println("Jums atlikuši - " + atlikusiMeginajumi + " mēģinājumi!");
            } else if (ievaditaisSkaitlis < randomSkaitlis) {
                System.out.println("Jūsu skaitlis ir mazāks par random skaitli.");
                System.out.println("Šis ir jūsu - " + i + " mēģinājums!");
                System.out.println("Jums atlikuši - " + atlikusiMeginajumi + " mēģinājumi!");

            }
        }


    }
}

