package com.bootcamp.coin_catalog.controller;

import com.bootcamp.coin_catalog.entity.Catalog;
import com.bootcamp.coin_catalog.service.CatalogService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("catalogs")
@RequiredArgsConstructor
public class CatalogController {

    private final CatalogService service;

    @GetMapping
    public Flux<Catalog> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Mono<Catalog> getOne(@PathVariable String id) {
        return service.findById(id);
    }

    @PostMapping
    public Mono<Catalog> create(@RequestBody Catalog catalog) {
        return service.save(catalog);
    }

    @PutMapping("/{id}")
    public Mono<Catalog> update(@PathVariable String id, @RequestBody Catalog catalog) {
        return service.update(id, catalog);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> delete(@PathVariable String id) {
        return service.delete(id);
    }
}
