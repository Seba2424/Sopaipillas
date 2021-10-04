public class VendedorSopaipillas {
    private static int precioSopaipillas;
    private static int cantidadSopaipillasStock;

    public VendedorSopaipillas(int precioSopaipillas, int cantidadSopaipillas) {
        this.precioSopaipillas = precioSopaipillas;
        this.cantidadSopaipillasStock = cantidadSopaipillas;
    }
    protected boolean enStock(int cantidadSopaipillasStock){
        return this.cantidadSopaipillasStock-cantidadSopaipillasStock>=0;
    }

    public int getVuelto(int cantidadlleva,int pagar){
        if(enStock(cantidadlleva)){
            if(pagar>=(cantidadlleva*precioSopaipillas)){
                System.out.println("Su vuelto es de: ");
                return pagar-(cantidadlleva*this.precioSopaipillas);
            }else {
                System.out.println("monto insuficiente");
                return -1;
            }
        }
        System.out.println("Sin stock");
        return 0;
    }

    public static int getCantidadSopaipillas() {
        return cantidadSopaipillasStock;
    }
    public static int getPrecioSopaipillas() {
        return precioSopaipillas;
    }

}
