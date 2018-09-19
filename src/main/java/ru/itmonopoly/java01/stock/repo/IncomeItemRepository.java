package ru.itmonopoly.java01.stock.repo;

import org.springframework.data.repository.CrudRepository;
import ru.itmonopoly.java01.stock.model.IncomeItem;

public interface IncomeItemRepository extends CrudRepository<IncomeItem, Long> {
}