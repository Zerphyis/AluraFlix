package dev.Zerpyhis.Aluraflix.entidades.categoria;

import jakarta.validation.constraints.NotBlank;

public record DadosCategoria(@NotBlank String titulo,@NotBlank String cor) {
}
