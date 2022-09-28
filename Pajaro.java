public class Pajaro extends Animal{
    private boolean plumas;
    public Pajaro(String nombre, String tipo, boolean plumas){
        super(nombre, tipo);
        this.plumas = plumas;
    }
    public String desplazar(){
        return "Vuela";
    }
    
}
