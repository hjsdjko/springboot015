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


import com.dao.YingxiangfenleiDao;
import com.entity.YingxiangfenleiEntity;
import com.service.YingxiangfenleiService;
import com.entity.vo.YingxiangfenleiVO;
import com.entity.view.YingxiangfenleiView;

@Service("yingxiangfenleiService")
public class YingxiangfenleiServiceImpl extends ServiceImpl<YingxiangfenleiDao, YingxiangfenleiEntity> implements YingxiangfenleiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YingxiangfenleiEntity> page = this.selectPage(
                new Query<YingxiangfenleiEntity>(params).getPage(),
                new EntityWrapper<YingxiangfenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YingxiangfenleiEntity> wrapper) {
		  Page<YingxiangfenleiView> page =new Query<YingxiangfenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<YingxiangfenleiVO> selectListVO(Wrapper<YingxiangfenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YingxiangfenleiVO selectVO(Wrapper<YingxiangfenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YingxiangfenleiView> selectListView(Wrapper<YingxiangfenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YingxiangfenleiView selectView(Wrapper<YingxiangfenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
