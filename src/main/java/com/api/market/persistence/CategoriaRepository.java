package com.api.market.persistence;

import com.api.market.domain.Category;
import com.api.market.domain.repository.CategoryRepository;
import com.api.market.persistence.crud.CategoriaCrudRepository;
import com.api.market.persistence.entity.Categoria;
import com.api.market.persistence.mapper.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CategoriaRepository implements CategoryRepository {

    @Autowired
    private CategoriaCrudRepository categoriaCrudRepository;
    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public List<Category> getAll() {
        List<Categoria> categorias = (List<Categoria>) categoriaCrudRepository.findAll();
        return categoryMapper.toCategories(categorias);
    }

    @Override
    public Optional<Category> getById(int categoryId) {
        return categoriaCrudRepository.findById(categoryId).map( categoria -> categoryMapper.toCategory(categoria));
    }

    @Override
    public Category save(Category category) {
        Categoria categoria = categoryMapper.toCategoria(category);
        return categoryMapper.toCategory(categoriaCrudRepository.save(categoria));
    }

    @Override
    public void delete(int categoryId) {
        categoriaCrudRepository.deleteById(categoryId);
    }
}
