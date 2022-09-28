public class PruebaAnimal {
    public static void main(String[] args) {
        Animal a[] = {new Animal("Mimo", "electrico"),
            new Gusano("Gus", "quemador", 10),
            new Pajaro("Piolin", "De Colores", true)};
        for (Animal tmp : a) {
            System.out.println(tmp.desplazar());   
            if (tmp instanceof Pajaro){
                System.out.println("Se lo come silvestre");
            } 
        }
    }
}
