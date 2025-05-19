public class Articulo {
    //Atributos
    private int id;
    private String nombre;
    private double precio;
    //Constructor Alternativo
    public Articulo(int id,String nombre, double precio){
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }
    //Metodos Getter
    public int idGet(){
        return this.id;
    }
    public String nombreGet(){
        return this.nombre;
    }
    public double preciokGet(){
        return this.precio;
    }
    //Metodos Setter
    public void idSetter(int id){
        this.id = id;
    }
    public void nombreSetter(String nombre){
        this.nombre = nombre;
    }
    public void precioSetter(double precio){
        this.precio = precio;
    }

    void mostrar (){
        System.out.println("Id: " + this.id + " | Nombre: " + this.nombre + " | Precio: " + this.precio);
    }
}
