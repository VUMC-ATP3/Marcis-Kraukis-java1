package clasroomFive.pirmaisUzdevums.encapsulation;

public class Human {
    private int age;
    private double height;
    private String name;

    Human(){
        System.out.println("Uztaisam jaunu cilvēku!");
    }

    public Human(int age, double height, String name) {
        this.age = age;
        this.height = height;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
    if(age < 0){
        System.out.println("Vecums nedrīkst bū mazāks par 0!!!");
    }else {


        this.age = age;
    }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", height=" + height +
                ", name='" + name + '\'' +
                '}';
    }
}
