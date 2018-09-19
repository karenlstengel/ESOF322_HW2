public class InsertionSort implements IMathSort {

    @Override
    public int[] mathSort(int array[]){
        System.out.println("\nInsertion Sort!");

        //create and fill a new array with the values of array
        int[] tempArr = new int[array.length];
        for(int i = 0; i < array.length; i++){
            tempArr[i] = array[i];
        }


        for(int i = 1; i < tempArr.length; i++){
            int temp = tempArr[i];
            int prev = i -1;

            while(prev >= 0 && tempArr[prev] > temp){
                tempArr[prev+1] = tempArr[prev];
                prev = prev - 1;
            }

            tempArr[prev + 1] = temp;
        }

        return tempArr;
    }

    @Override
    public void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
