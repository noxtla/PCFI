public class DanyPCFIR10 {


/*
Write a function that return an bi-dimentional array (length n*n) that match below output patterns:
 
getArrayPatternOf(3) => [[0, 0, 1], [0, 2, 1], [3, 2, 1]]
getArrayPatternOf(2) => [[0, 1], [2, 1]]
getArrayPatternOf(4) => [[0, 0, 0, 1], [0, 0, 2, 1], [0, 3, 2, 1], [4, 3, 2, 1]]

*/

    public static void main (String[] args){
        
        getArrayPatternOf(5);

        showMatrix( getArrayPatternOf(5));

    }


    private static int[][] getArrayPatternOf (int key){

        //int [][] arrayPattern = new int[key];
        int[][] matrizPattern = new int[key][key];

        for (int i=0; i<matrizPattern.length; i++){

            for (int j = 0; j < matrizPattern.length; j++) {
                matrizPattern[i][j] = 0;
            }
        }

        return matrizPattern;
    }


    private static void showMatrix (int [][] matriz){

        for (int i = 0; i < matriz.length; i++) {       // matriz.length es el número de filas
            for (int j = 0; j < matriz[i].length; j++) { // matriz[i].length es el número de columnas en la fila i
                System.out.print(matriz[i][j] + " ");    // Imprime el elemento seguido de un espacio
            }
            System.out.println();                       // Imprime una nueva línea después de cada fila
        }
    }
}