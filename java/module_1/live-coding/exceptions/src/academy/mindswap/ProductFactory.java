package academy.mindswap;

public class ProductFactory {


    public static Product getProduct(ProductType productType, int percentage) {
        if (productType == null) {
            return null;
        }
        switch (productType) {
            case MILK ->  new Milk(ProductType.MILK.getPrice() * percentage);
            case COFFEE ->  new Coffee(ProductType.COFFEE.getPrice()* percentage);
            case CHOCOLATE ->  new Chocolate(ProductType.CHOCOLATE.getPrice() *  percentage);
        }
        return null;
    }
}
