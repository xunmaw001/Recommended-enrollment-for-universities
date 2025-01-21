package com.dao;

import com.entity.MianshichengjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.MianshichengjiVO;
import com.entity.view.MianshichengjiView;


/**
 * 面试成绩
 * 
 * @author 
 * @email 
 * @date 2022-03-14 22:40:35
 */
public interface MianshichengjiDao extends BaseMapper<MianshichengjiEntity> {
	
	List<MianshichengjiVO> selectListVO(@Param("ew") Wrapper<MianshichengjiEntity> wrapper);
	
	MianshichengjiVO selectVO(@Param("ew") Wrapper<MianshichengjiEntity> wrapper);
	
	List<MianshichengjiView> selectListView(@Param("ew") Wrapper<MianshichengjiEntity> wrapper);

	List<MianshichengjiView> selectListView(Pagination page,@Param("ew") Wrapper<MianshichengjiEntity> wrapper);
	
	MianshichengjiView selectView(@Param("ew") Wrapper<MianshichengjiEntity> wrapper);
	

}
