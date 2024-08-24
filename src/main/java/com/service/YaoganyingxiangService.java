package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YaoganyingxiangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YaoganyingxiangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YaoganyingxiangView;


/**
 * 遥感影像
 *
 * @author 
 * @email 
 * @date 2024-04-28 20:11:18
 */
public interface YaoganyingxiangService extends IService<YaoganyingxiangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YaoganyingxiangVO> selectListVO(Wrapper<YaoganyingxiangEntity> wrapper);
   	
   	YaoganyingxiangVO selectVO(@Param("ew") Wrapper<YaoganyingxiangEntity> wrapper);
   	
   	List<YaoganyingxiangView> selectListView(Wrapper<YaoganyingxiangEntity> wrapper);
   	
   	YaoganyingxiangView selectView(@Param("ew") Wrapper<YaoganyingxiangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YaoganyingxiangEntity> wrapper);

   	

}

