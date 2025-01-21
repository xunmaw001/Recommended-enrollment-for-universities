package com.dao;

import com.entity.CanjiamianshiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CanjiamianshiVO;
import com.entity.view.CanjiamianshiView;


/**
 * 参加面试
 * 
 * @author 
 * @email 
 * @date 2022-03-14 22:40:35
 */
public interface CanjiamianshiDao extends BaseMapper<CanjiamianshiEntity> {
	
	List<CanjiamianshiVO> selectListVO(@Param("ew") Wrapper<CanjiamianshiEntity> wrapper);
	
	CanjiamianshiVO selectVO(@Param("ew") Wrapper<CanjiamianshiEntity> wrapper);
	
	List<CanjiamianshiView> selectListView(@Param("ew") Wrapper<CanjiamianshiEntity> wrapper);

	List<CanjiamianshiView> selectListView(Pagination page,@Param("ew") Wrapper<CanjiamianshiEntity> wrapper);
	
	CanjiamianshiView selectView(@Param("ew") Wrapper<CanjiamianshiEntity> wrapper);
	

}
