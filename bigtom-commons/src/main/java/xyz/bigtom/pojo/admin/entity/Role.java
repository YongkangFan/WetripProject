package xyz.bigtom.pojo.admin.entity;

import xyz.bigtom.base.pojo.entity.BaseEntity;

import java.util.List;

/**
 * <b>汤姆旅游租赁平台-后台管理-角色实体信息</b>
 * @author fanyongkang
 * @version 1.0.0
 * @since 1.0.0
 */
public class Role extends BaseEntity {
	private static final long serialVersionUID = 1678012667511953792L;
	private String id;                      //主键
	private String name;                    //名称
	private String code;                    //编码
	private List<Menu> menuList;            //菜单列表

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public List<Menu> getMenuList() {
		return menuList;
	}

	public void setMenuList(List<Menu> menuList) {
		this.menuList = menuList;
	}
}
