public class ObjectArray {
    public static void main(String[] args)
    {
        Product[] products = new Product[5];
        int x;
        for(x = 0; x < products.length; ++x)
            products[x] = new Product(x, 10.99);
        for(x = 0; x < products.length; ++x)
            System.out.println(products[x].getItemNum() + "   " + products[x].getPrice());
    }
}
