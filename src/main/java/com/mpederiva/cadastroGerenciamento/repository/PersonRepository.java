package com.mpederiva.cadastroGerenciamento.repository;

import com.mpederiva.cadastroGerenciamento.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
