package zooAnimales;

import java.util.ArrayList;

public class Ave extends Animal {
    static ArrayList <Ave> listado = new ArrayList <Ave>();
    public int halcones;
    public int aguilas;
    private String colorPlumas;

    public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas){
        super(nombre, edad, habitat, genero);
        this.colorPlumas = colorPlumas;
    }
    public Ave(){}
    {listado.add(this);}

    public static int cantidadAves(){
        return listado.size();
    }
    @Override
    public String movimiento() {
        return "volar";}

    public void crearHalcon(String nombre, int edad, String genero){
        new Ave(nombre, edad, "montanas", genero, "cafe glorioso");
        halcones += 1;
    }
    public void crearAguila(String nombre, int edad, String genero){
        new Ave(nombre, edad, "montanas", genero, "blanco y amarillo");
        halcones += 1;
    }
    public String getColorPlumas(){
        return colorPlumas;
    }
    public void setColorPlumas(String colorPlumas){
        this.colorPlumas=colorPlumas;
    }

}
