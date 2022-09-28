package Convenience_Store.Products_And_Services;

public class CashierServices{

    private ProductList myProduct = new ProductList();


    public String sell(String items){
        String item = items.toUpperCase();
        if(myProduct.productList.contains(item)){
            Receipt thisReceipt = new Receipt(item);
            return "Please take your "+ item +". \nHere is your receipt:\n"+
                    thisReceipt.yourReceipt(item);
        }else {
            return "Sorry "+items+" is out of stock!";
        }
    }
}
