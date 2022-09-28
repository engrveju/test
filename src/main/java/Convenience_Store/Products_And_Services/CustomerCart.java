package Convenience_Store.Products_And_Services;

public class CustomerCart{
    private CashierServices serve = new CashierServices();
    public String buy(String item){
        return serve.sell(item);
    }

}
