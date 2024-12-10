package zooAnimales;
import java.util.ArrayList;

public class Mamifero extends Animal {
    static ArrayList <Mamifero> listado = new ArrayList <Mamifero>();
    public static int caballos;
    public static int leones;
    private boolean pelaje;
    private int patas;
    
    public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
        setNombre(nombre);
        setEdad(edad);
        setHabitat(habitat);
        setGenero(genero);
        this.pelaje = pelaje;
        this.patas = patas;
    }
    public Mamifero(){}
    {listado.add(this);}
    public static int cantidadMamiferos() {
        return listado.size();
    }
    static public void crearCaballo(String nombre, int edad, String genero){
      caballos += 1;
      new Mamifero(nombre, edad, "pradera",  genero, true, 4);
    }
    static public void crearLeon(String nombre, int edad, String genero){
      leones += 1;
      new Mamifero(nombre, edad, "selva", genero, true, 4);
    }
    public boolean getPelaje(){
        return pelaje;
    }
    public void setPelaje(boolean pelaje){
        this.pelaje=pelaje;
    }
    public int getPatas(){
        return patas;
    }
    public void setPatas(int patas){
        this.patas=patas;
    }
}
