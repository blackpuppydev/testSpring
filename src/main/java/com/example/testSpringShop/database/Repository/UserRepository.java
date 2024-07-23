package com.example.testSpringShop.database.Repository;

import com.example.testSpringShop.database.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {



}
