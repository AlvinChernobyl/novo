package us.com.games.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import us.com.games.Modell.GamesModell;

@RestController
public class GamesController {
    @GetMapping("/games")
    public GamesModell modeloGamer(){
        GamesModell game;
        game = new GamesModell();
        game.setId(1548);
        game.setGame("Castelevania");
        game.setAno(2000);
        game.setStudio("Activision");
        return game;
    }

    @PostMapping("/novojogo")
    public String novosJogos(@RequestBody GamesModell game) {
        System.out.println("Novo Jogo Cadastradi: "+game.getId()+"/"+game.getGame()+"/"+game.getAno()+"/"+game.getStudio()+"/");
        return "Novo Jogo Cadsatrado";
    }
}
