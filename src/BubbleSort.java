import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        print(sort(fill(array)));
    }
//    static private int size = 15;
    static private int[] array = new int[size()];

    static void print(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    static int[] fill(int[] array){
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.round(Math.random()*100));
        }
        return array;
    }
    static int[] sort(int[] array){
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if(array[i] < array[j]){
                    int temporary = array[i];
                    array[i] = array[j];
                    array[j] = temporary;
                }
            }
        }
        return array;
    }

    static int size(){
        System.out.print("Enter size of array: ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        return input;
    }
}
