package Convenience_Store;


import Convenience_Store.Products_And_Services.*;
import Convenience_Store.StaffsAndCustomer.Applicant;
import Convenience_Store.StaffsAndCustomer.Cashier;
import Convenience_Store.StaffsAndCustomer.Manager;

public class Main {
    private static ManagerServices managerServices = new ManagerServicesImpl();
    private static CashierServices cashierServices = new CashierServicesImpl();
    public static void main(String[] args) {
        Applicant applicant1 = new Applicant("Uche","Eze", 25);
        Applicant applicant2 = new Applicant("Peter","Philips", 15);

        String applicant1_Result = managerServices.hire(applicant1);
        String applicant2_Result = managerServices.hire(applicant2);

        System.out.println(applicant1_Result);
        System.out.println(applicant2_Result);

        System.out.println("\n----------------------------------------------------------\n");

        String sales = cashierServices.sell("fridge");
        System.out.println(sales);

        System.out.println("\n----------------------------------------------------------\n");
        }
    }
