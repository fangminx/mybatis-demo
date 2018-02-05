package com.fangminx.dao.b;


import com.fangminx.domain.c.VendorAlias;

public interface VendorAliasMapper {
    int deleteByPrimaryKey(Long id);

    int insert(VendorAlias record);

    int insertSelective(VendorAlias record);

    VendorAlias selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(VendorAlias record);

    int updateByPrimaryKey(VendorAlias record);
}