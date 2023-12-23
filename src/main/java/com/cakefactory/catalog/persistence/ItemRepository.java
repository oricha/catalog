package com.cakefactory.catalog.persistence;

import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<ItemEntity, String> {
    ItemEntity findBySku(String sku);
}
