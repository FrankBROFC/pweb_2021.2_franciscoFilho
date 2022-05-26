package br.com.frankbr.sistemaPWEB.controller;

import br.com.frankbr.sistemaPWEB.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/clientes")
public class ClienteController {
    private final ClienteRepository clienteRepository;

    @Autowired
    public ClienteController(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @GetMapping
    public ModelAndView listarClientes() {
        return new ModelAndView("clientes/listar")
                .addObject("clientes", clienteRepository.findAll());
    }
}
