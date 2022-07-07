package clasroomFive.pirmaisUzdevums.encapsulation;

public class Main {
    public static void main(String[] args) {
        Weather weather = new Weather();
        weather.printWeather();
        //weather.metodeDivi(); Nevar izskaukt, jo ir privāta metode!
        weather.metodeTris();
        weather.isRaining = true;
        weather.temperatureAtNight = 13.5;


        Human cilveks = new Human();
        Human cilveks2 = new Human();
        Human cilveks3 = new Human(12,154.2,"Pēteris");

//      //  System.out.println(cilveks3.toString());
//        cilveks3.setAge(14);//Uzstāda vecumu manuāli
////        System.out.println(cilveks3.getAge());//Izvada uzstādīto vecumu
////        System.out.println(cilveks3.getName());
//        cilveks3.setAge(-5);
//        System.out.println(cilveks3.toString());
//        cilveks3.setAge(18);
//        System.out.println(cilveks3.toString());

        Rinkis rinkis = new Rinkis();

        rinkis.setRadiuss(2.0);

        Rinkis rinkis2 = new Rinkis(3.0, "blue");
        rinkis2.setKrasa("zaļa");


    }
}
