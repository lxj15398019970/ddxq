package cn.ld.ddxq.service.impl;

import cn.ld.ddxq.dao.IBaseDAO;
import cn.ld.ddxq.dao.IShareDAO;
import cn.ld.ddxq.model.Share;
import cn.ld.ddxq.service.IShareService;
import cn.ld.ddxq.service.base.AbstractBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("ShareServiceImpl")
public class ShareServiceImpl extends AbstractBaseService<IBaseDAO<Share>, Share> implements IShareService<IBaseDAO<Share>,Share>{
    @Autowired
    private IShareDAO shareDAO;

    @Override
    public IBaseDAO<Share> getDao() {
        return shareDAO;
    }



}
