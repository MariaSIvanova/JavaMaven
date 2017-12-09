package Presents;

public class Chocolate extends Present {
    private String type;

    public Chocolate(){}

    public Chocolate(String name, int weight, Double price, String type) {
        super(name, weight, price);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString(){
        return "Chocolate: "+super.toString() + ", вид: "+type;
    }

}
