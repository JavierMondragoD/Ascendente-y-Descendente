import java.io.*;

 
/**
 * Determinar orden ascendente o descendente
 *
 * @author codesandtags
 *
 */
public class AscendenteYDescendente {
 
   public static void main(String[] args) throws IOException,
         InterruptedException {
 
      // Crea el objeto input para capturar datos por teclado
      BufferedReader input = new BufferedReader(new InputStreamReader(
            System.in));
      int x, y;
 
     
      AscendenteYDescendente resultado = new AscendenteYDescendente();
 
     
      System.out.print("Ingrese un número:  ");
      x = Integer.parseInt(input.readLine()); // Conversión a int
      System.out.print("Ingrese un número:  ");
      y = Integer.parseInt(input.readLine()); // Conversión a int
 
      // Resultado de la validacion
      resultado.validar(x,y);
 
      // Pausa de 5 segundos despues del ingreso de datos
      Thread.sleep(5000);
 
      // Enviando otros numeros para la validación
      
 
   }
 
   
   public void validar(int n, int m) {
      // Se valida que el numero n sea mayor
      if (n > m)
         System.out.println("DESCENDENTE  " + n + " , " + m);
      else if (m > n)
         System.out.println("ASCENDENTE  " + n + " , " + m);
      else
         System.out.println("IGUALES  " + n + " , " + m);
   }
 
}
