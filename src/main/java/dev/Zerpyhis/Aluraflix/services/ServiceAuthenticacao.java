package dev.Zerpyhis.Aluraflix.services;

import dev.Zerpyhis.Aluraflix.entidades.repositorios.RepositoryUsuarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class ServiceAuthenticacao implements UserDetailsService {
    @Autowired
    RepositoryUsuarios repository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return repository.findByLogin(username);
    }
}
