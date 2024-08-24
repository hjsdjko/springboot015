package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BumenguanliyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BumenguanliyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BumenguanliyuanView;


/**
 * 部门管理员
 *
 * @author 
 * @email 
 * @date 2024-04-28 20:11:18
 */
public interface BumenguanliyuanService extends IService<BumenguanliyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BumenguanliyuanVO> selectListVO(Wrapper<BumenguanliyuanEntity> wrapper);
   	
   	BumenguanliyuanVO selectVO(@Param("ew") Wrapper<BumenguanliyuanEntity> wrapper);
   	
   	List<BumenguanliyuanView> selectListView(Wrapper<BumenguanliyuanEntity> wrapper);
   	
   	BumenguanliyuanView selectView(@Param("ew") Wrapper<BumenguanliyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BumenguanliyuanEntity> wrapper);

   	

}

