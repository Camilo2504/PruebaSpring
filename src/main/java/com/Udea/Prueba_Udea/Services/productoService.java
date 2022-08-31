package com.Udea.Prueba_Udea.Services;

import com.Udea.Prueba_Udea.Entities.Producto;
import java.util.ArrayList;

public class productoService {

    //Constructor
    public productoService(){
        this.datosIniciales();
    }

    //Datos de la lista
    public ArrayList<Producto> getLista() {
        return lista;
    }

    ArrayList<Producto> lista = new ArrayList<>();

    public void datosIniciales(){
        lista.add(new Producto("RE01", "Naranjas", 4500, 60, "Frutas"));
        lista.add(new Producto("RE02", "Manzanas", 5800, 40, "Frutas"));
        lista.add(new Producto("RE03", "Pollo", 15000, 20, "Carnes"));
        lista.add(new Producto("RE04", "Tomate", 2500, 80, "Verduras"));
        lista.add(new Producto("RE05", "Cebolla", 3000, 70, "Verduras"));
    }

    public Producto buscarProducto(int index){
        return lista.get(index);
    }

    public String crearProducto(Producto p){
        lista.add(p);
        return "Producto registrado";
    }

    public String actualizarProducto(int index, Producto p){
        lista.set(index, p);
        return "Producto modificado";
    }

    public String eliminarProducto(int index){
        lista.remove(index);
        return "Producto eliminado";
    }
}
