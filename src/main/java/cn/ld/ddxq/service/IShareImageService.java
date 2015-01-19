/*
 * Copyright (c) 2013-2014, thinkjoy Inc. All Rights Reserved.
 *
 * Project Name: ddxq
 * $Id:  ShareImageService.java 2015-01-19 18:21:11 $
 */

package cn.ld.ddxq.service;


import cn.ld.ddxq.dao.IBaseDAO;
import cn.ld.ddxq.model.BaseDomain;
import cn.ld.ddxq.service.base.IBaseService;

public interface IShareImageService<D extends IBaseDAO<T>, T extends BaseDomain> extends IBaseService<D, T> {

}
