package dev.Zerpyhis.Aluraflix.entidades.repositorios;

import dev.Zerpyhis.Aluraflix.entidades.categoria.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryCategoria extends JpaRepository<Categoria ,Long> {
}
