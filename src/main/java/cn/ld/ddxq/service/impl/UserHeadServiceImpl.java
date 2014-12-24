package cn.ld.ddxq.service.impl;

import cn.ld.ddxq.dao.IBaseDAO;
import cn.ld.ddxq.dao.IUserHeadDAO;
import cn.ld.ddxq.model.UserHead;
import cn.ld.ddxq.service.IUserHeadService;
import cn.ld.ddxq.service.base.AbstractBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("UserHeadServiceImpl")
public class UserHeadServiceImpl extends AbstractBaseService<IBaseDAO<UserHead>, UserHead> implements IUserHeadService<IBaseDAO<UserHead>, UserHead> {
    @Autowired
    private IUserHeadDAO userHeadDAO;

    @Override
    public IBaseDAO<UserHead> getDao() {
        return userHeadDAO;
    }


}
