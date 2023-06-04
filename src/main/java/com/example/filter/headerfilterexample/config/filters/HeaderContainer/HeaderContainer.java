package com.example.filter.headerfilterexample.config.filters.HeaderContainer;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import java.util.HashMap;
import java.util.Map;

@Component
@RequestScope //Crea una instancia por cada peticion se destruye cuando termina la peticion
public class HeaderContainer {
    private final Map<String, String> headerMap = new HashMap<>();

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public void addHeader(String headerName, String headerValue) {
        headerMap.put(headerName, headerValue);
    }

}
