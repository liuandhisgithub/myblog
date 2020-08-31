package com.liu.solr.service;

import com.liu.solr.dao.MarketDocumentDao;
import com.liu.solr.entity.MarketDocument;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.solr.core.query.Field;
import org.springframework.data.solr.core.query.result.FacetFieldEntry;
import org.springframework.data.solr.core.query.result.FacetPage;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class MarketDocumentService {
    @Autowired
    @Qualifier(MarketDocumentDao.CODE)
    MarketDocumentDao marketDocumentDao;

    @Test
    public void func(){
        String search = "京东";
        Pageable pageable = PageRequest.of(0, 10);
        FacetPage<MarketDocument> marketDocuments = marketDocumentDao.findByGoodsNameOrPlatformNameOrCategoryNameOrAll(search,search,search,search,pageable);
        for(MarketDocument marketDocument : marketDocuments.getContent()){
            System.out.println(marketDocument.getGoodsName()+"|"+marketDocument.getPlatformName()+"|"+marketDocument.getCategoryName()+"|"+marketDocument.getPrice()+"|"+marketDocument.getScore());
        }
        for(Field field : marketDocuments.getFacetFields()){
            String name = field.getName();
            System.out.println(name);
            for(FacetFieldEntry entity:marketDocuments.getFacetResultPage(field)){
                System.out.println(entity.getValue());
            }

        }
    }
}
