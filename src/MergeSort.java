public class MergeSort implements IMathSort {

    @Override
    public int[] mathSort(int[] array) {
        System.out.println("\n\tMerge Sort!");

        //array = mergeSort(array, 0, array.length/2, array.length/2 + 1);
        array = sort(array, 0, array.length - 1);
        return array;
    }

    public int[] mergeSort(int[] array, int head_index, int middle_index, int tail_index){
        int sub1_size = middle_index - head_index + 1;
        int sub2_size = tail_index - middle_index;

        int sub1[] = new int [sub1_size];
        int sub2[] = new int [sub2_size];

        for(int i = 0; i < sub1_size; ++i){
            sub1[i] = array[head_index + i];
        }
        for(int j = 0; j < sub2_size; ++j){
            sub2[j] = array[middle_index + 1 + j];
        }

        int sub1_head = 0;
        int sub2_head = 0;
        int merged_sub = 1;

        while(sub1_head < sub1_size && sub2_head < sub2_size){
            if(sub1[sub1_head] <= sub2[sub2_head]){
                array[merged_sub] = sub2[sub2_head];
                sub2_head++;
            }else{
                array[merged_sub] = sub1[sub1_head];
                sub1_head++;
            }
            merged_sub++;
        }

        while(sub1_head < sub1_size){
            array[merged_sub] = sub1[sub1_head];
            sub1_head++;
            merged_sub++;
        }

        while(sub2_head < sub2_size){
            array[merged_sub] = sub2[sub2_head];
            sub2_head++;
            merged_sub++;
        }
        return array;
    }

    public void sort(int array[], int head_index, int tail_index){
        if(head_index < tail_index){
            int middle_index = (head_index + tail_index)/2;

            sort(array, head_index, middle_index);
            sort(array,middle_index + 1, tail_index);

            mergeSort(array, head_index, middle_index, tail_index);
        }
        //return mergedArray;
    }

    @Override
    public void printArray(int[] array){
        System.out.print("\t");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
