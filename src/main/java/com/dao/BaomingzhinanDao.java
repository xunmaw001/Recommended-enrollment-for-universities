package com.dao;

import com.entity.BaomingzhinanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BaomingzhinanVO;
import com.entity.view.BaomingzhinanView;


/**
 * 报名指南
 * 
 * @author 
 * @email 
 * @date 2022-03-14 22:40:35
 */
public interface BaomingzhinanDao extends BaseMapper<BaomingzhinanEntity> {
	
	List<BaomingzhinanVO> selectListVO(@Param("ew") Wrapper<BaomingzhinanEntity> wrapper);
	
	BaomingzhinanVO selectVO(@Param("ew") Wrapper<BaomingzhinanEntity> wrapper);
	
	List<BaomingzhinanView> selectListView(@Param("ew") Wrapper<BaomingzhinanEntity> wrapper);

	List<BaomingzhinanView> selectListView(Pagination page,@Param("ew") Wrapper<BaomingzhinanEntity> wrapper);
	
	BaomingzhinanView selectView(@Param("ew") Wrapper<BaomingzhinanEntity> wrapper);
	

}
