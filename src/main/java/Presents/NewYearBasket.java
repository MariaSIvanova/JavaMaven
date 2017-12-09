package Presents;

public class NewYearBasket {
    public static void showPresentsBasket () {
        Candy candy1 = new Candy("Халва", 10, 100.7);
        candy1.setPerson("брату");
        Candy candy2 = new Candy("Батончик", 10, 90.7, "сестре");
        Chocolate ch1 = new Chocolate("Аленка", 20, 150.7, "молочный");
        Chocolate ch2 = new Chocolate();
        ch2.setType("тёмный");
        ch2.setName("Рошен");
        ch2.setPrice(200.9);
        ch2.setWeight(30);

        double sum = 0;
        int weight = 0;

        Present [] basket = {candy1, candy2, ch1, ch2};
        for (Present ny: basket) {
            System.out.println(ny);
            sum += ny.getPrice();
            weight += ny.getWeight();
        }

        System.out.println("Общий вес = "+ weight+ ", и общая сумма = " +sum);
    }
}
