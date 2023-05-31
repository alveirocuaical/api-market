package com.api.market.domain.repository;


import com.api.market.domain.Category;

import java.util.List;
import java.util.Optional;

public interface CategoryRepository {

    List<Category> getAll();

    Optional<Category> getById(int categoryId);

    Category save(Category category);

    void delete(int categoryId);

}
