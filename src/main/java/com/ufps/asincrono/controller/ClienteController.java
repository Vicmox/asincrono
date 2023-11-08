package com.ufps.asincrono.controller;

import com.ufps.asincrono.entity.Cliente;
import com.ufps.asincrono.repository.ClienteRepository;
import com.ufps.asincrono.servicio.ClienteService;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController {

    @Autowired
    ClienteRepository clienteRepository;

    @Autowired
    ClienteService clienteServicio;

    @GetMapping("/usuarios")
    public List<Cliente> getClienteAll() {

        return clienteRepository.findAll();
    }

    @PostMapping
    public Cliente postNews(@RequestBody Cliente cliente) {

        clienteRepository.save(cliente);

        return cliente;

    }

    @GetMapping("cliente/{id}")
    public Long edadCuentaDelCliente(@PathVariable Long id) {
        Optional<Cliente> elCliente = this.clienteServicio.buscar(id);
        long diasDeCuenta = this.clienteServicio.diasDeRegistro(elCliente.get());
        return diasDeCuenta;
    }

    @PutMapping("/{id}")
    public Cliente putClientebyId(@PathVariable Long id, @RequestBody Cliente cliente) {

        Optional<Cliente> clienteCurrent = clienteRepository.findById(id);

        if (clienteCurrent.isPresent()) {

            Cliente clienteReturn = clienteCurrent.get();

            clienteReturn.setNombre(cliente.getNombre());
            clienteReturn.setApellido(cliente.getApellido());
            clienteReturn.setEmail(cliente.getEmail());

            clienteRepository.save(clienteReturn);

            return clienteReturn;
        }

        return null;

    }

    @DeleteMapping("/{id}")
    public Cliente deleteNewsbyId(@PathVariable Long id) {

        Optional<Cliente> cliente = clienteRepository.findById(id);

        if (cliente.isPresent()) {

            Cliente clienteReturn = cliente.get();

            clienteRepository.deleteById(id);

            return clienteReturn;
        }

        return null;

    }

}
