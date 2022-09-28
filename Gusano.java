public class Gusano extends Animal{
    private int seda;
    public Gusano(String nombre, String tipo, int seda){
        super(nombre, tipo);
        this.seda = seda;
    }
    public String desplazar(){
        return "Se arrastra";
    }
}