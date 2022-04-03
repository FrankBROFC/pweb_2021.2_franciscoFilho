package br.com.frank.cadpessoas.cadpessoas_frank.controller;

import br.com.frank.cadpessoas.cadpessoas_frank.model.Pessoa;
import br.com.frank.cadpessoas.cadpessoas_frank.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/")
public class PessoaController {
    private final PessoaRepository pessoaRepository;

    @Autowired
    public PessoaController(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }

    @GetMapping
    public ModelAndView index() {
        return new ModelAndView("index");
    }

    @GetMapping("/listarPessoas")
    public ModelAndView listarPessoas() {
        return new ModelAndView("listarPessoas").addObject("pessoas", pessoaRepository.findAll());
    }

    @GetMapping("/deletar/{id}")
    public ModelAndView removerPessoa(@PathVariable("id") Long id) {
        Pessoa pessoa = pessoaRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Não encontrado esse id: " + id));
        pessoaRepository.delete(pessoa);

        return new ModelAndView("redirect:/listarPessoas");
    }

    @GetMapping("/adicionarPessoa")
    public ModelAndView getFormAdicionarPessoa() {
        return new ModelAndView("adicionarPessoa").addObject(new Pessoa());
    }

    @PostMapping("/adicionarPessoa")
    public ModelAndView adicionarPessoa(Pessoa pessoa) {
        pessoaRepository.save(pessoa);

        return new ModelAndView("redirect:/listarPessoas");
    }

    @GetMapping("/editarPessoa/{id}")
    public ModelAndView getFormEditarPessoa(@PathVariable("id") Long id) {
        Pessoa pessoa = pessoaRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Não encontrado esse id: " + id));

        return new ModelAndView("editarPessoa").addObject(pessoa);
    }

    @PostMapping("/editarPessoa/{id}")
    public ModelAndView EditarPessoa(@PathVariable("id") Long id, Pessoa pessoa) {
        pessoaRepository.save(pessoa);

        return new ModelAndView("redirect:/listarPessoas");
    }
}
