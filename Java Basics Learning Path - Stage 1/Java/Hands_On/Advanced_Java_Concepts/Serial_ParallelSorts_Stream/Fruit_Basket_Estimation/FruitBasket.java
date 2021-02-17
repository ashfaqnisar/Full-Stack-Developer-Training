package Hands_On.Advanced_Java_Concepts.Serial_ParallelSorts_Stream.Fruit_Basket_Estimation;
/*Remove the package import from the code in genc learn*/

public class FruitBasket {
    private String fruitName;
    private int weightInKgs;
    private int pricePerKg;

    public FruitBasket(String fruitName, int weightInKgs, int pricePerKg) {
        super();
        this.fruitName = fruitName;
        this.weightInKgs = weightInKgs;
        this.pricePerKg = pricePerKg;
    }

    public FruitBasket() {
        super();
    }

    public String getFruitName() {
        return fruitName;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    public int getWeightInKgs() {
        return weightInKgs;
    }

    public void setWeightInKgs(int weightInKgs) {
        this.weightInKgs = weightInKgs;
    }

    public int getPricePerKg() {
        return pricePerKg;
    }

    public void setPricePerKg(int pricePerKg) {
        this.pricePerKg = pricePerKg;
    }

}
