package gestion;
import java.util.ArrayList;
import zooAnimales.*;

public class Zona{
    private String nombre;
    private ArrayList <Zoologico> zoo;
    private ArrayList <Animal> animales; 

    public Zona(){}
    public Zona(String nombre) {
    this.nombre = nombre;
    this.animales = new ArrayList <Animal>();
    this.zoo = new ArrayList <Zoologico>();
    }
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public ArrayList <Zoologico> getZoo(){
        return zoo;
    }
    
    public void agregarAnimal(Animal animal) {
        this.animales.add(animal);}
    
    public int cantidadAnimales() {
        return animales.size();}
}