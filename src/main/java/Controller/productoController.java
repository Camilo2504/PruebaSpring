package Controller;

import Entities.Producto;
import Services.productoService;
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
    public String leerProducto(){
        Producto p = new Producto("R01", "Manzana", 5200, 50, "Frutas");
        return p.toString();
    }

    @GetMapping("/ListaProductos")
    public ArrayList<Producto> listaProductos(){
        return this.service.getLista();
    }
}
