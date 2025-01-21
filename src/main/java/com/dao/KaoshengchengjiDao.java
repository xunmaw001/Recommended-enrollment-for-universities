package com.dao;

import com.entity.KaoshengchengjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KaoshengchengjiVO;
import com.entity.view.KaoshengchengjiView;


/**
 * 考生成绩
 * 
 * @author 
 * @email 
 * @date 2022-03-14 22:40:35
 */
public interface KaoshengchengjiDao extends BaseMapper<KaoshengchengjiEntity> {
	
	List<KaoshengchengjiVO> selectListVO(@Param("ew") Wrapper<KaoshengchengjiEntity> wrapper);
	
	KaoshengchengjiVO selectVO(@Param("ew") Wrapper<KaoshengchengjiEntity> wrapper);
	
	List<KaoshengchengjiView> selectListView(@Param("ew") Wrapper<KaoshengchengjiEntity> wrapper);

	List<KaoshengchengjiView> selectListView(Pagination page,@Param("ew") Wrapper<KaoshengchengjiEntity> wrapper);
	
	KaoshengchengjiView selectView(@Param("ew") Wrapper<KaoshengchengjiEntity> wrapper);
	

}
