package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CanjiamianshiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.CanjiamianshiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.CanjiamianshiView;


/**
 * 参加面试
 *
 * @author 
 * @email 
 * @date 2022-03-14 22:40:35
 */
public interface CanjiamianshiService extends IService<CanjiamianshiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CanjiamianshiVO> selectListVO(Wrapper<CanjiamianshiEntity> wrapper);
   	
   	CanjiamianshiVO selectVO(@Param("ew") Wrapper<CanjiamianshiEntity> wrapper);
   	
   	List<CanjiamianshiView> selectListView(Wrapper<CanjiamianshiEntity> wrapper);
   	
   	CanjiamianshiView selectView(@Param("ew") Wrapper<CanjiamianshiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CanjiamianshiEntity> wrapper);
   	

}

