package dev.Zerpyhis.Aluraflix.controller;

import dev.Zerpyhis.Aluraflix.entidades.categoria.Categoria;
import dev.Zerpyhis.Aluraflix.entidades.video.DadosVideo;
import dev.Zerpyhis.Aluraflix.entidades.video.Video;
import dev.Zerpyhis.Aluraflix.services.ServiceCategoria;
import dev.Zerpyhis.Aluraflix.services.ServiceVideo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/videos")
public class ControllerVideo {

    @Autowired
    ServiceVideo videoService;
    @Autowired
    ServiceCategoria serviceCategoria;

    @PostMapping("/adicionar")
    public ResponseEntity<Video> adicionar(@RequestBody DadosVideo video) {
        return ResponseEntity.ok(videoService.adicionar(video));
    }

    @GetMapping("/buscar")
    public ResponseEntity<List<Video>> listarTodos(@PageableDefault(size = 10) Pageable pageable) {
        return ResponseEntity.ok(videoService.listar(pageable));
    }

    @GetMapping("/buscar/{id}")
    public ResponseEntity<Video> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(videoService.buscarPorId(id));
    }

    @PutMapping("/atualizar/{id}")
    public ResponseEntity<Video> atualizar(@PathVariable Long id, @RequestBody DadosVideo video) {
        return ResponseEntity.ok(videoService.atualizar(id, video));
    }

    @DeleteMapping("/deletar/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        videoService.deletar(id);
        return ResponseEntity.noContent().build();
    }
    @GetMapping("/buscar/categoria/{categoriaId}")
    public ResponseEntity<List<Video>> buscarPorCategoria(@PathVariable Long categoriaId) {
        Categoria categoria = serviceCategoria.buscarPorId(categoriaId);
        List<Video> videos = videoService.buscarPorCategoria(categoria);
        return ResponseEntity.ok(videos);
    }
}
