package us.com.games.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import us.com.games.Modell.Usuario;

@RestController
public class UsuarioController {
    @PostMapping("/login")
    public ResponseEntity<Usuario> login(@RequestBody Usuario dadosLogin) {
        System.out.println("Recebido = "+ dadosLogin.getEmail()+"/"+dadosLogin.getSenha()+"/");
        if (dadosLogin.getEmail().equals("motoblur.connect@gmail.com")) {
            if(dadosLogin.getSenha().equals("98129813220")) {
                Usuario resposta = new Usuario();
                resposta.setId(54321);
                resposta.setNome("Diogo Aluno");
                resposta.setEmail("motoblur.connect@gmail.com");
                resposta.setSenha("**********");
                return ResponseEntity.ok(resposta);
            }
            return ResponseEntity.status(404).build();
        }
        return ResponseEntity.status(401).build();
    }
}
