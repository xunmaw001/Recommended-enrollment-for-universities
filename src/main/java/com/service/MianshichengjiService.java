package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.MianshichengjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.MianshichengjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.MianshichengjiView;


/**
 * 面试成绩
 *
 * @author 
 * @email 
 * @date 2022-03-14 22:40:35
 */
public interface MianshichengjiService extends IService<MianshichengjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<MianshichengjiVO> selectListVO(Wrapper<MianshichengjiEntity> wrapper);
   	
   	MianshichengjiVO selectVO(@Param("ew") Wrapper<MianshichengjiEntity> wrapper);
   	
   	List<MianshichengjiView> selectListView(Wrapper<MianshichengjiEntity> wrapper);
   	
   	MianshichengjiView selectView(@Param("ew") Wrapper<MianshichengjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<MianshichengjiEntity> wrapper);
   	

}

