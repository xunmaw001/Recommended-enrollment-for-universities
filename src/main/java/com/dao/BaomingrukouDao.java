package com.dao;

import com.entity.BaomingrukouEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BaomingrukouVO;
import com.entity.view.BaomingrukouView;


/**
 * 报名入口
 * 
 * @author 
 * @email 
 * @date 2022-03-14 22:40:35
 */
public interface BaomingrukouDao extends BaseMapper<BaomingrukouEntity> {
	
	List<BaomingrukouVO> selectListVO(@Param("ew") Wrapper<BaomingrukouEntity> wrapper);
	
	BaomingrukouVO selectVO(@Param("ew") Wrapper<BaomingrukouEntity> wrapper);
	
	List<BaomingrukouView> selectListView(@Param("ew") Wrapper<BaomingrukouEntity> wrapper);

	List<BaomingrukouView> selectListView(Pagination page,@Param("ew") Wrapper<BaomingrukouEntity> wrapper);
	
	BaomingrukouView selectView(@Param("ew") Wrapper<BaomingrukouEntity> wrapper);
	

}
