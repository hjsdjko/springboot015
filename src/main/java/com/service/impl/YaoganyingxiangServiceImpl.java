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


import com.dao.YaoganyingxiangDao;
import com.entity.YaoganyingxiangEntity;
import com.service.YaoganyingxiangService;
import com.entity.vo.YaoganyingxiangVO;
import com.entity.view.YaoganyingxiangView;

@Service("yaoganyingxiangService")
public class YaoganyingxiangServiceImpl extends ServiceImpl<YaoganyingxiangDao, YaoganyingxiangEntity> implements YaoganyingxiangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YaoganyingxiangEntity> page = this.selectPage(
                new Query<YaoganyingxiangEntity>(params).getPage(),
                new EntityWrapper<YaoganyingxiangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YaoganyingxiangEntity> wrapper) {
		  Page<YaoganyingxiangView> page =new Query<YaoganyingxiangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<YaoganyingxiangVO> selectListVO(Wrapper<YaoganyingxiangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YaoganyingxiangVO selectVO(Wrapper<YaoganyingxiangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YaoganyingxiangView> selectListView(Wrapper<YaoganyingxiangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YaoganyingxiangView selectView(Wrapper<YaoganyingxiangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
