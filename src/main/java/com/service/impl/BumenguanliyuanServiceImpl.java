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


import com.dao.BumenguanliyuanDao;
import com.entity.BumenguanliyuanEntity;
import com.service.BumenguanliyuanService;
import com.entity.vo.BumenguanliyuanVO;
import com.entity.view.BumenguanliyuanView;

@Service("bumenguanliyuanService")
public class BumenguanliyuanServiceImpl extends ServiceImpl<BumenguanliyuanDao, BumenguanliyuanEntity> implements BumenguanliyuanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BumenguanliyuanEntity> page = this.selectPage(
                new Query<BumenguanliyuanEntity>(params).getPage(),
                new EntityWrapper<BumenguanliyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BumenguanliyuanEntity> wrapper) {
		  Page<BumenguanliyuanView> page =new Query<BumenguanliyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<BumenguanliyuanVO> selectListVO(Wrapper<BumenguanliyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BumenguanliyuanVO selectVO(Wrapper<BumenguanliyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BumenguanliyuanView> selectListView(Wrapper<BumenguanliyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BumenguanliyuanView selectView(Wrapper<BumenguanliyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
