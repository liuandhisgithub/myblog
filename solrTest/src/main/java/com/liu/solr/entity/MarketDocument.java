package com.liu.solr.entity;

import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.mapping.Dynamic;
import org.springframework.data.solr.core.mapping.Score;
import org.springframework.data.solr.core.mapping.SolrDocument;

import java.util.List;
import java.util.Map;

@SolrDocument(collection = MarketDocument.CODE)
public class MarketDocument {
    public static final String CODE = "market-document";
    public static final String MARKET_DOCUMENT_DYNAMIC_FIELD = "MARKET_DOCUMENT_DYNAMIC_FIELD";
    @Id
    @Field
    private String id;
    @Field(value = "goodsName")
    private String goodsName;

    @Field("price")
    private float price;

    @Field("platformName")
    private String platformName;

    @Field("categoryName")
    private String categoryName;

    @Field("status")
    private String status;

    @Field("all")
    private List<String> all;
    @Score
    private float score;

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    @Field("field_name")
    private List<String> fieldNameList;
    @Dynamic
    @Field("field_*")
    private Map<String, List<String>> fieldData;

    @Field("attribution_1")
    private String attr1;
    @Field("attribution_2")
    private String attr2;
    @Field("attribution_3")
    private String attr3;
    @Field("attribution_4")
    private String attr4;
    @Field("attribution_5")
    private String attr5;
    @Field("attribution_6")
    private String attr6;
    @Field("attribution_7")
    private String attr7;
    @Field("attribution_8")
    private String attr8;
    @Field("attribution_9")
    private String attr9;
    @Field("attribution_10")
    private String attr10;
    @Field("attribution_11")
    private String attr11;
    @Field("attribution_12")
    private String attr12;
    @Field("attribution_13")
    private String attr13;
    @Field("attribution_14")
    private String attr14;
    @Field("attribution_15")
    private String attr15;
    @Field("attribution_16")
    private String attr16;
    @Field("attribution_17")
    private String attr17;
    @Field("attribution_18")
    private String attr18;
    @Field("attribution_19")
    private String attr19;
    @Field("attribution_20")
    private String attr20;
    @Field("attribution_21")
    private String attr21;
    @Field("attribution_22")
    private String attr22;
    @Field("attribution_23")
    private String attr23;
    @Field("attribution_24")
    private String attr24;
    @Field("attribution_25")
    private String attr25;
    @Field("attribution_26")
    private String attr26;
    @Field("attribution_27")
    private String attr27;
    @Field("attribution_28")
    private String attr28;
    @Field("attribution_29")
    private String attr29;
    @Field("attribution_30")
    private String attr30;

    @Field("norm_1")
    private String norm1;
    @Field("norm_2")
    private String norm2;
    @Field("norm_3")
    private String norm3;
    @Field("norm_4")
    private String norm4;
    @Field("norm_5")
    private String norm5;
    @Field("norm_6")
    private String norm6;
    @Field("norm_7")
    private String norm7;
    @Field("norm_8")
    private String norm8;
    @Field("norm_9")
    private String norm9;
    @Field("norm_10")
    private String norm10;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getPlatformName() {
        return platformName;
    }

