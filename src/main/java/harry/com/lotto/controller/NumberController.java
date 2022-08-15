package harry.com.lotto.controller;

import harry.com.lotto.service.LottoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class NumberController {
    private final LottoService lottoService;

    @Autowired
    public NumberController(LottoService lottoService) {
        this.lottoService = lottoService;
    }

    @GetMapping("/check")
    public String checkForm() {
        return "check/createForm";
    }

    @PostMapping("/check")
    public String giveForm(NumberForm form, Model model) {
        model.addAttribute("result", lottoService.solution(form.getNumbers()));

        return "/check/result";
    }
}
