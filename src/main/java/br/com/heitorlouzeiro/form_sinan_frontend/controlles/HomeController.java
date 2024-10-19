package br.com.heitorlouzeiro.form_sinan_frontend.controlles;
import org.springframework.web.bind.annotation.GetMapping;

public class HomeController {
    @GetMapping("/")
    public String home() {
        return "home";
    }
    
}
