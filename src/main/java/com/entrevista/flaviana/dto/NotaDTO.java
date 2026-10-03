package com.entrevista.flaviana.dto;

import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class NotaDTO {

    @NotNull(message = "O valor da nota é obrigatório")
    @DecimalMin(value = "0.0", message = "A nota mínima é 0.0")
    @DecimalMax(value = "10.0", message = "A nota máxima é 10.0")
    private Double valor;

    @NotNull(message = "O ID do aluno é obrigatório")
    private Long alunoId;

    @NotNull(message = "O ID da disciplina é obrigatório")
    private Long disciplinaId;
}