package com.github.fabriciolfj.gateway.repository;

import com.github.fabriciolfj.gateway.repository.data.ProductData;
import io.quarkus.mongodb.panache.PanacheMongoRepository;

import javax.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
public class ProductRepository implements PanacheMongoRepository<ProductData> {

    public Optional<ProductData> findByCode(final String code) {
        return find("code", code).stream().findFirst();
    }
}
