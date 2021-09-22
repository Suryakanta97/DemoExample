package com.surya.thymeleaf.cssandjs;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CssAndJsController {

    @GetMapping("/styled-page")
    public String getStyledPage(Model model) {
        model.addAttribute("name", "surya Reader");
        return "cssandjs/styledPage";
    }
}
