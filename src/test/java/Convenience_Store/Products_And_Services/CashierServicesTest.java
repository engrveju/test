package Convenience_Store.Products_And_Services;

import static org.junit.jupiter.api.Assertions.*;

class CashierServicesTest {


    CashierServices cashier = new CashierServices();

    @org.junit.jupiter.api.Test
    void buy() {
    }

    @org.junit.jupiter.api.Test
    void sell() {
        ProductList item = new ProductList();
        assertEquals("Please take your APPLE. \nHere is your receipt:" +
                        "\nitem: APPLE, price: 750",cashier.sell("apple"),
                "The item is not available");
    }
}