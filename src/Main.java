import java.util.Scanner;

public class Main{
    public static void main (String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("Bienvenido");
        System.out.println("ingrese nombre del cafe:");
        String nombre = sc.nextLine();
        System.out.println("ingrese tamaño del cafe:");
        String tamano = sc.nextLine();
        System.out.println("ingrese precio del cafe:");
        double precio = sc.nextDouble();

        Cafe cafe1= new Cafe(nombre, tamano, precio);
        cafe1.mostrarticket();

    }

}