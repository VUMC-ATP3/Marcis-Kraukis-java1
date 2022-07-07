package homework.oop_homework;

import java.util.Date;

public class Example {
    public static void main(String[] args) {

        Customer customer = new Customer("Marcis");
        customer.setMember(true);
        customer.setMemberType("Gold");
        System.out.println(customer.toString());

        Visit visit = new Visit(customer, new Date());
        visit.setProductExpense(20);
        visit.setServiceExpense(200);
        System.out.println(visit.toString());
    }
}
