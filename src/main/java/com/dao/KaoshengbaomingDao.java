package com.dao;

import com.entity.KaoshengbaomingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KaoshengbaomingVO;
import com.entity.view.KaoshengbaomingView;


/**
 * 考生报名
 * 
 * @author 
 * @email 
 * @date 2022-03-14 22:40:35
 */
public interface KaoshengbaomingDao extends BaseMapper<KaoshengbaomingEntity> {
	
	List<KaoshengbaomingVO> selectListVO(@Param("ew") Wrapper<KaoshengbaomingEntity> wrapper);
	
	KaoshengbaomingVO selectVO(@Param("ew") Wrapper<KaoshengbaomingEntity> wrapper);
	
	List<KaoshengbaomingView> selectListView(@Param("ew") Wrapper<KaoshengbaomingEntity> wrapper);

	List<KaoshengbaomingView> selectListView(Pagination page,@Param("ew") Wrapper<KaoshengbaomingEntity> wrapper);
	
	KaoshengbaomingView selectView(@Param("ew") Wrapper<KaoshengbaomingEntity> wrapper);
	

}
