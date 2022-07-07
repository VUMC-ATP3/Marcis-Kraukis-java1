package homework.oop_homework;

public class Customer {
    private boolean member = false;
    private String name;
    private String memberType;

    public Customer(String name){
        this.name = name;
    }

    public boolean isMember() {
        return member;
    }

    public String getName() {
        return name;
    }

    public String getMemberType() {
        return memberType;
    }

    public void setMember(boolean member) {
        this.member = member;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "member=" + member +
                ", name='" + name + '\'' +
                ", memberType='" + memberType + '\'' +
                '}';
    }
}
