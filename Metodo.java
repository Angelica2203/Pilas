
import java.util.Scanner;
import java.util.Stack;

public class Metodo 
{
    Scanner sc = new Scanner(System.in);
    public Stack<Integer> LlenarPila() 
    {
        Stack<Integer> pila = new Stack<>();
        boolean bandera = true;
        int opt = 0;
        while (bandera) 
        {
            System.out.println("Ingrese el registro: ");
            pila.push(sc.nextInt());
            System.out.println("Desea ingresar mas registro, 1: SI y 2: NO");
            while (!sc.hasNextInt()) 
            {
                System.out.println("El dato ingresado no es numerico, revise");
                sc.next();
            }
            opt = sc.nextInt();
            while (opt < 1 || opt > 2) 
            {
                System.out.println("Debe ingresa una opcion 1 o 2");
                sc.nextInt();
            }
            if (opt == 2) 
            {
                bandera = false;
            }
        }
        return pila;

    }

    public void MostrarPila(Stack<Integer> pila) 
    {
        System.out.println(pila);//SOLO DATOS PRIMITIVOS SE PUEDE ASI CON OBJETOS ES DISTINTO
    }

    public Stack<Integer> EliminarDatos(Stack<Integer> pila) 
    {
        Stack<Integer> auxPila = new Stack<>();
        int numero;
        System.out.println("Ingrese el registro a eliminar");
        numero = sc.nextInt();
        while (!pila.isEmpty()) 
        {
            if (pila.peek() == numero) 
            {
                pila.pop();
            }
            else
            {
                auxPila.push(pila.pop());
            }
        }
        System.out.println(pila);
        System.out.println(auxPila.reversed());
        return pila;
    }
}
