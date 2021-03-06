package com.giveu.notice.common.vo;

/**
 * 微信端接口监控配置表
 * Created by fox on 2018/10/23.
 */
public class MonitorApiVo {

	private Integer id;

	private String proName;
	private String proAddress;
	private String recObj;
	private Integer monitorStatus;
	private String monitorStatusDesc;
	private String createTime;
	private String updateTime;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getProName() {
		return proName;
	}

	public void setProName(String proName) {
		this.proName = proName;
	}

	public String getProAddress() {
		return proAddress;
	}

	public void setProAddress(String proAddress) {
		this.proAddress = proAddress;
	}

	public String getRecObj() {
		return recObj;
	}

	public void setRecObj(String recObj) {
		this.recObj = recObj;
	}

	public Integer getMonitorStatus() {
		return monitorStatus;
	}

	public void setMonitorStatus(Integer monitorStatus) {
		this.monitorStatus = monitorStatus;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	public String getMonitorStatusDesc() {
		if (monitorStatus.equals(1)) {
			monitorStatusDesc = "启用";
		}else {
			monitorStatusDesc = "禁用";
		}
		return monitorStatusDesc;
	}

	public void setMonitorStatusDesc(String monitorStatusDesc) {
		this.monitorStatusDesc = monitorStatusDesc;
	}
}
