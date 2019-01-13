package cn.appSys.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * @Description  
 * @Author  Hunter
 * @Date 2019-01-13 
 */

public class AdPromotion  implements Serializable {

	private static final long serialVersionUID =  3618263710393585648L;
	private Long id;	 // 主键id
	private Long appId;	 // appId（来源于：app_info表的主键id）
	private String adPicPath;	 // 广告图片存储路径
	private Long adPv;	 // 广告点击量
	private Long carouselPosition;	 // 轮播位（1-n）
	private Date startTime;	 // 起效时间
	private Date endTime;	 // 失效时间
	private Long createdBy;	 // 创建者（来源于backend_user用户表的用户id）
	private Date creationDate;	 // 创建时间
	private Long modifyBy;	 // 更新者（来源于backend_user用户表的用户id）
	private Date modifyDate;	 // 最新更新时间

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getAppId() {
		return this.appId;
	}

	public void setAppId(Long appId) {
		this.appId = appId;
	}

	public String getAdPicPath() {
		return this.adPicPath;
	}

	public void setAdPicPath(String adPicPath) {
		this.adPicPath = adPicPath;
	}

	public Long getAdPv() {
		return this.adPv;
	}

	public void setAdPv(Long adPv) {
		this.adPv = adPv;
	}

	public Long getCarouselPosition() {
		return this.carouselPosition;
	}

	public void setCarouselPosition(Long carouselPosition) {
		this.carouselPosition = carouselPosition;
	}

	public Date getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Long getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreationDate() {
		return this.creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Long getModifyBy() {
		return this.modifyBy;
	}

	public void setModifyBy(Long modifyBy) {
		this.modifyBy = modifyBy;
	}

	public Date getModifyDate() {
		return this.modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}

}
