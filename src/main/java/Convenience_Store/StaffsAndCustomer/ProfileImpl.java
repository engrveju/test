package Convenience_Store.StaffsAndCustomer;

import Convenience_Store.UserRoles.UserRole;

public abstract class ProfileImpl implements Profile{
    private String firstName;
    private String lastName;
    private UserRole role;


    public ProfileImpl(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
    }
    public String getFirstName() {return firstName;}
    public String getLastName() {return lastName;}
    public UserRole getRole() {return role;}
    public void setFirstName(String firstName) {this.firstName = firstName;}

    public void setLastName(String lastName) {this.lastName = lastName;}

    public void setRole(UserRole role) {this.role = role;}

    public String viewProfile(){
        return "Name: " + this.getFirstName() +" "+ this.getLastName() + "\t" +"Role: " + this.getRole();
    }
}
