public class Silla extends Mueble{
    private boolean respaldo;
    public Silla(int patas, float costo, String descripcion, boolean respaldo){
        super(patas, costo, descripcion);
        this.respaldo = respaldo;
    }
    public Silla(int patas, float costo, String descripcion){
        this(patas, costo, descripcion,true);
  }
  public Silla(float costo){
    this(4, costo, "Sin descripcion");
  }
  public String getDescripcion(){
    return super.getDetalle() + " " + respaldo;
  }
}