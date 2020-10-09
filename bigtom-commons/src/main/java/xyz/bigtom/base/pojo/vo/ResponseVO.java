package xyz.bigtom.base.pojo.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import xyz.bigtom.base.enums.ResponseCodeEnum;

import java.io.Serializable;

/**
 * <b>大汤姆旅游租赁平台-基础功能-系统响应视图信息</b>
 * <p>
 *     所有和前端交互所返回的数据，必须是本视图
 * </p>
 * @param <E>
 * @author fanyongkang
 * @version 1.0.0
 * @since 1.0.0
 */
@ApiModel("系统响应视图信息")
public class ResponseVO<E> implements Serializable {
	private static final long serialVersionUID = 4654241476564136173L;
	@ApiModelProperty(value = "系统HTTP 响应码",example = "200")
	private Integer code;                       //系统HTTP 响应码
	@ApiModelProperty(value = "系统处理结果")
	private boolean result;                     //系统处理结果
	@ApiModelProperty(value ="系统响应数据")
	private E data;                             //系统响应数据

	public ResponseVO(ResponseCodeEnum responseCodeEnum,boolean result){
		this.code = responseCodeEnum.getCode();
		this.result = result;
	}

	public ResponseVO(ResponseCodeEnum responseCodeEnum,boolean result,E data){
		this.code = responseCodeEnum.getCode();
		this.result = result;
		this.data = data;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public boolean isResult() {
		return result;
	}

	public void setResult(boolean result) {
		this.result = result;
	}

	public E getData() {
		return data;
	}

	public void setData(E data) {
		this.data = data;
	}

	/**
	 * <b>获得系统处理成功，响应成功的视图</b>
	 * @return
	 */
	public static ResponseVO success(){
		ResponseVO responseVO = new ResponseVO(ResponseCodeEnum.RESPONSE_CODE_200,true);
		return  responseVO;
	}

	/**
	 * <b>获得系统处理成功，响应成功的视图</b>
	 * @param data
	 * @return
	 */
	public static ResponseVO success(Object data){
		ResponseVO responseVO = new ResponseVO(ResponseCodeEnum.RESPONSE_CODE_200,true,data);
		return  responseVO;
	}

	/**
	 * <b>获得系统处理失败，响应成功的视图</b>
	 * @param data
	 * @return
	 */
	public static ResponseVO failure(Object data){
		ResponseVO responseVO = new ResponseVO(ResponseCodeEnum.RESPONSE_CODE_200,false,data);
		return  responseVO;
	}

	/**
	 * <b>获得系统响应响应的视图</b>
	 * @param data
	 * @return
	 */
	public static ResponseVO exception(Object data){
		ResponseVO responseVO = new ResponseVO(ResponseCodeEnum.RESPONSE_CODE_500,false,data);
		return  responseVO;
	}
}
