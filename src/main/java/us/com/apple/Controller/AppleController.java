package us.com.apple.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import us.com.apple.Modell.AppleCell;

@RestController
public class AppleController {

    @GetMapping("/celular")
    public AppleCell aplleTelefone() {
        AppleCell maca;
        maca = new AppleCell();
        maca.setId(123456);
        maca.setModelo("S9 plus");
        maca.setGeracao("Segunda Geração");
        maca.setValor(10000.00);
        return maca;
    }

    @PostMapping("/novoproduto")
    public String cadastarNovo(@RequestBody AppleCell maca) {
        System.out.println("Recebido: "+maca.getId()+"/"+maca.getModelo()+"/"+maca.getGeracao()+"/"+maca.getValor());
        return "Deu Tudo certo Graças a Deus";
    }
}
// nova alteração 