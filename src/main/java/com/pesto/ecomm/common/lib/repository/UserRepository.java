package com.pesto.ecomm.common.lib.repository;


import com.pesto.ecomm.common.lib.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

    User findByUserName(String username);

    User findTopByUserNameEqualsOrEmailEquals(String userName, String email);

    boolean existsByUserName(String username);

}