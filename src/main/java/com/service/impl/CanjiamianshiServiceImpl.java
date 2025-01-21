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


import com.dao.CanjiamianshiDao;
import com.entity.CanjiamianshiEntity;
import com.service.CanjiamianshiService;
import com.entity.vo.CanjiamianshiVO;
import com.entity.view.CanjiamianshiView;

@Service("canjiamianshiService")
public class CanjiamianshiServiceImpl extends ServiceImpl<CanjiamianshiDao, CanjiamianshiEntity> implements CanjiamianshiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CanjiamianshiEntity> page = this.selectPage(
                new Query<CanjiamianshiEntity>(params).getPage(),
                new EntityWrapper<CanjiamianshiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CanjiamianshiEntity> wrapper) {
		  Page<CanjiamianshiView> page =new Query<CanjiamianshiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<CanjiamianshiVO> selectListVO(Wrapper<CanjiamianshiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public CanjiamianshiVO selectVO(Wrapper<CanjiamianshiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<CanjiamianshiView> selectListView(Wrapper<CanjiamianshiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CanjiamianshiView selectView(Wrapper<CanjiamianshiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
