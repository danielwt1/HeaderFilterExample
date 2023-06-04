package com.example.filter.headerfilterexample.service.impl;

import com.example.filter.headerfilterexample.config.filters.HeaderContainer.HeaderContainer;
import com.example.filter.headerfilterexample.service.ExampleService;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class ExampleServiceImpl implements ExampleService {

    private final HeaderContainer headerContainer;

    public ExampleServiceImpl(HeaderContainer headerContainer) {
        this.headerContainer = headerContainer;
    }
    @Override
    public void ejemplo1() {
        Map<String, String> map = headerContainer.getHeaderMap();
        headerContainer.getHeaderMap().entrySet().stream().forEach(entry-> System.out.println("key: "+ entry.getKey() + " value: "+ entry.getValue() + "\n"));

    }

    @Override
    public void ejemplo2() {
        headerContainer.getHeaderMap().entrySet().stream().forEach(entry-> System.out.println("key: "+ entry.getKey() + " value: "+ entry.getValue() + "\n"));


    }

    @Override
    public void ejemplo3() {
        headerContainer.getHeaderMap().entrySet().stream().forEach(entry-> System.out.println("key: "+ entry.getKey() + " value: "+ entry.getValue() + "\n"));


    }

    @Override
    public void ejemplo4() {
        headerContainer.getHeaderMap().entrySet().stream().forEach(entry-> System.out.println("key: "+ entry.getKey() + " value: "+ entry.getValue() + "\n"));


    }
}
