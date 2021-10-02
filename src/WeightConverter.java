public class WeightConverter {
    //Data members
    private double weight;
    private static final double gravity;
    //Constructor
    public WeightConverter(double weight, double gravity){
        this.weight=weight;
        this.gravity=gravity;
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
    public void setGravity(double gravity){
        this.gravity= gravity;
    }
    public String toString(){
        return this.weight+" "+this.gravity;
    }

    public static void main(String[] args) {
        WeightConverter weightConverter1=new WeightConverter(220, 9.81);
    }
}
