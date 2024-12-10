package gestion;
import java.util.ArrayList;
import zooAnimales.*;

public class Zona{
    private String nombre;
    private Zoologico zoo;
    private ArrayList <Animal> animales; 

    public Zona(){this(null,null);}
    public Zona(String nombre, Zoologico zoo) {
    this.nombre = nombre;
    this.zoo = zoo;
    this.animales = new ArrayList <Animal>();
    }
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Zoologico getZoo(){
        return zoo;
    }
    public void getZoo(Zoologico zoo){
        this.zoo = zoo;
    }
    public void setAnimales(ArrayList<Animal> animales) {
		this.animales=animales;
	}
	public  ArrayList<Animal> getAnimales() {
		return animales;
	}
    public void agregarAnimal(Animal animal) {
        this.animales.add(animal);}
    
    public int cantidadAnimales() {
        return animales.size();}
}