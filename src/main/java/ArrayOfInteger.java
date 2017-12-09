import java.util.Random;

public class ArrayOfInteger {
    /**
     * Этот Массив размерностью 20, заполняется случайными целыми числами от -10 до 10.
     * Найти максимальный отрицательный и минимальный положительный элементы массива.
     * Поменять их местами.
     */
    public static void changePlaceOfTwoElements() {
        int length = 20;
        int[] mass = mass(length);
        for (int i: mass) {
            System.out.print(i + " ");
        }
        int indexPositiv = chooseMinPositiveElement(mass);
        int indexNegativ = chooseMaxNegativElement(mass);
        int temp = mass[indexNegativ];
        mass[indexNegativ] = mass[indexPositiv];
        mass[indexPositiv] = temp;
        System.out.println("\n");
        for (int i: mass) {
            System.out.print(i + " ");
        }
    }
    private static int[] mass(int n){
        int mass[] = new int[n];
        Random random = new Random();
        for (int i=0; i<n; i++){
            mass[i] = random.nextInt(21)-10;
        }
        return  mass;
    }
    //Поиск максимального отрицательного числа, т.е. который ближе всех к 0
    private static int chooseMaxNegativElement(int[] mas){
        int indexOfMaxNegativ = 0;
        //ищем первое отрицательное число
        for(int j=0; j<mas.length; j++) {
            if (mas[j] < 0) {
                indexOfMaxNegativ = j;
                break;
            }
        }
        for (int i=0; i<mas.length; i++){
            if(mas[i] < 0 && mas[indexOfMaxNegativ]<mas[i]) indexOfMaxNegativ = i;
        }
        return indexOfMaxNegativ;
    }
    // Поиск минимального положительного числа, т.е. который ближе всех к 0
    private static int chooseMinPositiveElement(int[] mas){
        int indexOfMinPositive = 0;
        //ищем первое положительное число
        for(int j=0; j<mas.length; j++) {
            if (mas[j] > 0) {
                indexOfMinPositive = j;
                break;
            }
        }
        for (int i=0; i<mas.length; i++){
            if(mas[i] > 0 && mas[indexOfMinPositive]>mas[i]) indexOfMinPositive = i;
        }
        return indexOfMinPositive;
    }

}
