package com.entrevista.flaviana.dto;

import com.entrevista.flaviana.model.Professor;

public record ProfessorResponseDTO(String nome, String email) {
    public static ProfessorResponseDTO modelToDTO(Professor professor) {
        return new ProfessorResponseDTO(
            professor.getNome(),
            professor.getEmail()
        );
    }
}