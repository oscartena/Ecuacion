
package ecuacion;

import java.util.Scanner;

public class Ecuacion {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double a, b, c, discriminante, resultado, resultado2;
        String respuesta;
        
        //bucle do-while porque al menos se realizará una vez
        do {
            System.out.print("Dame un valor para a: ");
            a = teclado.nextDouble();
            System.out.print("Dame un valor para b: ");
            b = teclado.nextDouble();
            System.out.print("Dame un valor para c: ");
            c = teclado.nextDouble();

            //Calculamos el discriminante y luego comparamos para saber cuantas soluciones tendrá y calcularlas
            discriminante = b * b - 4 * a * c;

            if (discriminante < 0) {
                System.out.println("Raíces complejas");
            } else if (discriminante == 0) {
                resultado = (-b) / (2 * a);
                System.out.println("Raíces iguales x1=x2= " + resultado);
            } else {
                resultado = (-b + Math.sqrt(discriminante)) / (2 * a);
                resultado2 = (-b - Math.sqrt(discriminante)) / (2 * a);
                System.out.println("x1= " + resultado + " y x2= " + resultado2);
            }
            //Preguntamos, si responde n o N acaba el programa, sino se reinicia el bucle
            System.out.println("Desea resolver otra ecuación de segundo grado s/n?");
            respuesta = teclado.next();
        
        } while (!(respuesta.equals("n") || (respuesta.equals("N"))));
    }
    
}
