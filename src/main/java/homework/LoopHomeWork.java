package homework;

import java.util.Arrays;
import java.util.Scanner;

public class LoopHomeWork {
    public static void main(String[] args) {
        Scanner skeneris = new Scanner(System.in);

        //1.Uzdevums

//    int skaitlis;
//    int summa = 0;
//    do{
//        System.out.println("Lūdzu ievadi skaitli!");
//        skaitlis = skeneris.nextInt();
//       if(skaitlis < 100){
//           summa += skaitlis;
//       }
//    }while(summa < 100);
//        System.out.println("Gatavs!");
//        System.out.println(summa);

        //2.Uzdevums

//        int pirmskaitlis;
//        int count = 0;
//        System.out.println("Lūdzu ievadi skaitli!");
//        pirmskaitlis = skeneris.nextInt();
//
//        for(int i = 1; i <= pirmskaitlis; i++) {
//            if( pirmskaitlis % i == 0){
//                count++;
//            }
//        }
//        if(count == 2) {
//            System.out.println("Skaitlis: " + pirmskaitlis + " ir pimskaitlis!");
//        }
//        else {
//            System.out.println("Skaitlis " + pirmskaitlis + " nav pirmskaitlis!");
//        }


        // 3.uzdevums

        int[] skaitli = {1,3,5,6,7,10};
        String [] pilsetas = {"Liepāja", "Ventspils", "kolka", "Roja", "Jūrmala"};
        char [] burti = {'a', 'b', 'c', 'd', 'e'};


        // while
//    whileSkaitluMasivs(skaitli);
//    whileVarduMasivs(pilsetas);
//    whileBurtuMasivs(burti);

        //do while
//        doWhileSkaitluMasivs(skaitli);
//        doWhileVarduMasivs(pilsetas);
//        doWhileBurtuMasivs(burti);

        //for cikls
//        forSkaitluMasivs(skaitli);
//        forVarduMasivs(pilsetas);
//        forBurtuMasivs(burti);

        // for each
//          forEachSkaitluMasivs(skaitli);
//          forEachVarduMasivs(pilsetas);
//          forEachBurtuMasivs(burti);

        // 4.Uzdevums
//        int[] simts = new int[100];
//        for(int i = 0; i < simts.length; i=i+2){
//            simts[i] = i + 2;
//            System.out.print(" " + simts[i]);
//        }

        //5.Uzdevums
//        int i = 1;
//        int  fact = 1;
//        int number;
//        System.out.println("Lūdzu ievadi skaitli!");
//        number = skeneris.nextInt();
//
//        do{
//
//            fact = fact * i;
//            i++;
//        }while(i <= number);

//        for(int i = 1; i <= number; i++){
//            fact = fact * i;
//        }
     //   System.out.println("Faktoriāls skaitlis no: " + number + " = " + fact);

        // 6.Uzdevums

        final int pin = 123456;
        int meginajumi = 0;
        int parole;

        while(meginajumi < 3){
            meginajumi++;
            System.out.println(meginajumi + ". Ievadi lūdzu pin kodu!");
            parole = skeneris.nextInt();
            if(pin == parole){
                System.out.println("PIN ir pieņemts, laipni lūdzam atpakaļ!");
                break;
            }else {
                System.out.println("Nepareizs PIN, mēģiniet vēlreiz!");
            }
        }
        if(meginajumi >= 3){
            System.out.println("Atvainojiet, bet jūs esat bloķēts!");
        }

    }

    static void whileSkaitluMasivs(int[]kautKas){
    int i = 0;
    while(i < kautKas.length){
        System.out.println(kautKas[i]);
        i++;
    }
}
    static void whileVarduMasivs(String[]kas) {
    int i = 0;
    while (i < kas.length) {
        System.out.println(kas[i]);
        i++;
    }
}
    static void whileBurtuMasivs(char[]kaut) {
    int i = 0;
    while (i < kaut.length) {
        System.out.println(kaut[i]);
        i++;
    }
}

    static void doWhileSkaitluMasivs(int[]cipari){
    int a = 0;

    do{
        System.out.println(cipari[a]);
        a++;
    }while(a < cipari.length);

}
    static void doWhileVarduMasivs(String[]vardi){
    int a = 0;

    do{
        System.out.println(vardi[a]);
        a++;
    }while(a < vardi.length);

}
    static void doWhileBurtuMasivs(char[]jauns){
    int a = 0;

    do{
        System.out.println(jauns[a]);
        a++;
    }while(a < jauns.length);

}

    static void forSkaitluMasivs(int[]num){

        for(int c = 0; c < num.length; c++){
            System.out.println(num[c]);
        }
}
    static void forVarduMasivs(String[]name){
       for(int c = 0; c < name.length; c++){
           System.out.println(name[c]);
       }
   }
    static void forBurtuMasivs(char[]symbols){
       for(int c = 0; c < symbols.length; c++){
           System.out.println(symbols[c]);
       }
   }

    static void forEachSkaitluMasivs(int[]add){
        for(int i : add) {
            System.out.println(i);
        }
    }
    static void forEachVarduMasivs(String[]city){
        for(String i : city) {
            System.out.println(i);
        }
    }
    static void forEachBurtuMasivs(char[]sign){
        for(char i : sign) {
            System.out.println(i);
        }
    }



}
