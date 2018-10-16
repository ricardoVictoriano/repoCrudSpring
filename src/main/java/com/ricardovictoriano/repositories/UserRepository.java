package com.ricardovictoriano.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ricardovictoriano.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
