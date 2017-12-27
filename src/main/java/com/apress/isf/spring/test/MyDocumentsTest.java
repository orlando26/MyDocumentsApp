package com.apress.isf.spring.test;

import java.util.List;

import org.junit.Test;
import org.junit.Assert;

import com.apress.isf.spring.model.Document;
import com.apress.isf.spring.model.Type;
import com.apress.isf.spring.service.MySearchEngine;
import com.apress.isf.spring.service.SearchEngine;



public class MyDocumentsTest {

    private SearchEngine engine = new MySearchEngine();

    @Test
    public void testFindByType(){
        Type documentType = new Type();
        documentType.setName("web");
        documentType.setDesc("Web link");
        documentType.setExtension(".url");

        List<Document> documents = engine.findByType(documentType);
        Assert.assertNotNull(documents);
        Assert.assertTrue(documents.size() == 1);
        Assert.assertEquals(documentType.getName(), documents.get(0).getType().getName());
        Assert.assertEquals(documentType.getDesc(), documents.get(0).getType().getDesc());
        Assert.assertEquals(documentType.getExtension(), documents.get(0).getType().getExtension());
    }

    @Test
    public void testListAll(){
        List<Document> documents = engine.listAll();

        Assert.assertNotNull(documents);
        Assert.assertTrue(documents.size() == 4);
    }


}
