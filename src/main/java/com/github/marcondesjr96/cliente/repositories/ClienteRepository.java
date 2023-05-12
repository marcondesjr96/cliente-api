package com.github.marcondesjr96.cliente.repositories;

import com.github.marcondesjr96.cliente.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ClienteRepository extends JpaRepository<Cliente, UUID> {
}
