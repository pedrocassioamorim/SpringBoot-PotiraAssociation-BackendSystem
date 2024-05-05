package com.example.associacao_potira.infraestructure.repositories.interfaces.people.data;

import com.example.associacao_potira.domain.people.data.Permission;

import java.util.List;

public interface PermissionRepository {

    List<Permission> findAll();

    Permission findById(Long id);

    Permission update(Permission permission, Long Id);

    Permission save(Permission permission);

    void delete(Long Id);
}
