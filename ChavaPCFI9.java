///Si tienes un arreglo 123 456 ingresa una llave 3 el arreglo ahora sera 456-123 si es 1 6-12345


public class ChavaPCFI9 {
    
    public static void main(String[] args) {
        // Arreglo original
        int intArr1[] = {1, 2, 3, 4, 5, 6};
        
        // Número de posiciones que se moverán los elementos
        int key = 1;

        // Llama al método sortArrKey para obtener el arreglo modificado
        int[] resultado = sortArrKey(intArr1, key);
        
        // Imprime el arreglo modificado
        for (int i : resultado) {
            System.out.print(i);
        }
    }
    
    // Método para mover los elementos del arreglo 'arr' según la llave 'key'
    private static int[] sortArrKey(int arr[], int key){
        int n = arr.length;

        // Crear un arreglo auxiliar del mismo tamaño que 'arr'
        int arrayOp[] = new int[n];

        // Copiar los primeros 'key' elementos al final del nuevo arreglo
        for (int i = 0; i < key; i++) {
            arrayOp[n - key + i] = arr[i];
        }
    
        // Copiar los elementos restantes al principio del nuevo arreglo
        for (int i = 0; i < n - key; i++) {
            arrayOp[i] = arr[i + key];
        }
    
        // Retornar el arreglo modificado
        return arrayOp;
    }

}