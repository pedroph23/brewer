package controller;

import model.Cerveja;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by pedro-ramalho on 02/05/18.
 */
@Controller
public class CervejasController {

    @RequestMapping("cervejas/novo")
    public String novo(){

        return "cervejas/CervejasControler";
    }

    @RequestMapping(value = "cervejas/novo", method = RequestMethod.POST)
    public String cadastrar(Cerveja cerveja){

        while (!cerveja.getSku().equals("") && !cerveja.getNome().equals("")){

                System.out.print("SKU: "+cerveja.getSku());
                System.out.print("Nome: " + cerveja.getNome());
                break;
            }

        System.out.print("ERRO");



        return "cervejas/CervejasControler";

    }





}
