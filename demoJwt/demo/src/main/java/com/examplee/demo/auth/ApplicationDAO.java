package com.examplee.demo.auth;

import java.util.Optional;

public interface ApplicationDAO {

    Optional<ApplicationUser> selectApplicationUserByUsername(String username);

}
