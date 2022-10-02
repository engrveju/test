package Convenience_Store.Products_And_Services;

import Convenience_Store.model.Applicant;
import Convenience_Store.model.Cashier;
import Convenience_Store.model.Manager;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManagerServicesImplTest {

    ManagerServicesImpl employ = new ManagerServicesImpl();

    Manager manager = new Manager("Emmanuel","Eze");
    Applicant applicant1 = new Applicant("Peter","Okowa",210);
    Cashier applicant2 = new Cashier("Peter","Okowa",25);

    @Test
    void hire() {
        assertEquals("Congratulations Peter Okowa your application is successful. You are now our CASHIER",
                employ.hire(applicant1),"The applicant is below 18 years");
    }

    @Test
    void viewProfile() {
        assertEquals("Name: Peter Okowa\tRole: CASHIER",applicant2.viewProfile());
    }
}