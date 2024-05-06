package com.example.associacao_potira.infraestructure.repositories.implementations.company.data;

import com.example.associacao_potira.domain.company.data.Permission;
import com.example.associacao_potira.infraestructure.repositories.interfaces.company.data.PermissionRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

import java.util.List;

public class PermissionRepositoryImpl implements PermissionRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Permission> findAll() {
        return entityManager.createQuery("from Permission", Permission.class).getResultList();
    }

    @Override
    public Permission findById(Long id) {
        return entityManager.find(Permission.class, id);
    }

    @Override @Transactional
    public Permission update(Permission permission, Long Id) {
        permission.setId(Id);
        return entityManager.merge(permission);
    }

    @Override @Transactional
    public Permission save(Permission permission) {
        return entityManager.merge(permission);
    }

    @Override @Transactional
    public void delete(Long Id) {
        Permission permission = findById(Id);
        entityManager.remove(permission);
    }
}
