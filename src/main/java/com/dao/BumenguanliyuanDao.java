package com.dao;

import com.entity.BumenguanliyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BumenguanliyuanVO;
import com.entity.view.BumenguanliyuanView;


/**
 * 部门管理员
 * 
 * @author 
 * @email 
 * @date 2024-04-28 20:11:18
 */
public interface BumenguanliyuanDao extends BaseMapper<BumenguanliyuanEntity> {
	
	List<BumenguanliyuanVO> selectListVO(@Param("ew") Wrapper<BumenguanliyuanEntity> wrapper);
	
	BumenguanliyuanVO selectVO(@Param("ew") Wrapper<BumenguanliyuanEntity> wrapper);
	
	List<BumenguanliyuanView> selectListView(@Param("ew") Wrapper<BumenguanliyuanEntity> wrapper);

	List<BumenguanliyuanView> selectListView(Pagination page,@Param("ew") Wrapper<BumenguanliyuanEntity> wrapper);

	
	BumenguanliyuanView selectView(@Param("ew") Wrapper<BumenguanliyuanEntity> wrapper);
	

}
