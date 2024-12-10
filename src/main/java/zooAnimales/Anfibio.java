package zooAnimales;

import java.util.ArrayList;

public class Anfibio extends Animal{
    static ArrayList <Anfibio> listado = new ArrayList <Anfibio>();
    public static int ranas;
    public static int salamandras;
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
    static public Anfibio crearRana(String nombre, int edad, String genero){
        ranas ++;
        return new Anfibio(nombre, edad, "selva", genero, "rojo", true);
    }
    static public Anfibio crearSalamandra(String nombre, int edad, String genero){
        salamandras += 1;
        return new Anfibio(nombre, edad, "selva", genero, "negro y amarillo", false);
    }
    public String getColorPiel(){
        return colorPiel;
    }
    public void setColorPiel(String colPi){
        this.colorPiel=colPi;
    }
    public boolean isVenenoso(){
        return venenoso;
    }
    public void setVenenoso(boolean ven){
        this.venenoso=ven;
    }
    public static void setListado(ArrayList<Anfibio> listado) {
		Anfibio.listado=listado;
	}
	public static ArrayList<Anfibio> getListado() {
		return listado;
	}

}
