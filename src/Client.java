public class Client {
    //main method
    public static void main(String args[]) {

        int[] testArr = {10, 3, 5, 7, 8, 2, 4, 7, 9, 11, 12, 1};


        //Mathematica creations
        Mathematica mathematica = new Mathematica();

        //print out test array
        System.out.println("Random array: ");
        mathematica.ms.printArray(testArr);

        //Mathematica running on default
        int[] mathematicaArr = mathematica.ms.mathSort(testArr);
        mathematica.ms.printArray(mathematicaArr);

        //dynamic Mathematica
        mathematica.setSortStrategy(new MergeSort());

        //print out test array
        System.out.println("\nRandom array: ");
        mathematica.ms.printArray(testArr);

        mathematicaArr = mathematica.ms.mathSort(testArr);
        mathematica.ms.printArray(mathematicaArr);
    }
}
