package com.dao;

import com.entity.ZhuanyexinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhuanyexinxiVO;
import com.entity.view.ZhuanyexinxiView;


/**
 * 专业信息
 * 
 * @author 
 * @email 
 * @date 2022-03-14 22:40:35
 */
public interface ZhuanyexinxiDao extends BaseMapper<ZhuanyexinxiEntity> {
	
	List<ZhuanyexinxiVO> selectListVO(@Param("ew") Wrapper<ZhuanyexinxiEntity> wrapper);
	
	ZhuanyexinxiVO selectVO(@Param("ew") Wrapper<ZhuanyexinxiEntity> wrapper);
	
	List<ZhuanyexinxiView> selectListView(@Param("ew") Wrapper<ZhuanyexinxiEntity> wrapper);

	List<ZhuanyexinxiView> selectListView(Pagination page,@Param("ew") Wrapper<ZhuanyexinxiEntity> wrapper);
	
	ZhuanyexinxiView selectView(@Param("ew") Wrapper<ZhuanyexinxiEntity> wrapper);
	

}
