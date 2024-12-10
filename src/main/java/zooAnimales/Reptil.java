package zooAnimales;

import java.util.ArrayList;

public class Reptil extends Animal{
    private static ArrayList <Reptil> listado = new ArrayList <Reptil>();
    public static int iguanas;
    public static int serpientes;
    private String colorEscamas;
    private int largoCola;

    public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola) {
        setNombre(nombre);
        setEdad(edad);
        setHabitat(habitat);
        setGenero(genero);
        this.colorEscamas = colorEscamas;
        this.largoCola = largoCola;
        listado.add(this);
    }
    public Reptil(){this(null,0,null,null,null,0);}


    public static int cantidadReptiles(){
        return listado.size();
    }
    @Override
    public String movimiento() {
        return "reptar";}
    public static void setListado(ArrayList<Reptil> listado) {
		Reptil.listado=listado;
	}
	public static ArrayList<Reptil> getListado() {
		return listado;
	}
    static public Reptil crearIguana(String nombre, int edad, String genero){
        iguanas += 1;
        return new Reptil(nombre, edad, "humedal", genero, "verde", 3);
    }
    static public Reptil crearSerpiente(String nombre, int edad, String genero){
        serpientes += 1;
        return new Reptil(nombre, edad, "jungla", genero, "blanco", 1);
    }
    public String getColorEscamas(){
        return colorEscamas;
    }
    public void setColorEscamas(String colEs){
        this.colorEscamas=colEs;
    }
    public int getLargoCola(){
        return largoCola;
    }
    public void setLargoCola(int larCol){
        this.largoCola=larCol;
    }

}
