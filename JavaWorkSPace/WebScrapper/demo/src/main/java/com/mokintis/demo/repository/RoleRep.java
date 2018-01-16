package com.mokintis.demo.repository;



import com.mokintis.demo.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RoleRep extends JpaRepository<Role, Long> {
}
