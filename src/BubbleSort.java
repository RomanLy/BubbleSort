public class BubbleSort {
    public static void main(String[] args) {
        print(sort(array));
    }

    static int[] array = {9, 5, 57, 78, -89, 0, -4, 54, 100, 9 };

    static void print(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
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

}
