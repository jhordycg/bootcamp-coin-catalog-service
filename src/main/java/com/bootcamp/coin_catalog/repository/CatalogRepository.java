package com.bootcamp.coin_catalog.repository;

import com.bootcamp.coin_catalog.entity.Catalog;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface CatalogRepository extends ReactiveMongoRepository<Catalog, String> {
}
