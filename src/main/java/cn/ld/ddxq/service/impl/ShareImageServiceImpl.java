/*
 * Copyright (c) 2013-2014, thinkjoy Inc. All Rights Reserved.
 *
 * Project Name: ddxq
 * $Id:  ShareImageServiceImpl.java 2015-01-19 18:21:11 $
 */
package cn.ld.ddxq.service.impl;

import cn.ld.ddxq.dao.IBaseDAO;
import cn.ld.ddxq.model.Nickname;
import cn.ld.ddxq.model.ShareImage;
import cn.ld.ddxq.service.IShareImageService;
import cn.ld.ddxq.service.base.AbstractBaseService;
import cn.ld.ddxq.dao.IShareImageDAO;

import cn.ld.ddxq.service.base.IBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("ShareImageServiceImpl")
public class ShareImageServiceImpl extends AbstractBaseService<IBaseDAO<ShareImage>, ShareImage> implements IShareImageService<IBaseDAO<ShareImage>, ShareImage> {
    @Autowired
    private IShareImageDAO shareImageDAO;

    @Override
    public IBaseDAO<ShareImage> getDao() {
        return shareImageDAO;
    }


}
