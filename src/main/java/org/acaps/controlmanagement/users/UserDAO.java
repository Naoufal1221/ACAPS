package org.acaps.controlmanagement.users;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDAO extends JpaRepository<User,String> {

    User findUserByEmailIgnoreCase(String email);
}
