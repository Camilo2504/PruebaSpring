package com.Udea.Prueba_Udea.Controller;

import com.Udea.Prueba_Udea.Entities.Producto;
import com.Udea.Prueba_Udea.Services.productoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
