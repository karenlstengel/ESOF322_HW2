public class BubbleSort implements IMathSort {

    @Override
    public int[] mathSort(int array[]){
        System.out.println("\n Bubble Sort!");

        for(int i = 0; i < array.length - 1; i++){
            for(int j = 0; j < array.length - i - 1; j++){
                if(array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j+1] = temp;
                }
            }
        }

        return array;
    }

    @Override
    public void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
