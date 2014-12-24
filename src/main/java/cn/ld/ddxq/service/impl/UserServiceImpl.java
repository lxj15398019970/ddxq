package cn.ld.ddxq.service.impl;

import cn.ld.ddxq.dao.IBaseDAO;
import cn.ld.ddxq.dao.IUserDAO;
import cn.ld.ddxq.model.User;
import cn.ld.ddxq.service.IUserService;
import cn.ld.ddxq.service.base.AbstractBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("UserServiceImpl")
public class UserServiceImpl extends AbstractBaseService<IBaseDAO<User>, User> implements IUserService<IBaseDAO<User>, User> {
    @Autowired
    private IUserDAO userDAO;

    @Override
    public IBaseDAO<User> getDao() {
        return userDAO;
    }


}
