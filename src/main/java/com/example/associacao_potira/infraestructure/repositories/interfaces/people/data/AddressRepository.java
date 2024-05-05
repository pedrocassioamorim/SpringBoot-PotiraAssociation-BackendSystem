package com.example.associacao_potira.infraestructure.repositories.interfaces.people.data;

import com.example.associacao_potira.domain.people.data.Address;

import java.util.List;

public interface AddressRepository {

    List<Address> findAll();

    Address findById(Long id);

    Address update(Address address, Long Id);

    Address save(Address address);

    void delete(Long Id);

}
