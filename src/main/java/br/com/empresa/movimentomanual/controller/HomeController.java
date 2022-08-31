package br.com.empresa.movimentomanual.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import br.com.empresa.movimentomanual.model.MovimentoManual;
import br.com.empresa.movimentomanual.service.MovimentoManualService;
import br.com.empresa.movimentomanual.util.Pager;

@Controller
public class HomeController {
    private static final int INITIAL_PAGE = 0;

    private final MovimentoManualService movimentoManualService;

    @Autowired
    public HomeController(MovimentoManualService movimentoManualService) {
        this.movimentoManualService = movimentoManualService;
    }

    @GetMapping("/home")
    public ModelAndView home(@RequestParam("page") Optional<Integer> page) {

        // Evaluate page. If requested parameter is null or less than 0 (to
        // prevent exception), return initial size. Otherwise, return value of
        // param. decreased by 1.
        int evalPage = (page.orElse(0) < 1) ? INITIAL_PAGE : page.get() - 1;

        Page<MovimentoManual> movimentoManuals = movimentoManualService.findAllMovimentoManualsPageable(PageRequest.of(evalPage, 5));
        Pager pager = new Pager(movimentoManuals);

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("movimentoManuals", movimentoManuals);
        modelAndView.addObject("pager", pager);
        modelAndView.setViewName("/home");
        
        return modelAndView;
    }
}
