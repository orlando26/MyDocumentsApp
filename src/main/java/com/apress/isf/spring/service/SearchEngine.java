package com.apress.isf.spring.service;

import com.apress.isf.spring.model.Document;
import com.apress.isf.spring.model.Type;

import java.util.List;

public interface SearchEngine {

    public List<Document> findByType(Type documentType);
    public List<Document> listAll();
}
