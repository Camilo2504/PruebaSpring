package com.Udea.Prueba_Udea.Controller;

import com.Udea.Prueba_Udea.Entities.Producto;
import com.Udea.Prueba_Udea.Services.productoService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class productoController {

    productoService service;

    public productoController() {
        this.service = new productoService();
    }

    @GetMapping("/LeerProducto")
    public Producto leerProducto(){
        Producto p = new Producto("R01", "Manzana", 5200, 50, "Frutas");
        return p;
    }

    @GetMapping("/ListaProductos")
    public ArrayList<Producto> listaProductos(){
        return this.service.getLista();
    }

    @GetMapping("/Consultar1/{posicion}")
    public Producto consultarUno(@PathVariable("posicion") Integer index){
        return this.service.buscarProducto(index);
    }

    @PostMapping("/Insertar")
    public String crearProducto(@RequestBody Producto p){
        return this.service.crearProducto(p);
    }

    @PutMapping("/Actualizar/{posicion}")
    public String actualizar(@PathVariable("posicion") Integer index, @RequestBody Producto p){
        return this.service.actualizarProducto(index, p);
    }

    @DeleteMapping("/Eliminar/{posicion}")
    public String eliminar(@PathVariable("posicion") Integer index){
        return this.service.eliminarProducto(index);
    }
}
