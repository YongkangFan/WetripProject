package xyz.bigtom.pojo.admin.entity;

import org.springframework.beans.BeanUtils;
import org.springframework.expression.spel.ast.NullLiteral;
import xyz.bigtom.base.pojo.entity.BaseEntity;
import xyz.bigtom.pojo.admin.vo.AdminVO;

/**
 * <b>汤姆旅游租赁平台-后台管理-管理员实体信息</b>
 * @author fanyongkang
 * @version 1.0.0
 * @since 1.0.0
 */
public class Admin extends BaseEntity {
	private static final long serialVersionUID = 1487313277559263893L;
	private String id;                      //主键
	private String name;                    //用户姓名
	private String cellphone;               //手机号码
	private String password;                //登录密码，MD5加密
	private Role role;                      //对应角色
	private String idCard;                  //身份证号码
	private String email;                   //电子邮件
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

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
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
	 * <b>将 Entity 对象转换成 VO 对象</b>
	 * @param entity
	 * @return
	 */
	public static AdminVO parseToVO(Admin entity) {
		//创建 VO 对象
		AdminVO vo = new AdminVO();
		//将 Entity 中属性提取，设定到 VO 中
		//借助于spring所提供的 Bean Utils 来拷贝属性
		BeanUtils.copyProperties(entity,vo);
		//设定关联属性值
		//判断role是否为null
		if(entity.getRole() != null ) {
			vo.setRoleId(entity.getRole().getId());
			vo.setRoleName(entity.getRole().getName());
		}
		return vo;
	}
}
