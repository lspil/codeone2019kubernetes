package com.endava.saconf2019e4.repositories;

import com.endava.saconf2019e4.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
