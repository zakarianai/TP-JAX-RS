package org.bank.repository;

import org.bank.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface CompteRepository extends JpaRepository<Compte, Long> {




}
