    import java.util.*;

    public class ListadoArticulos {
        static Scanner sc = new Scanner(System.in);
        static ArrayList<Articulo> ListadeArticulos = new ArrayList<>(); 
        public static void main(String[] args){
            //creacion de variable para guardar que opcion selecciona el cliente
            int opcion;
            do {
            System.out.println(
            "\n --- Menu de Articulos ---" +   
            "\n 1- Crea un articulo" + 
            "\n 2- Listar articulos" +
            "\n 3- Modificar un articulo" +
            "\n 4- Borrar un articulo" +
            "\n 5- Salir");
            System.out.println("Eliga una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();
            //Uso de Switch como mejor opcion para el codigo para armar un menu de seleccion.
                switch (opcion) {
                    case 1 -> crearArticulo();
                    case 2 -> listarArticulos();
                    case 3 -> modificarArticulos();
                    case 4 -> borrarArticulo();
                    case 5 -> System.out.println("Saliendo del programa...");
                    default -> System.out.println("Opcion invalida");
                }
                  
            }while (opcion!=5);

            }
            
            // Funcion para crear Articulo
            public static void crearArticulo(){
                System.out.println("ID: ");

                int id = sc.nextInt(); sc.nextLine();
                System.out.println("Nombre: ");
                String nombre = sc.nextLine();
                System.out.println("Precio: ");
                double precio = sc.nextDouble(); sc.nextLine();
                //Creamos el Articulo con sus atributos
                Articulo nuevo = new Articulo(id, nombre, precio);
                //Agregamos el articulo a la lista
                ListadeArticulos.add(nuevo);
                System.out.println("Articulo agregado");
            }
            // Funcion para listar Articulo
            public static void listarArticulos(){
                    //consultamos si la lista esta vacia o no
                    if (ListadeArticulos.isEmpty()) {
                        System.out.println("No hay articulos en la lista");
                    } else {
                        //En caso que no este vacia recorremos la lista completa y mostramos por consolta con el 
                        //Metodo del que cremaos del objeto.
                        for(Articulo articulo : ListadeArticulos){
                            articulo.mostrar();
                        } 
                    }
            };
            // Funcion para Modificar Articulo
            public static void modificarArticulos(){
                System.out.println("Id del articulo a modificar: ");
                int id = sc.nextInt(); sc.nextLine();
                for(Articulo a : ListadeArticulos){
                    //busco que el Id ingresado coincida con el id del articulo que quiero modificar asi lo puedo encontrar
                    if (a.idGet() == id){
                        System.out.println("Nuevo nombre: ");
                        String nombre = sc.nextLine();
                        a.nombreSetter(nombre);
                        System.out.println("Nuevo precio: ");
                        double precio = sc.nextDouble(); sc.nextLine();
                        a.precioSetter(precio);
                        System.out.println("Articulo Actualizado");
                        return;
                    }
                }
                System.out.println("Articulo no encontrado");
            }
            //Funcion para Borrar Articulo
            public static void borrarArticulo(){
                 //consultamos si la lista esta vacia o no
                if (ListadeArticulos.isEmpty()) {
                        System.out.println("No existe ninguna articulo");
                        return;
                    }
                System.out.println("Id del articulo a borrar: ");
                int id = sc.nextInt(); sc.nextLine();
                for(Articulo a : ListadeArticulos){
                    //busco que el Id ingresado coincida con el id del articulo que quiero borrar asi lo puedo encontrar
                    if (a.idGet() == id) {
                        ListadeArticulos.remove(a);
                        System.out.println("Articulo eliminado");
                        return;
                    }else{
                        System.out.println("No existe ninguna articulo con ese Id");
                    
                }
            };


            }
        }
    
    


