package dev.Zerpyhis.Aluraflix.controller;

import dev.Zerpyhis.Aluraflix.entidades.categoria.Categoria;
import dev.Zerpyhis.Aluraflix.entidades.categoria.DadosCategoria;
import dev.Zerpyhis.Aluraflix.services.ServiceCategoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/categoria")
public class ControllerCategoria {

        @Autowired
        ServiceCategoria categoriaService;


        @PostMapping("/adicionar")
        public ResponseEntity<Categoria> adicionar(@RequestBody DadosCategoria categoria) {
            return ResponseEntity.ok(categoriaService.adicionar(categoria));
        }

        @GetMapping("/buscar")
        public ResponseEntity<List<Categoria>> listarTodas(@PageableDefault(size = 10) Pageable pageable) {
            return ResponseEntity.ok(categoriaService.listar(pageable));
        }

        @GetMapping("/buscar/{id}")
        public ResponseEntity<Categoria> buscarPorId(@PathVariable Long id) {
            return ResponseEntity.ok(categoriaService.buscarPorId(id));
        }

        @PutMapping("/atualizar/{id}")
        public ResponseEntity<Categoria> atualizar(@PathVariable Long id, @RequestBody DadosCategoria categoria) {
            return ResponseEntity.ok(categoriaService.atualizar(id, categoria));
        }

        @DeleteMapping("/deletar/{id}")
        public ResponseEntity<Void> deletar(@PathVariable Long id) {
            categoriaService.deletar(id);
            return ResponseEntity.noContent().build();
        }
}
