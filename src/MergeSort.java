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
}
