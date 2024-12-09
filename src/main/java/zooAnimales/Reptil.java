package zooAnimales;

import java.util.ArrayList;

public class Reptil extends Animal{
    static ArrayList <Reptil> listado = new ArrayList <Reptil>();
    public int iguanas;
    public int serpientes;
    private String colorEscamas;
    private int largoCola;

    public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola) {
        setNombre(nombre);
        setEdad(edad);
        setHabitat(habitat);
        setGenero(genero);
        this.colorEscamas = colorEscamas;
        this.largoCola = largoCola;
    }
    public Reptil(){}
    {listado.add(this);}

    public static int cantidadReptiles(){
        return listado.size();
    }
    @Override
    public String movimiento() {
        return "reptar";}
    public void crearIguana(String nombre, int edad, String genero){
        new Reptil(nombre, edad, "humedal", genero, "verde", 3);
        iguanas += 1;
    }
    public void crearSerpiente(String nombre, int edad, String genero){
        new Reptil(nombre, edad, "jungla", genero, "blanco", 1);
        serpientes += 1;
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
