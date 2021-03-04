package com.xworkz.waterfall.dao;

import com.xworkz.waterfall.entity.WaterFallsEntity;

public interface waterFallsDAO {
	public void create(WaterFallsEntity entity);
	
	public WaterFallsEntity getById(int id);
	
	public void updateHeightAndDepthById(int id,double height,double depth);
	
	public void deleteById(int id);
	
	
}
