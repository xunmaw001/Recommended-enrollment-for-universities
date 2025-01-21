package com.dao;

import com.entity.KaoshengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KaoshengVO;
import com.entity.view.KaoshengView;


/**
 * 考生
 * 
 * @author 
 * @email 
 * @date 2022-03-14 22:40:35
 */
public interface KaoshengDao extends BaseMapper<KaoshengEntity> {
	
	List<KaoshengVO> selectListVO(@Param("ew") Wrapper<KaoshengEntity> wrapper);
	
	KaoshengVO selectVO(@Param("ew") Wrapper<KaoshengEntity> wrapper);
	
	List<KaoshengView> selectListView(@Param("ew") Wrapper<KaoshengEntity> wrapper);

	List<KaoshengView> selectListView(Pagination page,@Param("ew") Wrapper<KaoshengEntity> wrapper);
	
	KaoshengView selectView(@Param("ew") Wrapper<KaoshengEntity> wrapper);
	

}
