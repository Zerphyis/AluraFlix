package dev.Zerpyhis.Aluraflix.entidades.categoria;

import dev.Zerpyhis.Aluraflix.entidades.video.Video;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

import java.util.ArrayList;
import java.util.List;

@Table(name = "tb_categoria")
@Entity
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String titulo;
    @NotBlank
    private String cor;
    @OneToMany(mappedBy = "categoriaId", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Video> videos = new ArrayList<>();

public  Categoria(){

}
public  Categoria(DadosCategoria dados){

    this.titulo= dados.titulo();
    this.cor= dados.cor();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
