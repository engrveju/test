package Convenience_Store.StaffsAndCustomer;


import Convenience_Store.UserRoles.UserRole;

public class Applicant  extends ProfileImpl{

    private UserRole role = UserRole.APPLICANT;
    private int Ages;

    public UserRole getRole() {return role;}
    public void setRole(UserRole role) {this.role = role;}
    public int getAges() {return Ages;}


    public Applicant(String firstName, String lastName, int age) {
        super(firstName, lastName);
        this.Ages =age;
    }

    public String viewProfile(){
        return "Name: " + this.getFirstName() +" "+ this.getLastName() + "\t" +"Role: " + this.getRole();
    }
}
