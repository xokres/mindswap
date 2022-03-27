package academy.mindswap;

public enum DrinkTypeEnum {
    WATER_ENUM("Water"),
    MACCHIATO_ENUM("coffee, milk, sugar"),
    MOCHA_ENUM("coffee, chocolate syrup, milk, sugar"),
    FRAPUCCINO_ENUM("coffee, milk, sugar, foam");

    private String ingredients;

    private DrinkTypeEnum(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getIngredients() {
        return ingredients;
    }

}
