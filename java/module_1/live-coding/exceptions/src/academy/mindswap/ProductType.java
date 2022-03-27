package academy.mindswap;

public enum ProductType {

    MILK(12),
    COFFEE(15),
    CHOCOLATE(12);
    int price;

    ProductType(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
