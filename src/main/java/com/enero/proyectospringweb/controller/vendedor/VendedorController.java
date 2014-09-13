package com.enero.proyectospringweb.controller.vendedor;

import com.enero.proyectospringweb.model.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/adm/vendedor")
public class VendedorController {
    
    @Autowired
    VendedorService service;
    
    @RequestMapping(method = RequestMethod.GET)
    public String index(Model model){
        model.addAttribute("vendedores", service.allVendedor());
        return "vendedor/index";
    }
    
    @RequestMapping("nuevo")
    public String nuevo(Model model){
        return "vendedor/formulario";
    }
    
    @RequestMapping("editar")
    public String editar(Model model){
        return "vendedor/formulario";
    }
    
    @RequestMapping("guardar")
    public String guardar(Persona persona, Model model){
        service.guardarVendedor(persona);
        return "redirect:/adm/vendedor";
    }
    
}
