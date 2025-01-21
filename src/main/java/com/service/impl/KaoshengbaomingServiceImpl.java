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


import com.dao.KaoshengbaomingDao;
import com.entity.KaoshengbaomingEntity;
import com.service.KaoshengbaomingService;
import com.entity.vo.KaoshengbaomingVO;
import com.entity.view.KaoshengbaomingView;

@Service("kaoshengbaomingService")
public class KaoshengbaomingServiceImpl extends ServiceImpl<KaoshengbaomingDao, KaoshengbaomingEntity> implements KaoshengbaomingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KaoshengbaomingEntity> page = this.selectPage(
                new Query<KaoshengbaomingEntity>(params).getPage(),
                new EntityWrapper<KaoshengbaomingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KaoshengbaomingEntity> wrapper) {
		  Page<KaoshengbaomingView> page =new Query<KaoshengbaomingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KaoshengbaomingVO> selectListVO(Wrapper<KaoshengbaomingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KaoshengbaomingVO selectVO(Wrapper<KaoshengbaomingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KaoshengbaomingView> selectListView(Wrapper<KaoshengbaomingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KaoshengbaomingView selectView(Wrapper<KaoshengbaomingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
