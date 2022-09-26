public class PruebaMueble{
    public static void main(String[] args) {
        Silla s1 = new Silla(4,14000,"Pertenecio a la Reina Isabel");
        Silla s2 = new Silla(3,1000,"Pertenece a Coppel", false);
        System.out.println(s1.getDetalle());
        System.out.println(s2.getDetalle());
        System.out.println(s1.getDescripcion());
        Mueble m = new Silla(5000);
        System.out.println(m.getDetalle());
    }
}
