package zooAnimales;

import java.util.ArrayList;

public class Pez extends Animal{
    static ArrayList <Pez> listado = new ArrayList <Pez>();
    public int bacalaos;
    public int salmones;
    private String colorEscamas;
    private int cantidadAletas;

    public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {
        setNombre(nombre);
        setEdad(edad);
        setHabitat(habitat);
        setGenero(genero);
        this.colorEscamas = colorEscamas;
        this.cantidadAletas = cantidadAletas;
    }
    public Pez(){}
    {listado.add(this);}
    public static int cantidadPeces(){
        return listado.size();
    }
    @Override
    public String movimiento() {
        return "nadar";}

    public void crearBacalao(String nombre, int edad, String genero){
        new Pez(nombre, edad, "oceano", genero, "gris", 6);
        bacalaos += 1;
    }
    public void crearSalmon(String nombre, int edad, String genero){
        new Pez(nombre, edad, "oceano", genero, "rojo", 6);
        salmones += 1;
    }
    public String getColorEscamas(){
        return colorEscamas;
    }
    public void setColorEscamas(String colEs){
        this.colorEscamas=colEs;
    }
    public int getCantidadAletas(){
        return cantidadAletas;
    }
    public void setCantidadAletas(int cantAl){
        this.cantidadAletas=cantAl;
    }
}
