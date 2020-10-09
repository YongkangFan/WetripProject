package xyz.bigtom.dao;

import org.springframework.stereotype.Repository;
import xyz.bigtom.pojo.admin.entity.Role;

import java.util.List;

/**
 * <b>汤姆旅游租赁平台-后台管理-角色数据持久层接口</b>
 * @author fanyongkang
 * @version 1.0.0
 * @since 1.0.0
 */
@Repository
public interface RoleDao {
	/**
	 * <b>根据查询对象查询列表</b>
	 * @param query
	 * @return
	 * @throws Exception
	 */
	List<Role> findListByQuery(Role query) throws Exception;

	/**
	 * <b>保存对象</b>
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	Integer save(Role entity) throws Exception;

	/**
	 * <b>修改对象</b>
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	Integer update(Role entity) throws Exception;
}
