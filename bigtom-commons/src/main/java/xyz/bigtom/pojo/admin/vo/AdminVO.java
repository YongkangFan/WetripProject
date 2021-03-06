package xyz.bigtom.pojo.admin.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.beans.BeanUtils;
import xyz.bigtom.base.pojo.vo.BaseVO;
import xyz.bigtom.pojo.admin.entity.Admin;
import xyz.bigtom.pojo.admin.entity.Role;

/**
 * <b>汤姆旅游租赁平台-后台管理-管理员视图信息</b>
 * @author fanyongkang
 * @version 1.0.0
 * @since 1.0.0
 */
@ApiModel("汤姆旅游租赁平台-后台管理-管理员视图信息")
public class AdminVO extends BaseVO {
	private static final long serialVersionUID = 69263685584293054L;
	@ApiModelProperty(value = "主键")
	private String id;                      //主键
	@ApiModelProperty(value = "用户姓名")
	private String name;                    //用户姓名
	@ApiModelProperty(value = "手机号码")
	private String cellphone;               //手机号码
	@ApiModelProperty(value = "登录密码，MD5加密")
	private String password;                //登录密码，MD5加密
	@ApiModelProperty(value = "对应角色主键")
	private String roleId;                  //对应角色主键
	@ApiModelProperty(value = "对应角色名称")
	private String roleName;                //对应角色名称
	@ApiModelProperty(value = "身份证号码")
	private String idCard;                  //身份证号码
	@ApiModelProperty(value = "电子邮件")
	private String email;                   //电子邮件
	@ApiModelProperty(value = "头像")
	private String avatar;                  //头像

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

	public String getCellphone() {
		return cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	/**
	 * <b>将 VO 对象转换成 Entity 对象</b>
	 * @param vo
	 * @return
	 */
	public static Admin parseToEntity(AdminVO vo) {
		Admin entity = new Admin();
		//将 VO 中属性提取，设定到 Entity 中
		//entity.setId(vo.getId());
		//借助于spring所提供的 Bean Utils 来拷贝属性
		BeanUtils.copyProperties(vo,entity);
		//创建关联属性
		Role role = new Role();
		role.setId(vo.getId());
		role.setName(vo.getName());
		entity.setRole(role);

		return entity;
	}
}
