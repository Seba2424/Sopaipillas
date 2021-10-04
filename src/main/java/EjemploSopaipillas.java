import java.util.Scanner;

public class EjemploSopaipillas {
    public static void main(String[] args) {
        iniciar();
    }
    public static void iniciar(){
        VendedorSopaipillas vendedorSopaipillas= new VendedorSopaipillas(250,1000000000);
        int cantidad=pedirCantidadSopaipillas();
        System.out.println(vendedorSopaipillas.getVuelto(cantidad,pedirDinero(cantidad)));
    }
    public static int pedirCantidadSopaipillas(){
        System.out.println("Digite la cantidad de sopaipillas que desea ordenar: ");
        System.out.println("cantidad de sopaipillas: "+VendedorSopaipillas.getCantidadSopaipillas());
        int cantidad=pedirNumero(VendedorSopaipillas.getCantidadSopaipillas());
        return cantidad;

    }
    public static int pedirDinero(int cantidad){
        System.out.println("Digite la cantidad de dineros con el que pagara: ");
        System.out.println("costo es: " +cantidad*VendedorSopaipillas.getPrecioSopaipillas());
        return pedirNumero(1000000000);
    }
    public static int pedirNumero(int x) {
        int n = -1;
        do {
            //Scanner ponerlo dentro del DO, y dentro de una funcion
            Scanner teclado = new Scanner(System.in);
            //System.out.println("ingrese otro numero");
            try {
                n = teclado.nextInt();
            } catch (Exception e) {
                System.out.println("Error");
            }
            if (n < 0 || n > x) {
                System.out.println("ingrese un numero valido");
            }
        } while (n < 0 || n > x);
        return n;
    }
}

