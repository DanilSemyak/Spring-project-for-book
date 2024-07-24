package ru.semyak.book.supportClasses;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;
import ru.semyak.book.models.Coffee;
import ru.semyak.book.repositories.CoffeeRepository;

import java.util.List;

@Component
public class DataLoader {

    private final CoffeeRepository coffeeRepository;

    public DataLoader(CoffeeRepository coffeeRepository) {
        this.coffeeRepository = coffeeRepository;
    }

    @PostConstruct
    private void loadData() {
        coffeeRepository.saveAll(List.of(
                new Coffee("Café Cereza"),
                new Coffee("Café Ganador"),
                new Coffee("Café Lareño"),
                new Coffee("Café Três Pontas")
        ));
    }
}
