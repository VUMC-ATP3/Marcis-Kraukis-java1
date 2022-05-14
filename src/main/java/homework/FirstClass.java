package homework;

public class FirstClass {
    public static void main(String[] args) {

        String valsts = "Latvija";
        double population = 1.902;
        float platiba = 64.589F;
        String capital = "Rīga";
        String valoda = "Latviešu";
        boolean isInEu = true;
        char valuta = '€';

        System.out.println("Valsts: " + valsts);
        System.out.println("Iedzīvotāju skaits: " + population+ "miljoni");
        System.out.println("Platība: " + platiba + "km\u00B2");
        System.out.println("Galvaspilsēta: " + capital);
        System.out.println("Valsts valoda: " + valoda);
        System.out.println("Eiropas savienības dalībvalsts: " + isInEu);
        System.out.println("Valsts valūta: Euro "+ "("+ valuta+")");
        System.out.println("\n");

        System.out.println(valsts + " ir valsts Ziemeļeiropā, Baltijas jūras austrumu krastā. Valsts galvaspilsēta ir \n"
        + capital+". Latvijas platība ir "+ platiba + "km\u00B2. Iedzīvotāju skaits 2018 gada sākumā bija " + population+ "miljoni.\n" +
                valoda + " valoda ir oficiālā valsts valoda. \nNo 2014. gada 14. janvāra" +
                " par Latvijas oficiālo maksāšanas līdzekli kļuva eiro" + "("+valuta + ")." );
        int saskaitisana;
        float saskaitisana2;
        double saskaitisana3;

        int atnemsana;
        float atnemsana2;
        double atnemsana3;

        int reizinasana;
        float reizinasana2;
        double reizinasana3;

        double dalisana;
        float dalisana2;
        double dalisana3;

        int atlikums;

        int x = 9;
        int y = 7;
        double k = 9;
        double l = 7;
        System.out.println("x = 9\ny = 7");
        saskaitisana = x + y;
        atnemsana = x - y;
        reizinasana = x * y;
        dalisana = k / l;
        atlikums = x % y;
        System.out.println("x + y = "+ saskaitisana);
        System.out.println("x - y = "+ atnemsana);
        System.out.println("x * y = "+ reizinasana);
        System.out.println("x / y = "+ dalisana);
        System.out.println("x % y = "+ atlikums);
        System.out.println("\n");

        float a = 8.3F;
        float b = 4.7F;
        System.out.println("a = 8.3\nb = 4.7");
        saskaitisana2 = a + b;
        atnemsana2 = a - b;
        reizinasana2 = a * b;
        dalisana2 = a / b;
        System.out.println("a + b = "+ saskaitisana2);
        System.out.println("a - b = "+ atnemsana2);
        System.out.println("a * b = "+ reizinasana2);
        System.out.println("a / b = "+ dalisana2);
        System.out.println("\n");

        double d = 44.3;
        double c = 15.7;
        System.out.println("d = 44.3\nc = 15.7");
        saskaitisana3 = d + c;
        atnemsana3 = d - c;
        reizinasana3 = d * c;
        dalisana3 = d / c;
        System.out.println("d + c = "+ saskaitisana3);
        System.out.println("d - c = "+ atnemsana3);
        System.out.println("d * c = "+ reizinasana3);
        System.out.println("d / c = "+dalisana3);



    }
}
