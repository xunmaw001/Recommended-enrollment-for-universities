package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.MianshichengjiDao;
import com.entity.MianshichengjiEntity;
import com.service.MianshichengjiService;
import com.entity.vo.MianshichengjiVO;
import com.entity.view.MianshichengjiView;

@Service("mianshichengjiService")
public class MianshichengjiServiceImpl extends ServiceImpl<MianshichengjiDao, MianshichengjiEntity> implements MianshichengjiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<MianshichengjiEntity> page = this.selectPage(
                new Query<MianshichengjiEntity>(params).getPage(),
                new EntityWrapper<MianshichengjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<MianshichengjiEntity> wrapper) {
		  Page<MianshichengjiView> page =new Query<MianshichengjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<MianshichengjiVO> selectListVO(Wrapper<MianshichengjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public MianshichengjiVO selectVO(Wrapper<MianshichengjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<MianshichengjiView> selectListView(Wrapper<MianshichengjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public MianshichengjiView selectView(Wrapper<MianshichengjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
