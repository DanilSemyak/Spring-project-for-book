package ru.semyak.book.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.semyak.book.models.Droid;

@RequestMapping("/droid")
@RestController
public class DroidController {

    private final Droid droid;

    public DroidController(Droid droid) {
        this.droid = droid;
    }

    @GetMapping
    public Droid getDroid() {
        return this.droid;
    }
}
