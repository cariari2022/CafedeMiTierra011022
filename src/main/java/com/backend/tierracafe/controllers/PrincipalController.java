package com.backend.tierracafe.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.backend.tierracafe.services.ProductoService;

import lombok.AllArgsConstructor;


@AllArgsConstructor
@Controller
public class PrincipalController {
    
    @Autowired  
    ProductoService productoService;

    @GetMapping(value = { "/", "/index", "/index.html" })
    public String goToIndex(Model model) {
        model.addAttribute("page", "home");
        return "index";
    }

    @GetMapping("/contacto")
    public String goToContact(Model model) {
        model.addAttribute("page", "contacto");
        return "contacto";
    }

    @GetMapping("/cliente")
    public String goToClient(Model model) {
        model.addAttribute("page", "cliente");
        return "cliente";
    }

    @GetMapping("/productos")
    public String goToProductos(Model model) {

        //var products = this.productoService.listarProductos();

        model.addAttribute("product", "product");
        return "productos";
    }

    @GetMapping("/quienesSomos")
    public String goToQuienesSomos(Model model) {
        model.addAttribute("page", "quienesSomos");
        return "quienesSomos";
    }

    @GetMapping("/loginadmin")
    public String goTologinadmin(Model model) {

        model.addAttribute("page", "loginadmin");
        return "loginadmin";
    }

}
