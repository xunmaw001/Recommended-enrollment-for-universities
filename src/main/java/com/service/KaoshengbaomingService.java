package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KaoshengbaomingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KaoshengbaomingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KaoshengbaomingView;


/**
 * 考生报名
 *
 * @author 
 * @email 
 * @date 2022-03-14 22:40:35
 */
public interface KaoshengbaomingService extends IService<KaoshengbaomingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KaoshengbaomingVO> selectListVO(Wrapper<KaoshengbaomingEntity> wrapper);
   	
   	KaoshengbaomingVO selectVO(@Param("ew") Wrapper<KaoshengbaomingEntity> wrapper);
   	
   	List<KaoshengbaomingView> selectListView(Wrapper<KaoshengbaomingEntity> wrapper);
   	
   	KaoshengbaomingView selectView(@Param("ew") Wrapper<KaoshengbaomingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KaoshengbaomingEntity> wrapper);
   	

}

