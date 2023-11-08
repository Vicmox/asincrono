package com.ufps.asincrono.servicio;

import java.util.Optional;

import com.ufps.asincrono.dto.ClienteDTO;
import com.ufps.asincrono.entity.Cliente;
import java.util.Date;

public interface ClienteService {
	
	public Cliente guardar(ClienteDTO clienteDTO);
	public Optional<Cliente> buscar (Long id);
	public long diasDeRegistro (Cliente cliente);
        public Date findByFechaDeRegistro (Cliente cliente);

}
