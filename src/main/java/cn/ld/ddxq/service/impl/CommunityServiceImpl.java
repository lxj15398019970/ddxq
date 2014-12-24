package cn.ld.ddxq.service.impl;

import cn.ld.ddxq.dao.IBaseDAO;
import cn.ld.ddxq.dao.ICommunityDAO;
import cn.ld.ddxq.model.Community;
import cn.ld.ddxq.service.ICommunityService;
import cn.ld.ddxq.service.base.AbstractBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("CommunityServiceImpl")
public class CommunityServiceImpl extends AbstractBaseService<IBaseDAO<Community>, Community> implements ICommunityService<IBaseDAO<Community>,Community>{
    @Autowired
    private ICommunityDAO communityDAO;

    @Override
    public IBaseDAO<Community> getDao() {
        return communityDAO;
    }



}
