package Convenience_Store;


import Convenience_Store.Interfaces.CashierServices;
import Convenience_Store.Interfaces.ManagerServices;
import Convenience_Store.Products_And_Services.CashierServicesImpl;
import Convenience_Store.Products_And_Services.ManagerServicesImpl;
import Convenience_Store.model.Applicant;

public class Main {
    private static ManagerServices managerServices = new ManagerServicesImpl();
    private static CashierServices cashierServices = new CashierServicesImpl();
    public static void main(String[] args) {
        Applicant applicant1 = new Applicant("Uche","Eze", 25);
        Applicant applicant2 = new Applicant("Peter","Philips", 15);


        System.out.println(applicant2.viewProfile());
        System.out.println(applicant1.viewProfile());

        System.out.println("\n----------------------------------------------------------\n");

        String applicant1_Result = managerServices.hire(applicant1);
        String applicant2_Result = managerServices.hire(applicant2);

        System.out.println(applicant1_Result);
        System.out.println(applicant2_Result);

        System.out.println("\n----------------------------------------------------------\n");

        System.out.println(applicant2.viewProfile());
        System.out.println(applicant1.viewProfile());

        System.out.println("\n----------------------------------------------------------\n");

        String sales = cashierServices.sell("phone");
        System.out.println(sales);

        System.out.println("\n----------------------------------------------------------\n");
        }
    }
