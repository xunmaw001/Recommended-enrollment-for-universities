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


import com.dao.BaomingzhinanDao;
import com.entity.BaomingzhinanEntity;
import com.service.BaomingzhinanService;
import com.entity.vo.BaomingzhinanVO;
import com.entity.view.BaomingzhinanView;

@Service("baomingzhinanService")
public class BaomingzhinanServiceImpl extends ServiceImpl<BaomingzhinanDao, BaomingzhinanEntity> implements BaomingzhinanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BaomingzhinanEntity> page = this.selectPage(
                new Query<BaomingzhinanEntity>(params).getPage(),
                new EntityWrapper<BaomingzhinanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BaomingzhinanEntity> wrapper) {
		  Page<BaomingzhinanView> page =new Query<BaomingzhinanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BaomingzhinanVO> selectListVO(Wrapper<BaomingzhinanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BaomingzhinanVO selectVO(Wrapper<BaomingzhinanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BaomingzhinanView> selectListView(Wrapper<BaomingzhinanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BaomingzhinanView selectView(Wrapper<BaomingzhinanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
