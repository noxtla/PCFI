public class Chava2PCFI9 {

    public static void main(String[] args) {

        // Definir el dividendo y el divisor
        int dividendo = 138;
        int divisor = 5;
        int resultado = 0; // Variable para almacenar el resultado de la división

        // Se realiza una resta repetida hasta que el dividendo sea menor que el divisor
        while (dividendo >= divisor) {
            resultado++; // Aumentar el resultado en 1
            dividendo = dividendo - divisor; // Restar el divisor del dividendo
        }

        int residuo = dividendo; // El residuo es igual al valor final del dividendo después de la resta

        // Imprimir el resultado de la división
        System.out.println("Resultado: " + resultado);
        // Imprimir el residuo de la división
        System.out.println("Residuo: " + residuo);
    }
}