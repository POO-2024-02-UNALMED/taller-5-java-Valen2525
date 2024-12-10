package zooAnimales;

import java.util.ArrayList;

public class Pez extends Animal{
    private static ArrayList <Pez> listado = new ArrayList <Pez>();
    public static int bacalaos;
    public static int salmones;
    private String colorEscamas;
    private int cantidadAletas;

    public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {
        setNombre(nombre);
        setEdad(edad);
        setHabitat(habitat);
        setGenero(genero);
        this.colorEscamas = colorEscamas;
        this.cantidadAletas = cantidadAletas;
        Pez.listado.add(this);
    }
    public Pez(){this(null,0,null,null,null,0);}
    
    public static int cantidadPeces(){
        return listado.size();
    }
    @Override
    public String movimiento() {
        return "nadar";}

    public static void setListado(ArrayList<Pez> listado) {
		Pez.listado=listado;
	}
	public static ArrayList<Pez> getListado() {
		return listado;
	}
    public static Pez crearSalmon(String nombre, int edad, String genero) {
		salmones++;
		return new Pez(nombre, edad,"oceano", genero, "rojo", 6);
	}
	public static Pez crearBacalao(String nombre, int edad, String genero) {
		bacalaos++;
		return new Pez(nombre, edad, "oceano", genero, "gris", 6);
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
