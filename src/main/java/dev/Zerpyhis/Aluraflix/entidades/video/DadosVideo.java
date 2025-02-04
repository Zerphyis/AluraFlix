package dev.Zerpyhis.Aluraflix.entidades.video;

import dev.Zerpyhis.Aluraflix.entidades.categoria.Categoria;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;

public record DadosVideo(@NotBlank String titulo, @NotBlank String descricao, @NotBlank String url, @NotEmpty Long categoriaId) {
}
