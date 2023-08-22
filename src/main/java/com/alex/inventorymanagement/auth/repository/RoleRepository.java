package com.alex.inventorymanagement.auth.repository;

import com.alex.inventorymanagement.auth.entity.Role;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;


public interface RoleRepository extends CrudRepository<Role, Long> {

    Optional<Role> findOneByName(String name);

}