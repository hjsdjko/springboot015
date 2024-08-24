package com.dao;

import com.entity.YaoganyingxiangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YaoganyingxiangVO;
import com.entity.view.YaoganyingxiangView;


/**
 * 遥感影像
 * 
 * @author 
 * @email 
 * @date 2024-04-28 20:11:18
 */
public interface YaoganyingxiangDao extends BaseMapper<YaoganyingxiangEntity> {
	
	List<YaoganyingxiangVO> selectListVO(@Param("ew") Wrapper<YaoganyingxiangEntity> wrapper);
	
	YaoganyingxiangVO selectVO(@Param("ew") Wrapper<YaoganyingxiangEntity> wrapper);
	
	List<YaoganyingxiangView> selectListView(@Param("ew") Wrapper<YaoganyingxiangEntity> wrapper);

	List<YaoganyingxiangView> selectListView(Pagination page,@Param("ew") Wrapper<YaoganyingxiangEntity> wrapper);

	
	YaoganyingxiangView selectView(@Param("ew") Wrapper<YaoganyingxiangEntity> wrapper);
	

}
