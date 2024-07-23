package ru.semyak.book.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.semyak.book.models.Coffee;

public interface CoffeeRepository extends CrudRepository<Coffee, String> {

}
