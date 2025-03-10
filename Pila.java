import java.util.Scanner;
import java.util.Stack;
public class Pila 
{
    Scanner sc = new Scanner(System.in);
    public void pila() 
    {
        Stack<Integer> pila = new Stack<>(); //palabra para declarar la pila es stack para trabajar con enteros es integer eso va entre <>
        Metodo m = new Metodo();
        pila = m.LlenarPila();
        m.MostrarPila(pila);
        pila = m.EliminarDatos(pila);

    }

}
