/*
 * Copyright (c) 2013-2014, thinkjoy Inc. All Rights Reserved.
 *
 * Project Name: ddxq
 * $Id:  BannerServiceImpl.java 2014-12-24 22:57:42 $
 */
package cn.ld.ddxq.service.impl;


import cn.ld.ddxq.dao.IBannerDAO;
import cn.ld.ddxq.dao.IBaseDAO;
import cn.ld.ddxq.model.Banner;
import cn.ld.ddxq.service.IBannerService;
import cn.ld.ddxq.service.base.AbstractBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("BannerServiceImpl")
public class BannerServiceImpl extends AbstractBaseService<IBaseDAO<Banner>, Banner> implements IBannerService<IBaseDAO<Banner>, Banner> {
    @Autowired
    private IBannerDAO bannerDAO;

    @Override
    public IBaseDAO<Banner> getDao() {
        return bannerDAO;
    }


}
