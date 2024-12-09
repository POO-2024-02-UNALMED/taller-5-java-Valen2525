package zooAnimales;

import java.util.ArrayList;

public class Anfibio extends Animal{
    static ArrayList <Anfibio> listado = new ArrayList <Anfibio>();
    public int ranas;
    public int salamandras;
    private String colorPiel;
    private boolean venenoso;

    public Anfibio(String nombre, int edad, String habitat, String genero, String colPi, boolean ven) {
        setNombre(nombre);
        setEdad(edad);
        setHabitat(habitat);
        setGenero(genero);
        this.colorPiel=colPi;
        this.venenoso=ven;
    }
    public Anfibio(){}
    {listado.add(this);}
    public static int cantidadAnfibios(){
        return listado.size();
    }
    @Override
    public String movimiento() {
        return "saltar";}
    public void crearRana(String nombre, int edad, String genero){
        new Anfibio(nombre, edad, "selva", genero, "rojo", true);
        ranas += 1;
    }
    public void crearSalamandra(String nombre, int edad, String genero){
        new Anfibio(nombre, edad, "selva", genero, "negro y amarillo", false);
        salamandras += 1;
    }
    public String getColorPiel(){
        return colorPiel;
    }
    public void setColorPiel(String colPi){
        this.colorPiel=colPi;
    }
    public boolean getVenenoso(){
        return venenoso;
    }
    public void setVenenoso(boolean ven){
        this.venenoso=ven;
    }

}
