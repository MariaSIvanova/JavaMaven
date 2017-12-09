import Presents.NewYearBasket;

import java.util.Scanner;


public class ChoiceOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вырбрать операцию \n" +
                "если 1 - запуститься выполнение калькулятора,\n"+
                "если 2 - поиск максимального слова в массиве, \n"
                +"если 3 - задача с массивом с размерностью 20, заполняется случайными целыми числами от -10 до 10\n"+
                "если 4 - показать новогоднюю корзину подарков");
        int choice = scanner.nextInt();
        switch (choice){
            case 1: Calc.calculating(); break;
            case 2: ArrayOfString.arrayOfString(); break;
            case 3: ArrayOfInteger.changePlaceOfTwoElements(); break;
            case 4: NewYearBasket.showPresentsBasket(); break;
            default: System.out.println("Вы не выбрали программу");
        }
    }
}
