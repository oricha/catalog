package com.cakefactory.catalog;

import org.springframework.stereotype.Service;

@Service
public interface CatalogService {

    Iterable<Item> getItems();

}
