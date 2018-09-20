public class Client {
    //main method
    public static void main(String args[]) {

        int[] testArr = {10, 3, 5, 7, 8, 2, 4, 7, 9, 11, 12, 1};


        /**Mathematica */
        //create client
        System.out.println("Mathematica");
        Mathematica mathematica = new Mathematica();

        //print out test array
        System.out.println("\tRandom array: ");
        mathematica.ms.printArray(testArr);

        //Mathematica running on default
        int[] mathematicaArr = mathematica.ms.mathSort(testArr); //insertion sort
        mathematica.ms.printArray(mathematicaArr);

        //dynamic Mathematica
        mathematica.setSortStrategy(new BubbleSort());

        //print out test array
        System.out.println("\n\tRandom array: ");
        mathematica.ms.printArray(testArr);

        mathematicaArr = mathematica.ms.mathSort(testArr);
        mathematica.ms.printArray(mathematicaArr);

        int tempArr[] = new int[] {10, 3, 5, 7, 8, 2, 4, 7, 9, 11, 12, 1};
        testArr = tempArr;

        /**MTool*/
        //create client
        System.out.println("MTool");
        MTool mtool = new MTool();

        //print out test array
        System.out.println("\tRandom array: ");
        mtool.ms.printArray(testArr);

        //MTool running on default
        int[] mtoolArr = mtool.ms.mathSort(testArr); //merge sort
        mtool.ms.printArray(mtoolArr);

        //dynamic MTool
        mtool.setSortStrategy(new BubbleSort());

        //print out test array
        System.out.println("\n\tRandom array: ");
        mathematica.ms.printArray(testArr);

        mathematicaArr = mathematica.ms.mathSort(testArr);
        mathematica.ms.printArray(mathematicaArr);

        /**MyMath*/
        //create client
        System.out.println("MyMath");
        MyMath myMath = new MyMath();

        //print out test array
        System.out.println("\tRandom array: ");
        myMath.ms.printArray(testArr);

        //Mathematica running on default
        int[] myMathArr = myMath.ms.mathSort(testArr); //bubble sort
        myMath.ms.printArray(myMathArr);

        //dynamic MyMath
        myMath.setSortStrategy(new InsertionSort());

        //print out test array
        System.out.println("\n\tRandom array: ");
        myMath.ms.printArray(testArr);

        myMathArr = myMath.ms.mathSort(testArr);
        myMath.ms.printArray(myMathArr);
    }
}
