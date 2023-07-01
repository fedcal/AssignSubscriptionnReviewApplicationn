package com.asr.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;

@Entity
@Data
@Table(name = "authority")
public class Authority implements GrantedAuthority {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "idAuthority")
    private Integer id;
    @Column(name = "autohorityName")
    private String authority;

    private Utente utente;

    public Authority(String authority){
        this.authority = authority;
    }
}