    public void setPlatformName(String platformName) {
        this.platformName = platformName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<String> getAll() {
        return all;
    }

    public void setAll(List<String> all) {
        this.all = all;
    }

    public List<String> getFieldNameList() {
        return fieldNameList;
    }

    public void setFieldNameList(List<String> fieldNameList) {
        this.fieldNameList = fieldNameList;
    }

    public Map<String, List<String>> getFieldData() {
        return fieldData;
    }

    public void setFieldData(Map<String, List<String>> fieldData) {
        this.fieldData = fieldData;
    }

    public String getAttr1() {
        return attr1;
    }

    public void setAttr1(String attr1) {
        this.attr1 = attr1;
    }

    public String getAttr2() {
        return attr2;
    }

    public void setAttr2(String attr2) {
        this.attr2 = attr2;
    }

    public String getAttr3() {
        return attr3;
    }

    public void setAttr3(String attr3) {
        this.attr3 = attr3;
    }

    public String getAttr4() {
        return attr4;
    }

    public void setAttr4(String attr4) {
        this.attr4 = attr4;
    }

    public String getAttr5() {
        return attr5;
    }

    public void setAttr5(String attr5) {
        this.attr5 = attr5;
    }

    public String getAttr6() {
        return attr6;
    }

    public void setAttr6(String attr6) {
        this.attr6 = attr6;
    }

    public String getAttr7() {
        return attr7;
    }

    public void setAttr7(String attr7) {
        this.attr7 = attr7;
    }

    public String getAttr8() {
        return attr8;
    }

    public void setAttr8(String attr8) {
        this.attr8 = attr8;
    }

    public String getAttr9() {
        return attr9;
    }

    public void setAttr9(String attr9) {
        this.attr9 = attr9;
    }

    public String getAttr10() {
        return attr10;
    }

    public void setAttr10(String attr10) {
        this.attr10 = attr10;
    }

    public String getAttr11() {
        return attr11;
    }

    public void setAttr11(String attr11) {
        this.attr11 = attr11;
    }

    public String getAttr12() {
        return attr12;
    }

    public void setAttr12(String attr12) {
        this.attr12 = attr12;
    }

    public String getAttr13() {
        return attr13;
    }

    public void setAttr13(String attr13) {
        this.attr13 = attr13;
    }

    public String getAttr14() {
        return attr14;
    }

    public void setAttr14(String attr14) {
        this.attr14 = attr14;
    }

    public String getAttr15() {
        return attr15;
    }

    public void setAttr15(String attr15) {
        this.attr15 = attr15;
    }

    public String getAttr16() {
        return attr16;
    }

    public void setAttr16(String attr16) {
        this.attr16 = attr16;
    }

    public String getAttr17() {
        return attr17;
    }

    public void setAttr17(String attr17) {
        this.attr17 = attr17;
    }

    public String getAttr18() {
        return attr18;
    }

    public void setAttr18(String attr18) {
        this.attr18 = attr18;
    }

    public String getAttr19() {
        return attr19;
    }

    public void setAttr19(String attr19) {
        this.attr19 = attr19;
    }

    public String getAttr20() {
        return attr20;
    }

    public void setAttr20(String attr20) {
        this.attr20 = attr20;
    }

    public String getAttr21() {
        return attr21;
    }

    public void setAttr21(String attr21) {
        this.attr21 = attr21;
    }

    public String getAttr22() {
        return attr22;
    }

    public void setAttr22(String attr22) {
        this.attr22 = attr22;
    }

    public String getAttr23() {
        return attr23;
    }

    public void setAttr23(String attr23) {
        this.attr23 = attr23;
    }

    public String getAttr24() {
        return attr24;
    }

    public void setAttr24(String attr24) {
        this.attr24 = attr24;
    }

    public String getAttr25() {
        return attr25;
    }

    public void setAttr25(String attr25) {
        this.attr25 = attr25;
    }

    public String getAttr26() {
        return attr26;
    }

    public void setAttr26(String attr26) {
        this.attr26 = attr26;
    }

    public String getAttr27() {
        return attr27;
    }

    public void setAttr27(String attr27) {
        this.attr27 = attr27;
    }

    public String getAttr28() {
        return attr28;
    }

    public void setAttr28(String attr28) {
        this.attr28 = attr28;
    }

    public String getAttr29() {
        return attr29;
    }

    public void setAttr29(String attr29) {
        this.attr29 = attr29;
    }

    public String getAttr30() {
        return attr30;
    }

    public void setAttr30(String attr30) {
        this.attr30 = attr30;
    }

    public String getNorm1() {
        return norm1;
    }

    public void setNorm1(String norm1) {
        this.norm1 = norm1;
    }

    public String getNorm2() {
        return norm2;
    }

    public void setNorm2(String norm2) {
        this.norm2 = norm2;
    }

    public String getNorm3() {
        return norm3;
    }

    public void setNorm3(String norm3) {
        this.norm3 = norm3;
    }

    public String getNorm4() {
        return norm4;
    }

    public void setNorm4(String norm4) {
        this.norm4 = norm4;
    }

    public String getNorm5() {
        return norm5;
    }

    public void setNorm5(String norm5) {
        this.norm5 = norm5;
    }

    public String getNorm6() {
        return norm6;
    }

    public void setNorm6(String norm6) {
        this.norm6 = norm6;
    }

    public String getNorm7() {
        return norm7;
    }

    public void setNorm7(String norm7) {
        this.norm7 = norm7;
    }

    public String getNorm8() {
        return norm8;
    }

    public void setNorm8(String norm8) {
        this.norm8 = norm8;
    }

    public String getNorm9() {
        return norm9;
    }

    public void setNorm9(String norm9) {
        this.norm9 = norm9;
    }

    public String getNorm10() {
        return norm10;
    }

    public void setNorm10(String norm10) {
        this.norm10 = norm10;
    }
}
