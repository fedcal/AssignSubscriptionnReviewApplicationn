package com.asr.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="assignments")
public class Assignment {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "idAssignment")
    private Integer id;

    @Column(name = "status")
    private String status;

    @Column(name = "gitHubUrl")
    private String gitHubUrl;

    @Column(name = "branchName")
    private String branchName;

    @Column(name = "codeReviewVideoUrl")
    private String codeReviewVideoUrl;

    @ManyToOne(optional = false,fetch = FetchType.LAZY)
    @JoinColumn(name = "idUtente")
    private Utente assignedTo;
}
