public class CoffeeBag {
    //Data members
    private double unitWeight;
    private int numberOfBags;
    private double totalPrice;
    private double totalPriceWithTax;
    private double taxRate;

    //Methods
    public CoffeeBag(double unitWeight, int numberOfBags, double totalPrice, double totalPriceWithTax, double taxRate) {
        this.unitWeight = unitWeight;
        this.numberOfBags = numberOfBags;
        this.totalPrice = totalPrice;
    }

    public double totalPrice() {
        totalPrice = unitWeight * numberOfBags;
        totalPriceWithTax = totalPrice + totalPrice * taxRate;
    }

    public static void main(String[] args) {
        CoffeeBag coffeeBag1=new CoffeeBag(5.98, 32, 1027.88, 1.0, 7.25);

    }
    }
