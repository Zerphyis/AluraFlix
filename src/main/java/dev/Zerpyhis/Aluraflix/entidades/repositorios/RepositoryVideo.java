package dev.Zerpyhis.Aluraflix.entidades.repositorios;

import dev.Zerpyhis.Aluraflix.entidades.categoria.Categoria;
import dev.Zerpyhis.Aluraflix.entidades.video.Video;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RepositoryVideo extends JpaRepository<Video,Long> {
    List<Video> findByCategoriaId(Categoria categoriaId);
}
