package br.com.heitorlouzeiro.form_sinan_frontend.controlles;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NotificacaoController {

    @GetMapping("/notificacao")
    public String notificacao(Model model) {
        model.addAttribute("tituloPagina", "Notificação");
        return "pages/notificacao";
    }
}
