package dev.Zerpyhis.Aluraflix.controller;

import dev.Zerpyhis.Aluraflix.entidades.video.DadosVideo;
import dev.Zerpyhis.Aluraflix.entidades.video.Video;
import dev.Zerpyhis.Aluraflix.services.ServiceVideo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/videos")
public class ControllerVideo {

    @Autowired
    ServiceVideo videoService;


    @PostMapping("/adicionar")
    public ResponseEntity<Video> adicionar(@RequestBody DadosVideo video) {
        return ResponseEntity.ok(videoService.adicionar(video));
    }

    @GetMapping("/buscar")
    public ResponseEntity<List<Video>> listarTodos() {
        return ResponseEntity.ok(videoService.listar());
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
}
