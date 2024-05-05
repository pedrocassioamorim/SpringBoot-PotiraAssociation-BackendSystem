package com.example.associacao_potira.infraestructure.repositories.implementations.people;

import com.example.associacao_potira.domain.people.Client;
import com.example.associacao_potira.infraestructure.repositories.interfaces.people.ClientRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

import java.util.List;

public class ClientRepositoryImpl implements ClientRepository {

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public List<Client> findAll() {
        return entityManager.createQuery("from Client", Client.class).getResultList();
    }

    @Override
    public Client findById(Long id) {
        return entityManager.find(Client.class, id);
    }

    @Override @Transactional
    public Client update(Client client, Long Id) {
        client.setId(Id);
        return entityManager.merge(client);
    }

    @Override @Transactional
    public Client save(Client client) {
        return entityManager.merge(client);
    }

    @Override @Transactional
    public void delete(Long Id) {
        Client client = entityManager.find(Client.class, Id);
        entityManager.remove(client);
    }
}
