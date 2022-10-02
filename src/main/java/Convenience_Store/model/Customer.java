package Convenience_Store.model;

import Convenience_Store.Enums.UserRole;

public class Customer extends ProfileImpl{

    private UserRole role = UserRole.CUSTOMER;
    public UserRole getRole() {return role;}
    public Customer(String firstName, String lastName) {
        super(firstName, lastName);
    }

}
