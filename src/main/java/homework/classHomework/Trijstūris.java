package homework.classHomework;

public class Trijstūris {
    double malaViens;
    double malaDivi;
    double malaTris;
    double s;
    double laukums;

   

    public Trijstūris(double malaViens, double malaDivi, double malaTris) {
        this.malaViens = malaViens;
        this.malaDivi = malaDivi;
        this.malaTris = malaTris;
        this.s = (malaViens + malaDivi + malaTris) / 2;

    }

    public Trijstūris() {
        System.out.println("Taisu trijstūri..");
    }

    public void printrijsturis(){
        System.out.println("Mala a ir: " + malaViens + " cm");
        System.out.println("Mala b ir: " + malaDivi + " cm");
        System.out.println("Mala c ir: " + malaTris + " cm");
    }
    public double trijsturaLaukumaAprekins(){
        s = (malaViens + malaDivi + malaTris) / 2;
        laukums = Math.sqrt(s * (s - malaViens) * (s - malaDivi) * (s - malaTris));
        return laukums;
    }
        public  boolean vienadasMalasTrijsturis(){

        if((malaViens == malaDivi) && (malaDivi == malaTris)){
            return true;
        }else {
           return false;
        }
    }

    public boolean vaiTrijsturimIrienadasSanuMalas(){
        if(malaViens == malaDivi || malaDivi == malaTris || malaViens == malaTris){
            return true;
        }else{
            return false;
        }
    }
}
