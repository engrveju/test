package Convenience_Store.model;
import Convenience_Store.Enums.UserRole;

public class Cashier extends ProfileImpl {
    private UserRole role = UserRole.CASHIER;
    private int Ages;
//
    public int getAges() {return Ages;}
    public UserRole getRole() {return role;}

    public Cashier(String firstName, String lastName, int age) {
        super(firstName, lastName);
        this.Ages =age;
    }

    public String viewProfile(){
        return "Name: " + this.getFirstName() +" "+ this.getLastName() + "\t" +"Role: " + this.getRole();
    }
}
