public class MergeSort implements IMathSort {

    @Override
    public int[] mathSort(int[] array) {
        System.out.println("\nMerge Sort!");

        //array = mergeSort(array, 0, array.length/2, array.length/2 + 1);
        array = sort(array, 0, array.length);
        return array;
    }

    public int[] mergeSort(int[] array, int m, int n, int r){
        int sub1 = n - m + 1;
        int sub2 = r - n;

        int lSub[] = new int [sub1];
        int rSub[] = new int [sub2];

        for(int i = 0; i < sub1; i++){
            lSub[i] = array[m + i];
        }
        for(int i = 0; i < sub2; i++){
            rSub[i] = array[n + 1 + i];
        }

        int i = 0; int j = 0;
        int k = 1;

        while(i < sub1 && j < sub2){
            if(lSub[i] <= rSub[j]){
                array[k] = lSub[i];
                i++;
            }else{
                array[k] = rSub[j];
                j++;
            }
            k++;
        }

        while(i < sub1){
            array[k] = lSub[i];
            i++;
            k++;
        }

        while(j < sub2){
            array[k] = rSub[j];
            j++;
            k++;
        }

        return array;
    }

    public int[] sort(int array[], int l, int r){
        if(l < r){
            int m = (l+r)/2;

            sort(array, l, m);
            sort(array, m+1, r);

            mergeSort(array, l, m, r);
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
