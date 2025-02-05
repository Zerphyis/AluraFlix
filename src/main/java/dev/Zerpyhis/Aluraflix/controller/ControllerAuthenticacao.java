package dev.Zerpyhis.Aluraflix.controller;

import dev.Zerpyhis.Aluraflix.entidades.repositorios.RepositoryUsuarios;
import dev.Zerpyhis.Aluraflix.entidades.usuarios.AuthenticacaoDto;
import dev.Zerpyhis.Aluraflix.entidades.usuarios.LoginRespostaDto;
import dev.Zerpyhis.Aluraflix.entidades.usuarios.ResgistarDto;
import dev.Zerpyhis.Aluraflix.entidades.usuarios.Usuarios;
import dev.Zerpyhis.Aluraflix.security.ServiceToken;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.token.TokenService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class ControllerAuthenticacao {
        @Autowired
        private AuthenticationManager authenticationManager;
        @Autowired
        private RepositoryUsuarios repository;
        @Autowired
        private ServiceToken tokenService;

        @PostMapping("/login")
        public ResponseEntity login(@RequestBody @Valid AuthenticacaoDto data){
            var usernamePassword = new UsernamePasswordAuthenticationToken(data.login(), data.senha());
            var auth = this.authenticationManager.authenticate(usernamePassword);

            var token = tokenService.generateToken((Usuarios) auth.getPrincipal());

            return ResponseEntity.ok(new LoginRespostaDto(token));
        }

        @PostMapping("/register")
        public ResponseEntity register(@RequestBody @Valid ResgistarDto data){
            if(this.repository.findByLogin(data.login()) != null) return ResponseEntity.badRequest().build();

            String encryptedPassword = new BCryptPasswordEncoder().encode(data.senha());
            Usuarios novoUsario = new Usuarios(data.login(), encryptedPassword);

            this.repository.save(novoUsario);

            return ResponseEntity.ok().build();
        }
}
