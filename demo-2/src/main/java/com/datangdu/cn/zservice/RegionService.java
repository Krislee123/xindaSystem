package com.datangdu.cn.zservice;

import java.util.List;

import com.datangdu.cn.model.region.Region;

public interface RegionService {
	public List<Region> getList(String id);
	public List<Region> getParent(String id);
	public List<Region> getLevel(short id);
	public List<Region> getshi(String id);
}
