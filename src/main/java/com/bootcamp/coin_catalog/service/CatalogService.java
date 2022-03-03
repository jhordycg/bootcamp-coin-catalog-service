package com.bootcamp.coin_catalog.service;

import com.bootcamp.coin_catalog.entity.Catalog;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CatalogService {
    Flux<Catalog> findAll();

    Mono<Catalog> save(Catalog catalog);

    Mono<Void> delete(String id);

    Mono<Catalog> update(String id, Catalog product);

    Mono<Catalog> findById(String id);
}
