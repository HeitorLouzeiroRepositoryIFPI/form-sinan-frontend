package br.com.heitorlouzeiro.form_sinan_frontend.controlles;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.heitorlouzeiro.form_sinan_frontend.models.User;

import org.springframework.ui.Model;


@Controller
@RequestMapping("/htmx")
public class RequisitHTMXController {

    private List<User> users;

    public RequisitHTMXController(){
        this.users = new ArrayList<>();
    }

    @GetMapping("/users")
    public String exemploHTMX(){
        return "htmx/exemplo-htmx";
    }

    @PostMapping("/submit")
    public String submitForm(@RequestParam String name, @RequestParam String email, @RequestParam String cpf ,Model model) {
        User user = new User();
        user.setName(name);
        user.setEmail(email);
        user.setCpf(cpf);
        users.add(user);
        model.addAttribute("users", users);
        return "fragments/clienteInfo :: informacoes";
    }
    
}
