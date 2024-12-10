package zooAnimales;
import gestion.*;
import java.util.ArrayList;

public class Animal{
  private String nombre;
  private int edad;
  private String habitat;
  private String genero;
  private ArrayList<Zona> zona;

public Animal(String nombre, int edad, String habitat, String genero) {
  this.nombre = nombre;
  this.edad = edad;
  this.habitat = habitat;
  this.genero = genero;
}
public Animal(){}

{this.zona = new ArrayList <Zona>();}

public String movimiento() {
  return "desplazarse";}

public String totalPorTipo(){
    return "Mamiferos: " + Mamifero.cantidadMamiferos() + "\n" +
           "Aves: " + Ave.cantidadAves() + "\n" +
           "Reptiles: " + Reptil.cantidadReptiles() + "\n" +
           "Peces: " + Pez.cantidadPeces() + "\n" +
           "Anfibios: " + Anfibio.cantidadAnfibios();
}
public String toString(){
    if (zona == null){
        return "Mi nombre es "+ getNombre()+", tengo una edad de " +getEdad()+ ", habito en "+getHabitat()+" y mi genero es "+getGenero();
    } else{
        return "Mi nombre es "+ getNombre()+", tengo una edad de " +getEdad()+ ", habito en "+getHabitat()+" y mi genero es "+getGenero()+
        ", la zona en la que me ubico es "+zona.get(0).getNombre()+", en el "+ zona.get(0).getZoo().get(0).getNombre()+".";
      }
}
public String getNombre() {
  return nombre;}
public void setNombre(String nombre) {
  this.nombre = nombre;}

public int getEdad() {
  return edad;}
public void setEdad(int edad) {
  this.edad = edad;}

public String getHabitat() {
  return habitat;}
public void setHabitat(String habitat) {
  this.habitat = habitat;}
  
public String getGenero() {
  return genero;}
public void setGenero(String genero) {
  this.genero = genero;}

public void agregarZona(Zona zona) {
  this.zona.add(zona);}
public ArrayList<Zona> getZona() {
  return zona;}
}