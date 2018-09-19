public class MergeSort implements IMathSort {

    @Override
    public int[] mathSort(int[] array) {
        System.out.println("\nMerge Sort!");

        array = mergeSort(array, 0, array.length/2, array.length/2 + 1);
        return array;
    }

    public int[] mergeSort(int[] array, int m, int n, int r){


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
