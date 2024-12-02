public class Main {
    public static void main(String[] args) {

//        Item coke = new Item("drink", "coke", 1.50);
//        coke.printItem();
//        coke.setSize("LARGE");
//        coke.printItem();
//
//        Item avocado = new Item("Topping", "avocado", 1.50);
//        avocado.printItem();

//    Burger burger = new Burger("regular", 4.00);
//    burger.addToppings("BACON", "CHEESE", "MAYO");
//    burger.printItem();

//        MealOrder regularMeal = new MealOrder();
//        regularMeal.addBurgertoppings("BACON", "CHEESE", "MAYO");
//        regularMeal.setDrinkSize("LARGE");
//        regularMeal.printItemisedList();

//        MealOrder secondMeal = new MealOrder("turkey", "7-Up", "chili");
//        secondMeal.addBurgertoppings("LETTUCE", "CHEESE", "MAYO");
//        secondMeal.setDrinkSize("SMALL");
//        secondMeal.printItemisedList();


        MealOrder deluxeMeal = new MealOrder("deluxe", "7-Up", "chili");
        deluxeMeal.addBurgertoppings("AVOCADO", "BACON", "LETTUCE",
                "CHEESE", "MAYO");
        deluxeMeal.setDrinkSize("SMALL");
        deluxeMeal.printItemisedList();

    }
}
