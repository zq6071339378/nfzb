package com.wonders.fzb.simpleflow.services.impl;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wonders.fzb.base.beans.Page;
import com.wonders.fzb.base.consts.CommonConst;
import com.wonders.fzb.base.exception.FzbDaoException;
import com.wonders.fzb.simpleflow.beans.*;
import com.wonders.fzb.simpleflow.dao.*;
import com.wonders.fzb.simpleflow.services.*;


/**
 * WegovSimpleNode service实现
 * 
 * @author scalffold created by lj
 */
 
@Service("wegovSimpleNodeService")
@Transactional
public class WegovSimpleNodeServiceImpl implements WegovSimpleNodeService {

	@Autowired
	private WegovSimpleNodeDao wegovSimpleNodeDao;
	
	/**
	 * 添加实体对象
	 */
	@Override
	public void add(WegovSimpleNode info) {
		wegovSimpleNodeDao.save(info);
	}

	/**
	 * 添加实体对象
	 */
	@Override
	public String addObj(WegovSimpleNode info) {
		return wegovSimpleNodeDao.saveObj(info);
	}
	
	/**
	 * 更新实体对象
	 */
	@Override
	public void update(WegovSimpleNode info) {
		wegovSimpleNodeDao.update(info);
	}

	/**
	 * 删除实体对象
	 */
	@Override
	public void delete(WegovSimpleNode info) {
		wegovSimpleNodeDao.delete(info);
	}

	/**
	 * 通过ID装载相应的对象实例，如果对应的实体不存在，返回null
	 */
	@Override
	public WegovSimpleNode findById(String id) {
		return (WegovSimpleNode) wegovSimpleNodeDao.load(id);
	}

	/**
	 * 根据Map中过滤条件、排序条件和分页参数进行分页查询.
	 * 
	 * @param condMap
	 *            过滤条件<propertyName,properyValue>
	 * @param sortMap
	 *            排序条件<propertyName,properyValue>
	 * @param pageNo
	 *            当前页码
	 * @param pageSize
	 *            每页显示记录数.
	 * @return
	 * @throws FzbDaoException
	 */
	@Override
	public Page findByPage(Map<String, Object> condMap, Map<String, String> sortMap, int pageNo, int pageSize) throws FzbDaoException {
		return wegovSimpleNodeDao.findByPage(condMap, sortMap, pageNo, pageSize);
	}

	/**
	 * 根据Map中过滤条件、排序条件进行查询.
	 * 
	 * @param condMap
	 *            过滤条件<propertyName,properyValue>
	 * @param sortMap
	 *            排序条件<propertyName,properyValue>
	 * @return
	 */
	@Override
	public List<WegovSimpleNode> findByList(Map<String, Object> condMap, Map<String, String> sortMap) {
		return wegovSimpleNodeDao.findByList(condMap, sortMap);
	}

	@Override
	public void saveOrUpdate(WegovSimpleNode info) {
		wegovSimpleNodeDao.saveOrUpdate(info);
	}


	@Override
	public List<WegovSimpleNode> findByHQL(String hql) {
		List<WegovSimpleNode> wegovSimpleNodeList = wegovSimpleNodeDao.findByHQL(hql);
		return wegovSimpleNodeList;
	}
}
