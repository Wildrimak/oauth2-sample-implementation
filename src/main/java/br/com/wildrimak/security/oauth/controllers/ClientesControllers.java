package br.com.wildrimak.security.oauth.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.wildrimak.security.oauth.models.Cliente;
import br.com.wildrimak.security.oauth.repositories.ClienteRepository;

@RestController
@RequestMapping("/clientes")
public class ClientesControllers {

    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping
    public List<Cliente> listar() {

	return clienteRepository.findAll();

    }
}
