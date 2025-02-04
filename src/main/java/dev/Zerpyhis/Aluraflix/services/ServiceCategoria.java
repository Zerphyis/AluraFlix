package dev.Zerpyhis.Aluraflix.services;

import dev.Zerpyhis.Aluraflix.entidades.categoria.Categoria;
import dev.Zerpyhis.Aluraflix.entidades.categoria.DadosCategoria;
import dev.Zerpyhis.Aluraflix.entidades.repositorios.RepositoryCategoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceCategoria {
    @Autowired
    RepositoryCategoria repository;

    public Categoria adicionar(DadosCategoria dados) {
        Categoria categoria = new Categoria(dados);
        return repository.save(categoria);
    }


    public List<Categoria> listar() {
        return repository.findAll();
    }


    public Categoria buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Categoria não encontrada!"));
    }


    public Categoria atualizar(Long id, DadosCategoria dados) {
        Categoria categoria = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Categoria não encontrada!"));

        categoria.setTitulo(dados.titulo());
        categoria.setCor(dados.cor());

        return repository.save(categoria);
    }


    public void deletar(Long id) {
        Categoria categoria = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Categoria não encontrada!"));

        repository.delete(categoria);
    }
}
