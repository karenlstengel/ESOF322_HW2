public class Client {
    //main method
    public static void main(String args[]) {

        int[] testArr = {10, 3, 5, 7, 8, 2, 4, 7, 9, 11, 12, 1};



        //client creations
        Mathematica mathematica = new Mathematica();

        //client running
        int[] mathematicaArr = mathematica.ms.mathSort(testArr);
        mathematica.ms.printArray(mathematicaArr);

        //dynamic client
        mathematica.setSortStrategy(new BubbleSort());
        mathematicaArr = mathematica.ms.mathSort(testArr);
        mathematica.ms.printArray(mathematicaArr);
    }
}
