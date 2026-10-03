package com.entrevista.flaviana.repository;

import com.entrevista.flaviana.model.Aluno;
import com.entrevista.flaviana.model.Disciplina;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DisciplinaRepository extends JpaRepository<Disciplina, Long> {

}