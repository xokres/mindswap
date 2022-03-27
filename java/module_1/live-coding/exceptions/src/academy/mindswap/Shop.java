package academy.mindswap;

public class Shop {

    ProductType[] qqs = {ProductType.MILK, ProductType.COFFEE, ProductType.CHOCOLATE};

    public void buy(ProductType qq) {

       Product product =  ProductFactory.getProduct(ProductType.MILK,2);


    }
    public int price(ProductType productType) {
        return productType.getPrice();
    }
}
