package Convenience_Store.Products_And_Services;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerCartTest {

    CashierServicesImpl serve = new CashierServicesImpl();
    @Test
    void buy() {
        assertEquals("Please take your APPLE. \nHere is your receipt:" +
                        "\nitem: APPLE, price: 750",serve.sell("apple"),
                "The item is not available");
    }

    @Test
    void sell() {
    }
}