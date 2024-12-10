package zooAnimales;

import java.util.ArrayList;

public class Ave extends Animal {
    static ArrayList <Ave> listado = new ArrayList <Ave>();
    public static int halcones;
    public static int aguilas;
    private String colorPlumas;

    public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas){
        super(nombre, edad, habitat, genero);
        this.colorPlumas = colorPlumas;
        listado.add(this);
    }
    public Ave(){this(null,0,null,null,null);}

    public static int cantidadAves(){
        return listado.size();
    }
    @Override
    public String movimiento() {
        return "volar";}

    static public Ave crearHalcon(String nombre, int edad, String genero){
        halcones += 1;
        return new Ave(nombre, edad, "montanas", genero, "cafe glorioso");
        
    }
    static public Ave crearAguila(String nombre, int edad, String genero){
        halcones += 1;
        return new Ave(nombre, edad, "montanas", genero, "blanco y amarillo");
        
    }
    public String getColorPlumas(){
        return colorPlumas;
    }
    public void setColorPlumas(String colorPlumas){
        this.colorPlumas=colorPlumas;
    }
    public static void setListado(ArrayList<Ave> listado) {
		Ave.listado=listado;
	}
	public static ArrayList<Ave> getListado() {
		return listado;
	}

}
