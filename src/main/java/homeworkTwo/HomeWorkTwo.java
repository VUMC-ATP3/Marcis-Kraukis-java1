package homeworkTwo;

import java.util.Scanner;

public class HomeWorkTwo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 1.uzdevums
        int x = 9;

        System.out.println(x > 5);
        System.out.println(x < 5);
        System.out.println(x > 5 && x <= 10);
        System.out.println(x >= 5 || x < 10);
        System.out.println(x == 0 || x == 10);
        System.out.println(x*x > 10);

        // 2. Uzdevums
        System.out.println("Lūdzu ievadi skaitli no 1 - 12!");
        String menesaNosaukums;
        int menesis = scanner.nextInt();

        switch (menesis){
            case 1:
                menesaNosaukums = "Janvāris";
                break;
            case 2:
                menesaNosaukums = "Februāris";
                break;
            case 3:
                menesaNosaukums = "Marts";
                break;
            case 4:
                menesaNosaukums = "Aprīlis";
                break;
            case 5:
                menesaNosaukums = "Maijs";
                break;
            case 6:
                menesaNosaukums = "Jūnijs";
                break;
            case 7:
                menesaNosaukums = "Jūlijs";
                break;
            case 8:
                menesaNosaukums = "Augusts";
                break;
            case 9:
                menesaNosaukums = "Septembris";
                break;
            case 10:
                menesaNosaukums = "Oktobris";
                break;
            case 11:
                menesaNosaukums = "Novembris";
                break;
            case 12:
                menesaNosaukums = "Decembris";
                break;
            default:
                menesaNosaukums = "Nezināms mēnesis";
        }
        System.out.println(menesaNosaukums);


        // 3. uzdevums
        System.out.println("Lūdzu ievadi trīs skaitļus!");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if(a > b && a > c){
            System.out.println("Lielākais skaitlis ir: " + a);
        }
        else if(b > c && b > a){
            System.out.println("Lielākais skaitlis ir: " + b);
        }
        else if(c > a && c > b){
            System.out.println("Lielākais skaitlis ir: " + c);
        }
        else if(a == b || a == c){
            System.out.println("Šis skaitlis  atkārtojas: " + a);
        }
        else{
            System.out.println("Šis skaitlis  atkārtojas: " + b);
        }
        // 4. uzdevums luksafors
        luksafors();

        //5. uzdevums vizītkarte
        printBussinesCard();
        printBussinesCard();
        printBussinesCard();

        //6.uzdevums vizītkarte divi
        printBusinessCardTwo("Mārcis","Krauķis", 2233222,1990);
        printBusinessCardTwo("Jānis","Bērziņš",433535,1960);

        // 7.uzdevums metode sum
        int summa = sum(4,5);
        System.out.println(summa);

        //8. uzdevums metode average
        System.out.println(average(7,9,6));
    }
    static void luksafors()
    {
        Scanner scanner = new Scanner(System.in);
        String zals = "zaļš";
        String dzeltens = "dzeltens";
        String sarkans = "sarkans";

        System.out.println("Lūdzu ievadi kādu no luksafora krāsām!");
        String krasa = scanner.nextLine();

        if (zals.equals(krasa)) {
            System.out.println("Jūs varat braukt!");
        } else if (dzeltens.equals(krasa)) {
            System.out.println("Gatavojieties braukt!");
        } else if (sarkans.equals(krasa)) {
            System.out.println("Jūs nevarat braukt!");
        } else {
            System.out.println("luksafors ir saplīsis!");
        }
    }

    static void printBussinesCard(){
        System.out.println("Vizītkarte" +  "\n" + "##########" + "\n" + "Vārds: Mārcis" + "\n" + "Uzvārds: Krauķis" +
                "\n" + "Telefona numurs: 2222200" + "\n" + "Dzimšanas gads: 1990" + "\n" + "##########");
    }

    static void printBusinessCardTwo(String name, String surname, int telephone, int dateOfBirth){
        System.out.println("Vizītkarte" +  "\n" + "##########" + "\n" + "Vārds: " + name + "\n" + "Uzvārds: " + surname +
        "\n" + "Telefona numurs: +371 " + telephone + "\n" + "Dzimšanas gads: " + dateOfBirth + "\n" + "##########");
    }

    static int sum(int a, int b){
        int kopSumma = a + b;
        return kopSumma;
    }

    static double average(double a, double b, double c){
        double videjais = (a + b + c) / 3;
        return videjais;
    }
}
