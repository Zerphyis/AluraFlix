package dev.Zerpyhis.Aluraflix.security;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.auth0.jwt.exceptions.JWTVerificationException;
import dev.Zerpyhis.Aluraflix.entidades.usuarios.Usuarios;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

@Service
public class ServiceToken {
    @Value("${api.security.token.secret}")
    private String secret;

    public String generateToken(Usuarios usuario){
        try{
            Algorithm algoritimo = Algorithm.HMAC256(secret);
            String token = JWT.create()
                    .withIssuer("Aluraflix")
                    .withSubject(usuario.getUsername())
                    .withExpiresAt(genExpirationDate())
                    .sign(algoritimo);
            return token;
        } catch (JWTCreationException exception) {
            throw new RuntimeException("Erro ao gerar token", exception);
        }
    }

    public String validateToken(String token){
        try {
            Algorithm algorithm = Algorithm.HMAC256(secret);
            return JWT.require(algorithm)
                    .withIssuer("Aluraflix")
                    .build()
                    .verify(token)
                    .getSubject();
        } catch (JWTVerificationException exception){
            return "";
        }
    }

    private Instant genExpirationDate(){
        return LocalDateTime.now().plusHours(2).toInstant(ZoneOffset.of("-03:00"));
    }
}
