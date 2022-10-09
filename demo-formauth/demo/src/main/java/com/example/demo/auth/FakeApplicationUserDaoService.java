package com.example.demo.auth;

import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

import static com.example.demo.security.ApplicationUserRole.*;

@Repository("fake")
public class FakeApplicationUserDaoService implements ApplicationDAO {

    private final PasswordEncoder passwordEncoder;

    @Autowired
    public FakeApplicationUserDaoService(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public Optional<ApplicationUser> selectApplicationUserByUsername(String username) {
        return getApplicationUsers()
                .stream()
                .filter(applicationUser -> username.equals(applicationUser.getUsername()))
                .findFirst();
    }

    private List<ApplicationUser> getApplicationUsers() {
        List<ApplicationUser> applicationUsers = Lists.newArrayList(
                new ApplicationUser(passwordEncoder.encode("ugur2003"),
                        "ugurukku",
                        STUDENT.getGrantedAuthorities(),

                        true,
                        true,
                        true,
                        true),

                new ApplicationUser(passwordEncoder.encode("ugur2003"),
                        "linda",
                        ADMIN.getGrantedAuthorities(),

                        true,
                        true,
                        true,
                        true),

                new ApplicationUser(passwordEncoder.encode("ugur2003"),
                        "tom",
                        ADMINTRAINEE.getGrantedAuthorities(),

                        true,
                        true,
                        true,
                        true)
        );
        return applicationUsers;
    }

}
