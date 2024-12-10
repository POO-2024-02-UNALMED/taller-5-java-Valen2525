package zooAnimales;
import java.util.ArrayList;

public class Mamifero extends Animal {
    private static ArrayList <Mamifero> listado = new ArrayList <Mamifero>();
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
        listado.add(this);
    }
    public Mamifero(){this(null,0,null,null,false,0);}
    public static int cantidadMamiferos() {
        return listado.size();
    }
    static public Mamifero crearCaballo(String nombre, int edad, String genero){
      caballos += 1;
      return new Mamifero(nombre, edad, "pradera",  genero, true, 4);
    }
    static public Mamifero crearLeon(String nombre, int edad, String genero){
      leones += 1;
      return new Mamifero(nombre, edad, "selva", genero, true, 4);
    }
    public static void setListado(ArrayList<Mamifero> listado) {
		Mamifero.listado=listado;
	}
	public static ArrayList<Mamifero> getListado() {
		return listado;
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
