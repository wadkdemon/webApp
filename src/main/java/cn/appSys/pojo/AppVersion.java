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

public class AppVersion  implements Serializable {

	private static final long serialVersionUID =  3522071297318160215L;
	private Long id;	 // 主键id
	private Long appId;	 // appId（来源于：app_info表的主键id）
	private String versionNo;	 // 版本号
	private String versionInfo;	 // 版本介绍
	private Long publishStatus;	 // 发布状态（来源于：data_dictionary，1 不发布 2 已发布 3 预发布）
	private String downloadLink;	 // 下载链接
	private Double versionSize;	 // 版本大小（单位：M）
	private Long createdBy;	 // 创建者（来源于dev_user开发者信息表的用户id）
	private Date creationDate;	 // 创建时间
	private Long modifyBy;	 // 更新者（来源于dev_user开发者信息表的用户id）
	private Date modifyDate;	 // 最新更新时间
	private String apkLocPath;	 // apk文件的服务器存储路径
	private String apkFileName;	 // 上传的apk文件名称

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

	public String getVersionNo() {
		return this.versionNo;
	}

	public void setVersionNo(String versionNo) {
		this.versionNo = versionNo;
	}

	public String getVersionInfo() {
		return this.versionInfo;
	}

	public void setVersionInfo(String versionInfo) {
		this.versionInfo = versionInfo;
	}

	public Long getPublishStatus() {
		return this.publishStatus;
	}

	public void setPublishStatus(Long publishStatus) {
		this.publishStatus = publishStatus;
	}

	public String getDownloadLink() {
		return this.downloadLink;
	}

	public void setDownloadLink(String downloadLink) {
		this.downloadLink = downloadLink;
	}

	public Double getVersionSize() {
		return this.versionSize;
	}

	public void setVersionSize(Double versionSize) {
		this.versionSize = versionSize;
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

	public String getApkLocPath() {
		return this.apkLocPath;
	}

	public void setApkLocPath(String apkLocPath) {
		this.apkLocPath = apkLocPath;
	}

	public String getApkFileName() {
		return this.apkFileName;
	}

	public void setApkFileName(String apkFileName) {
		this.apkFileName = apkFileName;
	}

}
