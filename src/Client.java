public class Client {
    //main method
    public static void main(String args[]) {

        //initial test array with unsorted values
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

        //new test array
        int testArr2[] = new int[] {10, 3, 5, 7, 8, 2, 4, 7, 9, 11, 12, 1};

        /**MTool*/
        //create client
        System.out.println("MTool");
        MTool mtool = new MTool();

        //print out test array
        System.out.println("\tRandom array: ");
        mtool.ms.printArray(testArr2);


        //MTool running on default
        int[] mtoolArr = mtool.ms.mathSort(testArr2); //merge sort
        mtool.ms.printArray(mtoolArr);

        //dynamic MTool
        mtool.setSortStrategy(new BubbleSort());

        //new test array
        int testArr3[] = new int[] {10, 3, 5, 7, 8, 2, 4, 7, 9, 11, 12, 1};

        //print out test array
        System.out.println("\n\tRandom array: ");
        mathematica.ms.printArray(testArr3);

        mathematicaArr = mathematica.ms.mathSort(testArr3);
        mathematica.ms.printArray(mathematicaArr);

        /**MyMath*/
        //create client
        System.out.println("MyMath");
        MyMath myMath = new MyMath();

        //new test array
        int testArr4[] = new int[] {10, 3, 5, 7, 8, 2, 4, 7, 9, 11, 12, 1};

        //print out test array
        System.out.println("\tRandom array: ");
        myMath.ms.printArray(testArr4);

        //Mathematica running on default
        int[] myMathArr = myMath.ms.mathSort(testArr4); //bubble sort
        myMath.ms.printArray(myMathArr);

        //dynamic MyMath
        myMath.setSortStrategy(new InsertionSort());

        //new test array
        int testArr5[] = new int[] {10, 3, 5, 7, 8, 2, 4, 7, 9, 11, 12, 1};

        //print out test array
        System.out.println("\n\tRandom array: ");
        myMath.ms.printArray(testArr5);

        myMathArr = myMath.ms.mathSort(testArr5);
        myMath.ms.printArray(myMathArr);
    }
}
