package com.github.marcondesjr96.cliente.services.impl;

import com.github.marcondesjr96.cliente.entities.Cliente;
import com.github.marcondesjr96.cliente.repositories.ClienteRepository;
import com.github.marcondesjr96.cliente.services.ClienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClienteServiceImpl implements ClienteService {

    private final ClienteRepository clienteRepository;

    @Override
    public Cliente criar(Cliente cliente) {
        return clienteRepository.save(cliente);
    }
}
