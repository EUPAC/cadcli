package com.dsupper.cadcli.repositories;

import com.dsupper.cadcli.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
