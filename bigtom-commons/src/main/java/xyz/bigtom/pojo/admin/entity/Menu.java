package xyz.bigtom.pojo.admin.entity;

import xyz.bigtom.base.pojo.entity.BaseEntity;

import java.util.List;

/**
 * <b>汤姆旅游租赁平台-后台管理-菜单实体信息</b>
 * @author fanyongkang
 * @version 1.0.0
 * @since 1.0.0
 */
public class Menu extends BaseEntity {
	private static final long serialVersionUID = -2977953441774444200L;
	private String id;                 //主键
	private Menu parent;               //上级菜单
	private String text;               //文本
	private String url;                //链接地址
	private String icon;               //图标
	private List<Menu> child;          //下级菜单
	private List<Role> roleList;        //角色列表

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Menu getParent() {
		return parent;
	}

	public void setParent(Menu parent) {
		this.parent = parent;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public List<Menu> getChild() {
		return child;
	}

	public void setChild(List<Menu> child) {
		this.child = child;
	}

	public List<Role> getRoleList() {
		return roleList;
	}

	public void setRoleList(List<Role> roleList) {
		this.roleList = roleList;
	}
}
