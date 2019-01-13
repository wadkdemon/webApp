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

public class DevUser  implements Serializable {

	private static final long serialVersionUID =  1660438983129704717L;
	private Long id;	 // 主键id
	private String devCode;	 // 开发者帐号
	private String devName;	 // 开发者名称
	private String devPassword;	 // 开发者密码
	private String devEmail;	 // 开发者电子邮箱
	private String devInfo;	 // 开发者简介
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

	public String getDevCode() {
		return this.devCode;
	}

	public void setDevCode(String devCode) {
		this.devCode = devCode;
	}

	public String getDevName() {
		return this.devName;
	}

	public void setDevName(String devName) {
		this.devName = devName;
	}

	public String getDevPassword() {
		return this.devPassword;
	}

	public void setDevPassword(String devPassword) {
		this.devPassword = devPassword;
	}

	public String getDevEmail() {
		return this.devEmail;
	}

	public void setDevEmail(String devEmail) {
		this.devEmail = devEmail;
	}

	public String getDevInfo() {
		return this.devInfo;
	}

	public void setDevInfo(String devInfo) {
		this.devInfo = devInfo;
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
