package org.bank.entities;


import jakarta.persistence.*;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@XmlRootElement
public class Compte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double solde;
    @Temporal(TemporalType.DATE)
    private Date date;
    @Enumerated(EnumType.ORDINAL)
    private TypeCompte type;

    public Compte(Long id, double solde, Date date, TypeCompte type) {
        this.id = id;
        this.solde = solde;
        this.date = date;
        this.type = type;
    }

    public Compte() {

    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setType(TypeCompte type) {
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public double getSolde() {
        return solde;
    }

    public TypeCompte getType() {
        return type;
    }
}