package com.asr.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

import java.time.LocalDate;
import java.util.LinkedList;


@Entity
@Table(name="utente")
@Data
public class Utente implements UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "idUtente")
    private Integer id;

    @Column(name = "startDate")
    private LocalDate startDate;

    @Column(name="usurname")
    private String username;

    @Column(name="password")
    private String password;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> roles = new LinkedList<>();
        roles.add(new Authority("STUDENT_ROLE"));
        return roles;
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }
}
