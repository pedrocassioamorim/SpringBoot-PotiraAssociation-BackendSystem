package com.example.associacao_potira.infraestructure.repositories.implementations.people.data;

import com.example.associacao_potira.domain.people.data.Address;
import com.example.associacao_potira.infraestructure.repositories.interfaces.people.data.AddressRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

import java.util.List;

public class AddressRepositoryImpl implements AddressRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Address> findAll() {
        return entityManager.createQuery("from Address", Address.class).getResultList();
    }

    @Override
    public Address findById(Long id) {
        return entityManager.find(Address.class, id);
    }

    @Override @Transactional
    public Address update(Address address, Long Id) {
        address.setId(Id);
        return entityManager.merge(address);
    }

    @Override @Transactional
    public Address save(Address address) {
        return entityManager.merge(address);
    }

    @Override @Transactional
    public void delete(Long Id) {
        Address address = findById(Id);
        entityManager.remove(address);
    }
}
