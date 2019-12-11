package com.datangdu.cn.zservice.lmpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.datangdu.cn.dao.mapper.RegionMapper;
import com.datangdu.cn.model.region.Region;
import com.datangdu.cn.model.region.RegionExample;
import com.datangdu.cn.zservice.RegionService;

@Service
public class RegionServicelmpl implements RegionService {
	@Resource
	RegionMapper regionMapper;
	
	//查id相等的
	@Override
	public List<Region> getList(String id) {
		RegionExample regionExample = new RegionExample();
		RegionExample.Criteria criteria = regionExample.createCriteria();
		criteria.andIdEqualTo(id);
		return regionMapper.selectByExample(regionExample);
	}	
	
	//查上一级
	@Override
	public List<Region> getParent(String id) {
		RegionExample regionExample = new RegionExample();
		RegionExample.Criteria criteria = regionExample.createCriteria();
		criteria.andParentIdEqualTo(id);
		return regionMapper.selectByExample(regionExample);
	}
	
	//查省市区
	public List<Region> getLevel(short id) {
		RegionExample regionExample = new RegionExample();
		RegionExample.Criteria criteria = regionExample.createCriteria();
		criteria.andLevelEqualTo(id);
		return regionMapper.selectByExample(regionExample);
	}

	//知道省查市
	public List<Region> getshi(String id) {
		RegionExample regionExample = new RegionExample();
		RegionExample.Criteria criteria = regionExample.createCriteria();
		criteria.andParentIdEqualTo(id);
		return regionMapper.selectByExample(regionExample);
	}
	
}
