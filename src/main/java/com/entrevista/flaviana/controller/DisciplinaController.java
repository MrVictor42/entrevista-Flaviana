package com.entrevista.flaviana.controller;

import com.entrevista.flaviana.dto.DisciplinaDTO;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/disciplinas")
public class DisciplinaController {

    @PostMapping
    public ResponseEntity<DisciplinaDTO> createDisciplina(@RequestBody @Valid DisciplinaDTO disciplinaDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(disciplinaDTO);
    }
}