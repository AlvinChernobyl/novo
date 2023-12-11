package jp.com.Pokepedia.Controller;

import jp.com.Pokepedia.Modell.Pokemon;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PokeController {

    @GetMapping("/pokemon")
    public Pokemon pokePedia() {
        Pokemon poke;
        poke = new Pokemon();
        poke.setId(50);
        poke.setNome("Ratata");
        poke.setTipo("Normal");
        poke.setShynin("Não");
        return poke;
    }

    @PostMapping("/novopokemon")
    public String novoPoke (@RequestBody Pokemon poke){
        System.out.println("Recebido novo Pokémon: "+poke.getId()+"/"+poke.getNome()+"/"+poke.getTipo()+"/"+poke.getShynin());
        return "Pokémon novo recebido no PokeCenter, Obrigado";
    }
}
