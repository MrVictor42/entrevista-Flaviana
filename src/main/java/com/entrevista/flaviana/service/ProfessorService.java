package com.entrevista.flaviana.service;

import com.entrevista.flaviana.dto.ProfessorRequestDTO;
import com.entrevista.flaviana.dto.ProfessorResponseDTO;
import com.entrevista.flaviana.exception.EmailJaRegistradoException;
import com.entrevista.flaviana.model.Professor;
import com.entrevista.flaviana.repository.ProfessorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProfessorService {

    private final ProfessorRepository professorRepository;

    public ProfessorResponseDTO criarProfessor(ProfessorRequestDTO professorRequestDTO) {

        if (professorRepository.existsByEmail(professorRequestDTO.email())) {
            throw new EmailJaRegistradoException("E-mail já cadastrado no sistema.");
        }

        Professor professor = new Professor();

        professor.setNome(professorRequestDTO.nome());
        professor.setEmail(professorRequestDTO.email());

        professor = professorRepository.save(professor);

        return ProfessorResponseDTO.modelToDTO(professor);
    }
}