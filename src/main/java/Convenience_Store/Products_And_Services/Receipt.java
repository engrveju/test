package Convenience_Store.Products_And_Services;

public class Receipt {
    public String name;

    public Receipt(String item){
        this.name = item;
    }

    public String yourReceipt(String item){

        return "item: "+name + ", price: "+ name.length()*150;
    }
}
