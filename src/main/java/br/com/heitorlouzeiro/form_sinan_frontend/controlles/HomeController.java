
package br.com.heitorlouzeiro.form_sinan_frontend.controlles;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("tituloPagina", "Página Inicial");
        return "pages/homePage";
    }
}