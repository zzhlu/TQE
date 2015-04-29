package com.tqe.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

import com.tqe.po.Department;

@Repository
public interface DepartmentDao extends BaseDao<Department>{
	@Override
	@Select("select * from department")
	public List<Department> findAll();
}