package com.bootcamp.coin_catalog.service.impl;

import com.bootcamp.coin_catalog.entity.Catalog;
import com.bootcamp.coin_catalog.repository.CatalogRepository;
import com.bootcamp.coin_catalog.service.CatalogService;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
public class CatalogServiceImpl implements CatalogService {
    private final CatalogRepository repository;

    @Override
    public Flux<Catalog> findAll() {
        return repository.findAll();
    }

    @Override
    public Mono<Catalog> save(Catalog catalog) {
        return repository.save(catalog);
    }

    @Override
    public Mono<Void> delete(String id) {
        return repository.deleteById(id);
    }

    @Override
    public Mono<Catalog> update(String id, Catalog product) {
        return repository.findById(id).flatMap(newProduct -> {
            product.setId(newProduct.getId());
            return repository.save(product);
        });
    }

    @Override
    public Mono<Catalog> findById(String id) {
        return repository.findById(id);
    }
}
