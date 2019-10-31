package com.datangdu.cn.dao.mapper;

import com.datangdu.cn.model.provider.Provider;
import com.datangdu.cn.model.provider.ProviderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProviderMapper {
    long countByExample(ProviderExample example);

    int deleteByExample(ProviderExample example);

    int deleteByPrimaryKey(String id);

    int insert(Provider record);

    int insertSelective(Provider record);

    List<Provider> selectByExample(ProviderExample example);

    Provider selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Provider record, @Param("example") ProviderExample example);

    int updateByExample(@Param("record") Provider record, @Param("example") ProviderExample example);

    int updateByPrimaryKeySelective(Provider record);

    int updateByPrimaryKey(Provider record);
}