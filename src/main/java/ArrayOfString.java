import java.util.Scanner;
/**
 * for Task 3
 * @author Mivanova
 */
public class ArrayOfString {
    static Scanner sc = new Scanner(System.in);
    private static String[] createMass(int n){
        String[] Mass = new String[n];
        for (int i=0; i<n; i++){
            Mass[i] = sc.next();
        }
        return Mass;
    }
    private static int searchFirstBigElement(String[] mas){
        int indexOfMaxLength=0;
        for (int i=0; i<mas.length; i++){
            if (mas[indexOfMaxLength].length() < mas[i].length()) indexOfMaxLength = i;
        }
        return indexOfMaxLength;
    }
    public static void arrayOfString() {
        System.out.println("Задать размер массива");
        int lengthOfMass = sc.nextInt();
        String [] mass = createMass(lengthOfMass);
        System.out.println("Самое длинное слово в массиве (первое, если их несколько с одинаковой длиной) "
                + mass[searchFirstBigElement(mass)]);
    }
}
