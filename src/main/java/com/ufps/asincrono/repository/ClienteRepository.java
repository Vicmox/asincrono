
package com.ufps.asincrono.repository;

import com.ufps.asincrono.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository <Cliente, Long> {
    
}
