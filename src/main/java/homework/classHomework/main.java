package homework.classHomework;

public class main {
    public static void main(String[] args) {
     Trijstūris bermunda = new Trijstūris();
        bermunda.malaViens = 4;
        bermunda.malaDivi = 6;
        bermunda.malaTris = 9;
        bermunda.printrijsturis();
        System.out.println("Vai trijstūris ir vienādmalu? - " + bermunda.vienadasMalasTrijsturis());
        System.out.println("Vai trijstūra sānu malas ir vienādas? - " + bermunda.vaiTrijsturimIrienadasSanuMalas());

        Trijstūris trisMalu = new Trijstūris(6,6,6);
        System.out.println("Trijstūra laukums ir: " + trisMalu.trijsturaLaukumaAprekins() + " cm\u00B2");
        System.out.println("Vai trijstūris ir vienādmalu? - " + trisMalu.vienadasMalasTrijsturis());
        System.out.println("Vai trijstūra sānu malas ir vienādas? - " + trisMalu.vaiTrijsturimIrienadasSanuMalas());

    }

}
