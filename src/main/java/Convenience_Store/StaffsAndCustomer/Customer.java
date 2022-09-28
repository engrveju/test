package Convenience_Store.StaffsAndCustomer;

import Convenience_Store.UserRoles.UserRole;

public class Customer extends ProfileImpl{

    private UserRole role = UserRole.CUSTOMER;
    public UserRole getRole() {return role;}
    public Customer(String firstName, String lastName) {
        super(firstName, lastName);
    }

}
