package dev.Zerpyhis.Aluraflix.entidades.video;

import dev.Zerpyhis.Aluraflix.entidades.categoria.Categoria;
import jakarta.persistence.*;


@Entity
@Table(name = "tb_video")
public class Video {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String descricao;
    private String titulo;
    private String url;
    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoriaId;

    public Video(){

    }

    public Video(String descricao, String titulo, String url, Categoria categoriaId) {
        this.descricao = descricao;
        this.titulo = titulo;
        this.url = url;
        this.categoriaId = categoriaId;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public long getId() {
        return id;
    }

    public Categoria getCategoriaId() {
        return categoriaId;
    }

    public void setCategoriaId(Categoria categoriaId) {
        this.categoriaId = categoriaId;
    }
}

