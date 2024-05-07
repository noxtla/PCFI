/*
EXERCISE:
 
Write a phone word decoder
Write a program that accepts a phone number with letters and convert it to a phone number with only digits. 
For example, if you sent the program a phone number like 800888TEST, it should return (800) 888-8378.
 
Note that not only it convert letters to the digits they represent but also format the number correctly with parentheses and dashes. 
And, if you send the program an invalid number, it should throw an error.
*/

import java.lang.Character;

public class DanyPCFIR8 {

    public static void main(String[] args) {
       
        // Cadena de entrada
        String input = "800888test";
        
        // Imprimir la cadena de entrada convertida a caracteres numéricos
        System.out.println(stringToChar(input));

        // Obtener el resultado de la conversión
        String result = stringToChar(input);
        
        // Formatear y mostrar el número de teléfono
        System.out.println(format(result));       
    }

    // Método para convertir un carácter en su equivalente numérico
    public static char charToNumber(char character){

        if (character == 'a' || character == 'b' || character == 'c') {
            return '2';
        }

        if (character == 'd' || character == 'e' || character == 'f') {
            return '3';
        }

        if (character == 'g' || character == 'h' || character == 'i') {
            return '4';
        }

        if (character == 'j' || character == 'k' || character == 'l') {
            return '5';
        }

        if (character == 'm' || character == 'n' || character == 'o') {
            return '6';
        }

        if (character == 'p' || character == 'q' || character == 'r' || character == 's') {
            return '7';
        }

        if (character == 't' || character == 'u' || character == 'v') {
            return '8';
        }

        if (character == 'w' || character == 'x' || character == 'y' || character == 'z') {
            return '9';
        }

        if (Character.isDigit(character)){
            return character;
        }

        return '0'; // Devuelve '0' para cualquier otro carácter
    }
	
	
	public static String stringToChar (String miString) {
	
			char[] miCharArray = miString.toCharArray();
			char[] miCharInt = new char[miString.length()];

			// Convertir cada carácter de la cadena en su equivalente numérico
			int i = 0;
			for (char c : miCharArray) {
				miCharInt[i] = charToNumber(c);
				i++;
			}

            // Construir una cadena con los caracteres numéricos
            StringBuilder sb = new StringBuilder();
			for (char c : miCharInt) {
                sb.append(c);
            }

            return sb.toString(); // Devolver la cadena de caracteres numéricos
	}


    // Método para formatear el número de teléfono
    public static String format (String result){

        // Crear un StringBuilder con la cadena de caracteres numéricos
        StringBuilder sb = new StringBuilder(result);
        
        // Insertar paréntesis y guiones en posiciones específicas para dar formato al número de teléfono
        sb.insert(0, "(");  // Agregar '(' al principio
        sb.insert(4, ") "); // Agregar ') ' después del cuarto dígito
        sb.insert(9, "-");  // Agregar '-' después del octavo dígito
        sb.insert(13, "."); // Agregar '.' después del duodécimo dígito
        
        // Imprimir el número formateado
        System.out.println(sb.toString()); 
        
        // Devolver el número formateado
        return sb.toString();
    }
}