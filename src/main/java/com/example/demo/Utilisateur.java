package com.example.demo;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class Utilisateur {
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Integer id;

  private String nom;
  private String prenom;
  private String email;
  private Date date_naissance;
  private String pays;
  private String ville;
  private String code_postal;
  private Integer nombre_achat;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }
  public String getNom() {
    return nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }
  public String getprenom() {
    return prenom;
  }

  public void setPrenom(String prenom) {
    this.prenom = prenom;
  }
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
  public Date getDate_naissance() {
    return date_naissance;
  }

  public void setDate_naissance(Date date_naissance) {
    this.date_naissance = date_naissance;
  }
  public String getPays() {
    return pays;
  }

  public void setPays(String pays) {
    this.pays = pays;
  }

  public String getVille() {
    return ville;
  }

  public void setVille(String ville) {
    this.ville = ville;
  }

  public String getCode_postal() {
    return code_postal;
  }

  public void setCode_postal(String code_postal) {
    this.code_postal = code_postal;
  }

  public Integer getNombre_achat() {
    return nombre_achat;
  }

  public void setNombre_achat(Integer nombre_achat) {
    this.nombre_achat = nombre_achat;
  }
}