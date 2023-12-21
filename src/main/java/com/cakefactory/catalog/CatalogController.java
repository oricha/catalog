package com.cakefactory.catalog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class CatalogController {

    private final CatalogService catalogService;

    CatalogController(CatalogService catalogService) {
        this.catalogService = catalogService;
    }

    @GetMapping("/")
    ModelAndView index() {
        return new ModelAndView("catalog", Map.of("items", this.catalogService.getItems()));
    }
}
