package com.enero.proyectospringweb.controller.vendedor;

import com.enero.proyectospringweb.model.Persona;
import com.enero.proyectospringweb.model.Vendedor;
import java.util.List;

public interface VendedorService{
    List<Vendedor> allVendedor();
    Vendedor findVendedor(Long id);
    void guardarVendedor(Persona persona);
    void deleteVendedor(Long id);
}
