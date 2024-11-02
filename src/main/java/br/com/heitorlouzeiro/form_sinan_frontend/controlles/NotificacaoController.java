package br.com.heitorlouzeiro.form_sinan_frontend.controlles;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.heitorlouzeiro.form_sinan_frontend.models.NotificacaoModels;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/notificacao") 
public class NotificacaoController {

    private List<NotificacaoModels> notificacoes = new ArrayList<>();

    @GetMapping
    public String showForm(Model model) {
        model.addAttribute("notificacao", new NotificacaoModels());
        return "pages/notificacao";
    }

    @PostMapping
    public String submitForm(@ModelAttribute("notificacao") NotificacaoModels notificacao, Model model) {
        notificacoes.add(notificacao);
        System.err.println(notificacao.getNomePaciente());
        return "pages/notificacao-sucesso"; 
        
    }   

    
    @GetMapping("/listar")
    public String listarNotificacoes(Model model) {
        model.addAttribute("notificacoes", notificacoes);
        return "pages/notificacao-listar";
    }

    @DeleteMapping("/delete")
    public String deleteNotificacao(@ModelAttribute("notificacao") NotificacaoModels notificacao, Model model) {
        notificacoes.remove(notificacao);
        return "pages/notificacao-listar";
    }

    @PutMapping("/editar")
    public String atualizar(@ModelAttribute NotificacaoModels notificacao, Model model) {

        notificacao.forEach(p -> {
            if (p.getId().equals(notificacao.getId())) {
                p.setTipoNotificacao(notificacao.getTipoNotificacao());
                p.setAgravoDoenca(notificacao.getAgravoDoenca());
                p.setDataNotificacao(notificacao.getDataNotificacao());
                p.setUf(notificacao.getUf());
                p.setMunicipioNotificacao(notificacao.getMunicipioNotificacao());
                p.setUnidadeSaude(notificacao.getUnidadeSaude());
                p.setCodigoUnidade(notificacao.getCodigoUnidade());
                p.setDataPrimeirosSintomas(notificacao.getDataPrimeirosSintomas());
                p.setNomePaciente(notificacao.getNomePaciente());
                p.setDataNascimento(notificacao.getDataNascimento());
                p.setIdade(notificacao.getIdade());
                p.setTipoIdade(notificacao.getTipoIdade());
                p.setSexo(notificacao.getSexo());
                p.setGestante(notificacao.getGestante());
                p.setRacaCor(notificacao.getRacaCor());
                p.setEscolaridade(notificacao.getEscolaridade());
                p.setCartaoSus(notificacao.getCartaoSus());
                p.setNomeMae(notificacao.getNomeMae());
                p.setUfResidencia(notificacao.getUfResidencia());
                p.setMunicipioResidencia(notificacao.getMunicipioResidencia());
                p.setDistrito(notificacao.getDistrito());
                p.setBairro(notificacao.getBairro());
                p.setLogradouro(notificacao.getLogradouro());
                p.setNumero(notificacao.getNumero());
                p.setComplemento(notificacao.getComplemento());
                p.setGeoCampo1(notificacao.getGeoCampo1());
                p.setGeoCampo2(notificacao.getGeoCampo2());
                p.setPontoReferencia(notificacao.getPontoReferencia());
                p.setCep(notificacao.getCep());
                p.setTelefone(notificacao.getTelefone());
                p.setZona(notificacao.getZona());
                p.setPais(notificacao.getPais());
                
            }
        });

        return "redirect:/notificacao/listar";
    }

}