package cn.ld.ddxq.service.impl;

import cn.ld.ddxq.dao.IBaseDAO;
import cn.ld.ddxq.dao.INicknameDAO;
import cn.ld.ddxq.model.Nickname;
import cn.ld.ddxq.service.INicknameService;
import cn.ld.ddxq.service.base.AbstractBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("NicknameServiceImpl")
public class NicknameServiceImpl extends AbstractBaseService<IBaseDAO<Nickname>, Nickname> implements INicknameService<IBaseDAO<Nickname>,Nickname>{
    @Autowired
    private INicknameDAO nicknameDAO;

    @Override
    public IBaseDAO<Nickname> getDao() {
        return nicknameDAO;
    }



}
