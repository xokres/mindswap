package academy.mindswap;

public class CoffeeShop extends Object {
/*
    public Drink serveDrink(String drink) {

        switch (drink) {
            case DrinkType.MACCHIATO:
                return new Drink("coffee, milk");
            case DrinkType.MOCHA:
                return new Drink("coffee, chocolate syrup, milk");
            case DrinkType.FRAPUCCINO:
                return new Drink("coffee, milk, ice, caramel syrup");
            default:
                return new Drink("water");
        }
    }
*/
    public Drink serveDrink(DrinkType drink) {

        //return new Drink(drink.getIngredients());
        if (DrinkType.MACCHIATO_DT == drink) {
            return new Drink(drink.getIngredients());
        }


        if (DrinkType.MOCHA_DT  == drink) {
            return new Drink(drink.getIngredients());
        }

        return new Drink(DrinkType.WATER_DT.getIngredients());
    }

    public Drink serveDrink(DrinkTypeEnum drink) {

        //return new Drink(drink.getIngredients());
        switch (drink) {
            case MACCHIATO_ENUM:
                return new Drink(drink.getIngredients());
            case MOCHA_ENUM:
                return new Drink(drink.getIngredients());
            default:
                return new Drink(DrinkTypeEnum.WATER_ENUM.getIngredients());
        }

   /*     if (DrinkTypeEnum.MACCHIATO_ENUM == drink) {
            return new Drink(drink.getIngredients());
        }


        if (DrinkTypeEnum.MOCHA_ENUM  == drink) {
            return new Drink(drink.getIngredients());
        }
        */

      //  return new Drink(DrinkTypeEnum.WATER_ENUM.getIngredients());
    }

}
