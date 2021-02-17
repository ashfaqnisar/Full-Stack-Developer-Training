package Hands_On.Advanced_Java_Concepts.Serial_ParallelSorts_Stream.Fruit_Basket_Estimation;
/*Remove the package import from the code in genc learn*/

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FruitBasketUtility {
    private List<FruitBasket> fruitBasketList = new ArrayList<>();

    public List<FruitBasket> getFruitBasketList() {
        return fruitBasketList;
    }

    public void setFruitBasketList(List<FruitBasket> fruitBasketList) {
        this.fruitBasketList = fruitBasketList;
    }

    public void addToBasket(FruitBasket fbObj) {
        // Fill your code here
        fruitBasketList.add(fbObj);

    }

    public int calculateBill(Stream<FruitBasket> fruitBasketStream) {

        int[] basket = new int[1];
        // Fill your code here
        fruitBasketStream.forEach(fruit ->
        {
            int weight = fruit.getWeightInKgs();
            int price = fruit.getPricePerKg();
            basket[0] = basket[0] + price * weight;
        });
        return basket[0];


    }

}
