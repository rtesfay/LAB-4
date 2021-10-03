public class WeightConverter {
    //Data members
    private double weight;
    private static final double gravity = 0;
    //Constructor
    public WeightConverter(double weight, double gravity){
        this.weight=weight;
    }
    //Methods
    public double getWeight(){
        return weight;
    }
    public double getGravity(){
        return gravity;
    }
    public void setWeight(double weight){
        this.weight=weight;
    }
    public String toString(){
        return this.weight+" "+this.gravity;
    }

    public static void main(String[] args) {
        WeightConverter weightConverter1=new WeightConverter(220, 9.81);
    }
}
