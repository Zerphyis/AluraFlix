package dev.Zerpyhis.Aluraflix.services;

import dev.Zerpyhis.Aluraflix.entidades.categoria.Categoria;
import dev.Zerpyhis.Aluraflix.entidades.repositorios.RepositoryCategoria;
import dev.Zerpyhis.Aluraflix.entidades.repositorios.RepositoryVideo;
import dev.Zerpyhis.Aluraflix.entidades.video.DadosVideo;
import dev.Zerpyhis.Aluraflix.entidades.video.Video;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceVideo {

    @Autowired
    private RepositoryVideo repositoryVideo;

    @Autowired
    private RepositoryCategoria repositoryCategoria;


    public Video adicionar(DadosVideo dados) {
        Categoria categoria = repositoryCategoria.findById(dados.categoriaId())
                .orElseThrow(() -> new RuntimeException("Categoria não encontrada!"));

        Video video = new Video(dados.titulo(), dados.descricao(), dados.url(), categoria);
        return repositoryVideo.save(video);
    }


    public List<Video> listar(Pageable page) {
        return repositoryVideo.findAll(page).getContent();
    }


    public Video buscarPorId(Long id) {
        return repositoryVideo.findById(id)
                .orElseThrow(() -> new RuntimeException("Vídeo não encontrado!"));
    }

    public Video atualizar(Long id, DadosVideo dados) {
        Video video = repositoryVideo.findById(id)
                .orElseThrow(() -> new RuntimeException("Vídeo não encontrado!"));

        Categoria categoria = repositoryCategoria.findById(dados.categoriaId())
                .orElseThrow(() -> new RuntimeException("Categoria não encontrada!"));

        video.setTitulo(dados.titulo());
        video.setDescricao(dados.descricao());
        video.setUrl(dados.url());
        video.setCategoriaId(categoria);

        return repositoryVideo.save(video);
    }


    public void deletar(Long id) {
        Video video = repositoryVideo.findById(id)
                .orElseThrow(() -> new RuntimeException("Vídeo não encontrado!"));

        repositoryVideo.delete(video);
    }

    public List<Video> buscarPorCategoria(Categoria categoria) {
        return repositoryVideo.findByCategoriaId(categoria);
    }

}
