package com.kanglian.healthcare.back.dal.pojo;

import java.util.Date;
import com.alibaba.fastjson.annotation.JSONField;
import com.easyway.business.framework.json.annotion.NotJsonData;
import com.easyway.business.framework.pojo.BasePojo;

public class UserInfo extends BasePojo {
	private static final long serialVersionUID = 1L;
	@JSONField(name="userInfoId")
	private Long id;
	private Integer userId;
	private String orgCode;
	private String patientId;
	@JSONField(serialize=false)
	private String name;
	private String sexCode;
	private Date birthDate;
	private String aboCode;
	private String rhCode;
	private String idTypeCode;
	private String idNo;
	private String mobilePhone;
	private String marriageCode;
	private String nationalityCode;
	private String cardTypeCode;
	private String cardNo;
	private String drugAllergyMark;
	private Date lastUpdateDtime;
	private String realName;
    // 头像原图
	private String originalImageUrl;
	// 头像缩略图200x200
    private String imageUrl;
    public String getRealName() {
        return realName;
    }
    public void setRealName(String realName) {
        this.realName = realName;
    }
    public String getOriginalImageUrl() {
        return originalImageUrl;
    }
    public void setOriginalImageUrl(String originalImageUrl) {
        this.originalImageUrl = originalImageUrl;
    }
	public String getImageUrl() {
        return imageUrl;
    }
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getOrgCode() {
		return orgCode;
	}
	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}
	public String getPatientId() {
		return patientId;
	}
	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@NotJsonData
	public String getSexCode() {
		return sexCode;
	}
	public void setSexCode(String sexCode) {
		this.sexCode = sexCode;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	@NotJsonData
	public String getAboCode() {
		return aboCode;
	}
	public void setAboCode(String aboCode) {
		this.aboCode = aboCode;
	}
	@NotJsonData
	public String getRhCode() {
		return rhCode;
	}
	public void setRhCode(String rhCode) {
		this.rhCode = rhCode;
	}
	@NotJsonData
	public String getIdTypeCode() {
		return idTypeCode;
	}
	public void setIdTypeCode(String idTypeCode) {
		this.idTypeCode = idTypeCode;
	}
	public String getIdNo() {
		return idNo;
	}
	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}
	public String getMobilePhone() {
		return mobilePhone;
	}
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}
	@NotJsonData
	public String getMarriageCode() {
		return marriageCode;
	}
	public void setMarriageCode(String marriageCode) {
		this.marriageCode = marriageCode;
	}
	@NotJsonData
	public String getNationalityCode() {
		return nationalityCode;
	}
	public void setNationalityCode(String nationalityCode) {
		this.nationalityCode = nationalityCode;
	}
	@NotJsonData
	public String getCardTypeCode() {
		return cardTypeCode;
	}
	public void setCardTypeCode(String cardTypeCode) {
		this.cardTypeCode = cardTypeCode;
	}
	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public String getDrugAllergyMark() {
		return drugAllergyMark;
	}
	public void setDrugAllergyMark(String drugAllergyMark) {
		this.drugAllergyMark = drugAllergyMark;
	}
	public Date getLastUpdateDtime() {
		return lastUpdateDtime;
	}
	public void setLastUpdateDtime(Date lastUpdateDtime) {
		this.lastUpdateDtime = lastUpdateDtime;
	}
}
