package Convenience_Store;


import Convenience_Store.Products_And_Services.ProductList;
import Convenience_Store.StaffsAndCustomer.Manager;

public class Main {
    public static void main(String[] args) {
        Manager ekene = new Manager("Ekene", "Odo");
       String p = ekene.viewProfile();
        System.out.println(p);

        ProductList item = new ProductList();

        for(int i = 0; i<=item.productList.size()-1;i++){
            System.out.println(item.productList.get(i));
        }
    }
}