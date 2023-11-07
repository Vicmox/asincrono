package com.ufps.asincrono.servicio.impl;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ufps.asincrono.dto.ClienteDTO;
import com.ufps.asincrono.entity.Cliente;
import com.ufps.asincrono.repository.ClienteRepository;
import com.ufps.asincrono.servicio.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	ClienteRepository clienteRepositorio;
	
	@Override
	public Cliente guardar(ClienteDTO clienteDTO) {
		Cliente cliente = new Cliente(clienteDTO.getNombre(),clienteDTO.getApellido(), clienteDTO.getEmail(), clienteDTO.getFecha_inscripcion());
		return clienteRepositorio.save(cliente);
	}

	@Override
	public Optional<Cliente> buscar(Long id) {
		return clienteRepositorio.findById(id);
	}

	@Override
	public long diasDeRegistro(Cliente cliente) {
		return ChronoUnit.DAYS.between(cliente.getFecha_inscripcion(), LocalDate.now());
	}

}
