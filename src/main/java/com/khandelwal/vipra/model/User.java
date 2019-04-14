package com.khandelwal.vipra.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user")
public class User {
	@Id
	private String id;
	private String profileCreatedBy;
	private String maritalStatus;
	private String gender;
	private String name;
	private String date_of_birth;
	private String placeofBirth;
	private String birthTime;
	private String height;
	private String colorComplexion;
	private String education;
	private String work;
	private String officeAddress;
	private long income;
	private String fatherName;
	private String motherName;
	private String detailsofFamiliy;
	private String aboutMe;
	private String nativePlace;
	private String restrictedGotra;
	private boolean manglik;
	private String residenceAddress;
	private String selfContactNo;
	private String familyContactNo;
	private String emailAddress;
	private String myCast;
	private String mothercast;
	private String language;
	private String profileCreatedDate;
	private String loginId;
	private String loginPassword;

	public User() {

	}

	public User(String id, String profileCreatedBy, String maritalStatus, String gender, String name,
			String date_of_birth, String placeofBirth, String birthTime, String height, String colorComplexion,
			String education, String work, String officeAddress, long income, String fatherName, String motherName,
			String detailsofFamiliy, String aboutMe, String nativePlace, String restrictedGotra, boolean manglik,
			String residenceAddress, String selfContactNo, String familyContactNo, String emailAddress, String myCast,
			String mothercast, String language, String profileCreatedDate, String loginId, String loginPassword) {
		super();
		this.id = id;
		this.profileCreatedBy = profileCreatedBy;
		this.maritalStatus = maritalStatus;
		this.gender = gender;
		this.name = name;
		this.date_of_birth = date_of_birth;
		this.placeofBirth = placeofBirth;
		this.birthTime = birthTime;
		this.height = height;
		this.colorComplexion = colorComplexion;
		this.education = education;
		this.work = work;
		this.officeAddress = officeAddress;
		this.income = income;
		this.fatherName = fatherName;
		this.motherName = motherName;
		this.detailsofFamiliy = detailsofFamiliy;
		this.aboutMe = aboutMe;
		this.nativePlace = nativePlace;
		this.restrictedGotra = restrictedGotra;
		this.manglik = manglik;
		this.residenceAddress = residenceAddress;
		this.selfContactNo = selfContactNo;
		this.familyContactNo = familyContactNo;
		this.emailAddress = emailAddress;
		this.myCast = myCast;
		this.mothercast = mothercast;
		this.language = language;
		this.profileCreatedDate = profileCreatedDate;
		this.loginId = loginId;
		this.loginPassword = loginPassword;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getProfileCreatedBy() {
		return profileCreatedBy;
	}

	public void setProfileCreatedBy(String profileCreatedBy) {
		this.profileCreatedBy = profileCreatedBy;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate_of_birth() {
		return date_of_birth;
	}

	public void setDate_of_birth(String date_of_birth) {
		this.date_of_birth = date_of_birth;
	}

	public String getPlaceofBirth() {
		return placeofBirth;
	}

	public void setPlaceofBirth(String placeofBirth) {
		this.placeofBirth = placeofBirth;
	}

	public String getBirthTime() {
		return birthTime;
	}

	public void setBirthTime(String birthTime) {
		this.birthTime = birthTime;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getColorComplexion() {
		return colorComplexion;
	}

	public void setColorComplexion(String colorComplexion) {
		this.colorComplexion = colorComplexion;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getWork() {
		return work;
	}

	public void setWork(String work) {
		this.work = work;
	}

	public String getOfficeAddress() {
		return officeAddress;
	}

	public void setOfficeAddress(String officeAddress) {
		this.officeAddress = officeAddress;
	}

	public long getIncome() {
		return income;
	}

	public void setIncome(long income) {
		this.income = income;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String getDetailsofFamiliy() {
		return detailsofFamiliy;
	}

	public void setDetailsofFamiliy(String detailsofFamiliy) {
		this.detailsofFamiliy = detailsofFamiliy;
	}

	public String getAboutMe() {
		return aboutMe;
	}

	public void setAboutMe(String aboutMe) {
		this.aboutMe = aboutMe;
	}

	public String getNativePlace() {
		return nativePlace;
	}

	public void setNativePlace(String nativePlace) {
		this.nativePlace = nativePlace;
	}

	public String getRestrictedGotra() {
		return restrictedGotra;
	}

	public void setRestrictedGotra(String restrictedGotra) {
		this.restrictedGotra = restrictedGotra;
	}

	public boolean isManglik() {
		return manglik;
	}

	public void setManglik(boolean manglik) {
		this.manglik = manglik;
	}

	public String getResidenceAddress() {
		return residenceAddress;
	}

	public void setResidenceAddress(String residenceAddress) {
		this.residenceAddress = residenceAddress;
	}

	public String getSelfContactNo() {
		return selfContactNo;
	}

	public void setSelfContactNo(String selfContactNo) {
		this.selfContactNo = selfContactNo;
	}

	public String getFamilyContactNo() {
		return familyContactNo;
	}

	public void setFamilyContactNo(String familyContactNo) {
		this.familyContactNo = familyContactNo;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getMyCast() {
		return myCast;
	}

	public void setMyCast(String myCast) {
		this.myCast = myCast;
	}

	public String getMothercast() {
		return mothercast;
	}

	public void setMothercast(String mothercast) {
		this.mothercast = mothercast;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getProfileCreatedDate() {
		return profileCreatedDate;
	}

	public void setProfileCreatedDate(String profileCreatedDate) {
		this.profileCreatedDate = profileCreatedDate;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getLoginPassword() {
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}


}
