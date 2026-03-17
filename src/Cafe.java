public class Cafe {
    private String nombre;
    private String tamano;
    private Double precio;

    public Cafe(String nombre, String tamaño, Double precio){
        this.nombre= nombre;
        this.tamano= tamaño;
        this.precio= precio;
    }

    public void mostrarticket(){
        System.out.println("==== TICKET ====");
        System.out.println("Café: " + nombre);
        System.out.println("Tamaño: " + tamano);
        System.out.println("Precio: $" + precio);
    }
}
