package br.edu.fatecrl.mvcdemo.controllers;

import br.edu.fatecrl.mvcdemo.models.Cliente;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller // Informar para a classe que é um controler (cada controller corresponde uma url de acesso para a ação)
@RequestMapping("/clientes")// rota no tomcat [localhost:8080] + ResquestMapping = localhost:8080/clientes
public class ClienteController {

    private static final List<Cliente> clientes = new ArrayList<Cliente>(); // Criando lista de clientes

    public ClienteController() {
        clientes.add(new Cliente("João","joao@gmail.com", "senha1"));
        clientes.add(new Cliente("Maria","maria@gmail.com","senha2"));
        clientes.add(new Cliente("Juliane","juliane@gmail.com","senha3"));
    } // Simular banco de dados para teste

    @GetMapping
    public String getClientes(Model model) {
        model.addAttribute("clientes", clientes);
        return "/clientes"; // como a classe é controller irá retornar a view alunos e não uma string alunos
    }

}
