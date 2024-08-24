package com.dao;

import com.entity.YingxiangfenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YingxiangfenleiVO;
import com.entity.view.YingxiangfenleiView;


/**
 * 影像分类
 * 
 * @author 
 * @email 
 * @date 2024-04-28 20:11:18
 */
public interface YingxiangfenleiDao extends BaseMapper<YingxiangfenleiEntity> {
	
	List<YingxiangfenleiVO> selectListVO(@Param("ew") Wrapper<YingxiangfenleiEntity> wrapper);
	
	YingxiangfenleiVO selectVO(@Param("ew") Wrapper<YingxiangfenleiEntity> wrapper);
	
	List<YingxiangfenleiView> selectListView(@Param("ew") Wrapper<YingxiangfenleiEntity> wrapper);

	List<YingxiangfenleiView> selectListView(Pagination page,@Param("ew") Wrapper<YingxiangfenleiEntity> wrapper);

	
	YingxiangfenleiView selectView(@Param("ew") Wrapper<YingxiangfenleiEntity> wrapper);
	

}
