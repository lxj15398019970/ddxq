/*
 *
 * Project Name: ddxq
 * $Id:  BannerService.java 2014-12-24 22:57:42 $
 */

package cn.ld.ddxq.service;

import cn.ld.ddxq.dao.IBaseDAO;
import cn.ld.ddxq.model.BaseDomain;
import cn.ld.ddxq.service.base.IBaseService;

public interface IBannerService<D extends IBaseDAO<T>, T extends BaseDomain> extends IBaseService<D, T> {

}
