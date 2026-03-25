package com.example.madara.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class UserEntity {
    public enum Status {
        ACTIF,
        INACTIF
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsers;

    @Column(name = "nom", nullable = false, unique = false)
    private String nomUsers;

    @Column(name = "prenom", nullable = false, unique = false)
    private String prenomUsers;

    @Column(name = "email", nullable = false, unique = true)
    private String emailUsers;

    @Column(name = "telephone", nullable = false, unique = true)
    private String telephoneUsers;

    @Column(name = "password", nullable = false, unique = false)
    private String passwordUsers;

    @Column(name = "role", nullable = false, unique = false)
    private String roleUsers;

    @Enumerated(EnumType.STRING)
    @Column(columnDefinition = "ENUM('ACTIF','INACTIF') DEFAULT 'ACTIF'")
    private Status status = Status.ACTIF;

    public UserEntity() {}

    public UserEntity(String nomUsers, String prenomUsers, String emailUsers, String telephoneUsers, String passwordUsers, String roleUsers,Status status) {
        this.nomUsers = nomUsers;
        this.prenomUsers = prenomUsers;
        this.emailUsers = emailUsers;
        this.telephoneUsers = telephoneUsers;
        this.passwordUsers = passwordUsers;
        this.roleUsers = roleUsers;
        this.status = Status.ACTIF;
    }

    public Long getIdUsers() { return idUsers;}
    public void setIdUsers(Long idUsers) { this.idUsers = idUsers; }
    public String getNomUsers() { return nomUsers; }
    public void setNomUsers(String nomUsers) { this.nomUsers = nomUsers; }
    public String getPrenomUsers() { return prenomUsers; }
    public void setPrenomUsers(String prenomUsers) { this.prenomUsers = prenomUsers; }
    public String getEmailUsers() { return emailUsers; }
    public void setEmailUsers(String emailUsers) { this.emailUsers = emailUsers; }
    public String getTelephoneUsers() { return telephoneUsers; }
    public void setTelephoneUsers(String telephoneUsers) { this.telephoneUsers = telephoneUsers; }
    public String getPasswordUsers() { return passwordUsers; }
    public void setPasswordUsers(String passwordUsers) { this.passwordUsers = passwordUsers; }
    public String getRoleUsers() { return roleUsers; }
    public void setRoleUsers(String roleUsers) { this.roleUsers = roleUsers; }
    public Status getStatus() { return status; }
    public void setStatus(Status status) { this.status = status; }
}
