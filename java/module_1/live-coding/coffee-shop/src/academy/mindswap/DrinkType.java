package academy.mindswap;

public class DrinkType {
   /* public static final String WATER = new String("water");
    public static final String MACCHIATO = "Macchiato";
    public static final String MOCHA = "Mocha";
    public static final String FRAPUCCINO = "Frapuccino";*/

    public static final DrinkType WATER_DT = new DrinkType("water");
    public static final DrinkType MACCHIATO_DT = new DrinkType("coffee, milk, sugar");
    public static final DrinkType MOCHA_DT = new DrinkType("coffee, chocolate syrup, milk, sugar");
    public static final DrinkType FRAPUCCINO_DT = new DrinkType("coffee, milk, sugar, foam");
    public static  DrinkType CHANGE_ME = new DrinkType("coffee, milk, sugar, foam"); //not final! can change it from outside

    private String ingredients;

    private DrinkType(String ingredients) {
        this.ingredients = ingredients;
    }


    public String getIngredients(){
        return ingredients;
    }
}
