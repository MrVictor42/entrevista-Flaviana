package com.entrevista.flaviana.controller;

import com.entrevista.flaviana.dto.ProfessorRequestDTO;
import com.entrevista.flaviana.dto.ProfessorResponseDTO;
import com.entrevista.flaviana.service.ProfessorService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/professores")
@RequiredArgsConstructor
public class ProfessorController {

    private final ProfessorService professorService;

    @PostMapping
    public ResponseEntity<ProfessorResponseDTO> criarProfessor(@RequestBody @Valid ProfessorRequestDTO professorRequestDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(professorService.criarProfessor(professorRequestDTO));
    }
}
