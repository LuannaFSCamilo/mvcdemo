package br.edu.fatecrl.mvcdemo.controllers;

import br.edu.fatecrl.mvcdemo.models.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/cliente")
public class DadosController {
    private static final List<Cliente> clientes = new ArrayList<Cliente>();

    public DadosController() {
        clientes.add(new Cliente("João","joao@gmail.com", "senha1"));
        clientes.add(new Cliente("Maria","maria@gmail.com","senha2"));
        clientes.add(new Cliente("Juliane","juliane@gmail.com","senha3"));
    }

    @GetMapping
    public List<Cliente> getClientes()
    {
        return clientes;
    }
}
