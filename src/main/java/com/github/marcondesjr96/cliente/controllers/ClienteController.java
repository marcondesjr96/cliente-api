package com.github.marcondesjr96.cliente.controllers;

import com.github.marcondesjr96.cliente.entities.Cliente;
import com.github.marcondesjr96.cliente.services.ClienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("v1/clientes")
public class ClienteController {

    private final ClienteService clienteService;

    @GetMapping
    public Cliente criar(@RequestBody Cliente cliente){
        return clienteService.criar(cliente);
    }
}
