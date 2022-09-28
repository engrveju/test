package Convenience_Store.Products_And_Services;

public class CustomerCart{
    private CashierServicesImpl serve = new CashierServicesImpl();
    public String buy(String item){
        return serve.sell(item);
    }

}
