package academy.mindswap;

public class Main {

    public static void main(String[] args) {
	// write your code here

        CoffeeShop coffeeShop = new CoffeeShop();
        Drink myDrink =  coffeeShop.serveDrink(DrinkType.MOCHA_DT);
      //  Drink myDrink2 =  coffeeShop.serveDrink(DrinkType.FRAPUCCINO);
        Drink myDrink3 =  coffeeShop.serveDrink(DrinkType.MACCHIATO_DT);
       // Drink drink = new Drink("americano")

        Drink myDrink4 =  coffeeShop.serveDrink(DrinkType.WATER_DT);
        //DrinkType drinkType = new DrinkType("sdfsdf"); I can't do this private constructor only accessable in the same class

        System.out.println(myDrink.toString());
        System.out.println(myDrink3.toString());
        System.out.println(myDrink4.toString());

        DrinkType.CHANGE_ME = null; //shouldn't be alowed to change the value of the property
       // DrinkType.FRAPUCCINO_DT.ingredients = "frapuccino";
       // DrinkType.WATER_DT = null;

        Drink myDrink5 =  coffeeShop.serveDrink(DrinkTypeEnum.MOCHA_ENUM);
        System.out.println(myDrink5.toString());

        DrinkTypeEnum[] drinkTypeEnums = DrinkTypeEnum.values();
        for (DrinkTypeEnum drinkTypeEnum : drinkTypeEnums) {

            if(drinkTypeEnum == DrinkTypeEnum.MOCHA_ENUM){
                System.out.println("found it");
            }

           /* if(drinkTypeEnum.toString().equals("MOCHA_ENUM")){
                System.out.println(drinkTypeEnum.toString());
            }
                Should not try to compare strings
            */
            System.out.println(drinkTypeEnum.toString());
            System.out.println(drinkTypeEnum.getIngredients());
        }


    }
}
