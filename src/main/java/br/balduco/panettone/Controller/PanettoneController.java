package br.balduco.panettone.Controller;

import br.balduco.panettone.Modell.PanettoneModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PanettoneController {
    @GetMapping("/panettone")
    public PanettoneModel paneteBalduco () {
        PanettoneModel panete;
        panete = new PanettoneModel();
        panete.setId(12345);
        panete.setProduto("Panetone Balduco de Frutas");
        panete.setValor(59.90);
        return panete;
    }
    @PostMapping("/novoproduto")
    public String cadastrarNovo(@RequestBody PanettoneModel panete) {
        System.out.println("recebido: "+panete.getId()+"/"+panete.getProduto()+"/"+panete.getValor());
        return "Deu Tudo certo";
    }
}
