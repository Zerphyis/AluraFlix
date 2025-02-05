package dev.Zerpyhis.Aluraflix.entidades.repositorios;

import dev.Zerpyhis.Aluraflix.entidades.usuarios.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryUsuarios extends JpaRepository<Usuarios,String> {
        UserDetails findByLogin(String login);

}
