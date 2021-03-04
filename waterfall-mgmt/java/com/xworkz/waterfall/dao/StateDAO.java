package com.xworkz.waterfall.dao;

import java.util.List;

import com.xworkz.waterfall.entity.StateEntity;

public interface StateDAO {
	
	public void create(StateEntity entity);
	
	
	public void create(List<StateEntity> stateEntity);

}
