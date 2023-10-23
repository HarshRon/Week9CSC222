public class Product {
    private int itemNum;
    private double price;
    Product(int num, double pr)
    {
        itemNum = num;
        price = pr;
    }
    public int getItemNum()
    {
        return itemNum;
    }
    public double getPrice()
    {
        return price;
    }
}
