public class Mueble{
    private int patas;
    private float costo;
    private String descripcion;
    public Mueble(int patas, float costo, String descripcion){
        this.patas = patas;
        this.costo = costo;
        this.descripcion = descripcion;
    }
    public int getPatas(){
        return patas;
    }
    public float getCosto(){
        return costo;
    }
    public String getDescripcion(){
        return descripcion;
    }
    public void setPatas(int p){
        patas = p;
    }
    public void setCosto(float c){
        costo = c;
    }
    public void setDescripcion(String d){
        descripcion = d;
    }
    public String getDetalle(){
        return patas + "" + costo + "" + descripcion;
    }
}