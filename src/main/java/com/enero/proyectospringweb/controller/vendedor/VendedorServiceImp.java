package com.enero.proyectospringweb.controller.vendedor;

import com.enero.proyectospringweb.dao.PersonaDAO;
import com.enero.proyectospringweb.dao.VendedorDAO;
import com.enero.proyectospringweb.model.Persona;
import com.enero.proyectospringweb.model.Vendedor;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional

public class VendedorServiceImp implements VendedorService{
    
    @Autowired
    VendedorDAO vendedorDAO;
    
    @Autowired
    PersonaDAO personaDAO;
    
    @Override
    public List<Vendedor> allVendedor() {
        return vendedorDAO.all();
    }

    @Override
    public Vendedor findVendedor(Long id) {
        return vendedorDAO.find(id);
    }

    @Override
    public void guardarVendedor(Persona persona) {
        if (persona.getId()==null) {
            personaDAO.save(persona);
            
            Vendedor vendedor = new Vendedor();
            vendedor.setPersona(persona);
            vendedorDAO.save(vendedor);
        }else{
            personaDAO.update(persona);
        }
    }

    @Override
    public void deleteVendedor(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
