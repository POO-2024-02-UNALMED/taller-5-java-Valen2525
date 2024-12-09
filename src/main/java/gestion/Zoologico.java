package gestion;
import java.util.ArrayList;

public class Zoologico {
    private String nombre;
    private String ubicacion;
    private ArrayList <Zona> zonas;

public Zoologico(String nombre, String ubicacion) {
    this.nombre = nombre;
    this.ubicacion = ubicacion;
    }
public Zoologico(){}
    {this.zonas = new ArrayList <Zona>();}
    
public String getNombre() {
    return nombre;}
public void setNombre(String nombre) {
    this.nombre = nombre;}
public String getUbicacion() {
    return ubicacion;}
public void setUbicacion(String ubicacion) {
    this.ubicacion = ubicacion;}
    
public void agregarZonas(Zona zona) {
    this.zonas.add(zona);}
    
public int cantidadTotalAnimales() {
    int cantidadTotal = 0;
    for (Zona zona : zonas) {
    cantidadTotal += zona.cantidadAnimales();
    }
    return cantidadTotal;
    }
}  