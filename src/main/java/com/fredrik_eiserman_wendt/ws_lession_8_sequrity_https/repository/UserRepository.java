package com.fredrik_eiserman_wendt.ws_lession_8_sequrity_https.repository;

import com.fredrik_eiserman_wendt.ws_lession_8_sequrity_https.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  UserRepository extends JpaRepository<User, Long> {


}
