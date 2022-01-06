package com.devsuperior.adminapi.repository;

import com.devsuperior.adminapi.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.GeneratedValue;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
