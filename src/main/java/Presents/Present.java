package Presents;

public abstract class Present {
    private String name;
    private int weight;
    private Double price;

    public Present(){}

    public Present(String name, int weight, Double price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }
    public String getName(){
        return name;
    }
    public int getWeight(){
        return weight;
    }
    public Double getPrice(){
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    @Override
    public String toString(){
        return "Название товара: "+name+", вес: "+weight+", цена: "+price;
    }
}
