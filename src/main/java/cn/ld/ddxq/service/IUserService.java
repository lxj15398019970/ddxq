/*
 *
 * Project Name: ddxq
 * $Id:  UserService.java 2014-12-24 22:57:43 $
 */

package cn.ld.ddxq.service;

import cn.ld.ddxq.dao.IBaseDAO;
import cn.ld.ddxq.model.BaseDomain;
import cn.ld.ddxq.service.base.IBaseService;

public interface IUserService<D extends IBaseDAO<T>, T extends BaseDomain> extends IBaseService<D, T> {

}
