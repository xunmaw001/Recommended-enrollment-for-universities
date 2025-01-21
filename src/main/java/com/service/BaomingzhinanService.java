package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BaomingzhinanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BaomingzhinanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BaomingzhinanView;


/**
 * 报名指南
 *
 * @author 
 * @email 
 * @date 2022-03-14 22:40:35
 */
public interface BaomingzhinanService extends IService<BaomingzhinanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BaomingzhinanVO> selectListVO(Wrapper<BaomingzhinanEntity> wrapper);
   	
   	BaomingzhinanVO selectVO(@Param("ew") Wrapper<BaomingzhinanEntity> wrapper);
   	
   	List<BaomingzhinanView> selectListView(Wrapper<BaomingzhinanEntity> wrapper);
   	
   	BaomingzhinanView selectView(@Param("ew") Wrapper<BaomingzhinanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BaomingzhinanEntity> wrapper);
   	

}

