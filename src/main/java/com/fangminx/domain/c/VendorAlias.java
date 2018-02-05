package com.fangminx.domain.c;

public class VendorAlias {
    private Long id;

    private String code;

    private String vendorType;

    private String alias;

    private String language;

    private String vendorCode;

    private String vendorCountryCode;

    public VendorAlias(Long id, String code, String vendorType, String alias, String language, String vendorCode, String vendorCountryCode) {
        this.id = id;
        this.code = code;
        this.vendorType = vendorType;
        this.alias = alias;
        this.language = language;
        this.vendorCode = vendorCode;
        this.vendorCountryCode = vendorCountryCode;
    }

    public VendorAlias() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getVendorType() {
        return vendorType;
    }

    public void setVendorType(String vendorType) {
        this.vendorType = vendorType == null ? null : vendorType.trim();
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias == null ? null : alias.trim();
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language == null ? null : language.trim();
    }

    public String getVendorCode() {
        return vendorCode;
    }

    public void setVendorCode(String vendorCode) {
        this.vendorCode = vendorCode == null ? null : vendorCode.trim();
    }

    public String getVendorCountryCode() {
        return vendorCountryCode;
    }

    public void setVendorCountryCode(String vendorCountryCode) {
        this.vendorCountryCode = vendorCountryCode == null ? null : vendorCountryCode.trim();
    }
}