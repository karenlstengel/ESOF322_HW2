public class InsertionSort implements IMathSort {

    @Override
    public int[] mathSort(int array[]){
        System.out.println("\nInsertion Sort!");

        for(int i = 1; i < array.length; i++){
            int temp = array[i];
            int prev = i -1;

            while(prev >= 0 && array[prev] > temp){
                array[prev+1] = array[prev];
                prev = prev - 1;
            }

            array[prev + 1] = temp;
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
