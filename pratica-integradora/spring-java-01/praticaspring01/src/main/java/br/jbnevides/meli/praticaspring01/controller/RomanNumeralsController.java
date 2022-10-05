package br.jbnevides.meli.praticaspring01.controller;

import br.jbnevides.meli.praticaspring01.service.RomanNumerals;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/numerals")
public class RomanNumeralsController {

    @GetMapping("/arabic-number-to-roman/{p}")
    @ResponseBody
    public String converteRomano(@PathVariable String p) {
        return RomanNumerals.toRoman(Integer.parseInt(p));
    }

}
