package com.liu.solr.dao;

import com.liu.solr.entity.MarketDocument;
import org.springframework.data.domain.Pageable;
import org.springframework.data.solr.core.query.result.FacetPage;
import org.springframework.data.solr.repository.Boost;
import org.springframework.data.solr.repository.Facet;
import org.springframework.data.solr.repository.SolrCrudRepository;
import org.springframework.stereotype.Repository;


@Repository(MarketDocumentDao.CODE)
public interface MarketDocumentDao extends SolrCrudRepository<MarketDocument, String> {
    String CODE = "com.liu.solr.dao.MarketDocumentDao";

    @Facet(fields = { "goodsName", "platformName", "categoryName", "field_name" }, limit = -1)
    FacetPage<MarketDocument> findByGoodsNameOrPlatformNameOrCategoryNameOrAll(String goodsName,  String platformName,  String categoryName,  String all, Pageable page);
}
