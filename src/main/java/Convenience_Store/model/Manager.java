package Convenience_Store.model;

import Convenience_Store.Enums.UserRole;

public class Manager extends ProfileImpl{

    private UserRole role = UserRole.MANAGER;
    public Manager(String firstName, String lastName) {
        super(firstName, lastName);
    }

    //@Override
    public UserRole getRole() {return role;}
}
