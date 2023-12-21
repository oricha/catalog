package com.cakefactory.catalog.persistence;

import com.cakefactory.catalog.CatalogService;
import com.cakefactory.catalog.Item;
import com.cakefactory.catalog.persistence.ItemRepository;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Component
public class JpaCatalogService implements CatalogService {

    private final ItemRepository itemRepository;

    JpaCatalogService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @Override
    public Iterable<Item> getItems() {
        return StreamSupport.stream(itemRepository.findAll().spliterator(), false)
                .map(entity -> new Item(entity.title, entity.price))
                .collect(Collectors.toList());
    }
}
