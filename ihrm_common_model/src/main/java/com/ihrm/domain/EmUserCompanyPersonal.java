package com.ihrm.domain;

import javax.persistence.*;
import java.util.Objects;

/**
 * @author qinshiji
 * @date 2020/1/9 15:54
 */
@Entity
@Table(name = "em_user_company_personal")
public class EmUserCompanyPersonal {
    private String userId;
    private String username;
    private String mobile;
    private String timeOfEntry;
    private String departmentName;
    private String companyId;
    private String sex;
    private String dateOfBirth;
    private String theHighestDegreeOfEducation;
    private String nationalArea;
    private String passportNo;
    private String idNumber;
    private String idCardPhotoPositive;
    private String idCardPhotoBack;
    private String nativePlace;
    private String nation;
    private String englishName;
    private String maritalStatus;
    private String staffPhoto;
    private String birthday;
    private String zodiac;
    private String age;
    private String constellation;
    private String bloodType;
    private String domicile;
    private String politicalOutlook;
    private String timeToJoinTheParty;
    private String archivingOrganization;
    private String stateOfChildren;
    private String doChildrenHaveCommercialInsurance;
    private String isThereAnyViolationOfLawOrDiscipline;
    private String areThereAnyMajorMedicalHistories;
    private String qq;
    private String wechat;
    private String residenceCardCity;
    private String dateOfResidencePermit;
    private String residencePermitDeadline;
    private String placeOfResidence;
    private String postalAddress;
    private String contactTheMobilePhone;
    private String personalMailbox;
    private String emergencyContact;
    private String emergencyContactNumber;
    private String socialSecurityComputerNumber;
    private String providentFundAccount;
    private String bankCardNumber;
    private String openingBank;
    private String educationalType;
    private String graduateSchool;
    private String enrolmentTime;
    private String graduationTime;
    private String major;
    private String graduationCertificate;
    private String certificateOfAcademicDegree;
    private String homeCompany;
    private String title;
    private String resume;
    private String isThereAnyCompetitionRestriction;
    private String proofOfDepartureOfFormerCompany;
    private String remarks;

    @Id
    @Column(name = "user_id")
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "mobile")
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Basic
    @Column(name = "time_of_entry")
    public String getTimeOfEntry() {
        return timeOfEntry;
    }

    public void setTimeOfEntry(String timeOfEntry) {
        this.timeOfEntry = timeOfEntry;
    }

    @Basic
    @Column(name = "department_name")
    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    @Basic
    @Column(name = "company_id")
    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    @Basic
    @Column(name = "sex")
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Basic
    @Column(name = "date_of_birth")
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Basic
    @Column(name = "the_highest_degree_of_education")
    public String getTheHighestDegreeOfEducation() {
        return theHighestDegreeOfEducation;
    }

    public void setTheHighestDegreeOfEducation(String theHighestDegreeOfEducation) {
        this.theHighestDegreeOfEducation = theHighestDegreeOfEducation;
    }

    @Basic
    @Column(name = "national_area")
    public String getNationalArea() {
        return nationalArea;
    }

    public void setNationalArea(String nationalArea) {
        this.nationalArea = nationalArea;
    }

    @Basic
    @Column(name = "passport_no")
    public String getPassportNo() {
        return passportNo;
    }

    public void setPassportNo(String passportNo) {
        this.passportNo = passportNo;
    }

    @Basic
    @Column(name = "id_number")
    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    @Basic
    @Column(name = "id_card_photo_positive")
    public String getIdCardPhotoPositive() {
        return idCardPhotoPositive;
    }

    public void setIdCardPhotoPositive(String idCardPhotoPositive) {
        this.idCardPhotoPositive = idCardPhotoPositive;
    }

    @Basic
    @Column(name = "id_card_photo_back")
    public String getIdCardPhotoBack() {
        return idCardPhotoBack;
    }

    public void setIdCardPhotoBack(String idCardPhotoBack) {
        this.idCardPhotoBack = idCardPhotoBack;
    }

    @Basic
    @Column(name = "native_place")
    public String getNativePlace() {
        return nativePlace;
    }

    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace;
    }

    @Basic
    @Column(name = "nation")
    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    @Basic
    @Column(name = "english_name")
    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    @Basic
    @Column(name = "marital_status")
    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    @Basic
    @Column(name = "staff_photo")
    public String getStaffPhoto() {
        return staffPhoto;
    }

    public void setStaffPhoto(String staffPhoto) {
        this.staffPhoto = staffPhoto;
    }

    @Basic
    @Column(name = "birthday")
    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Basic
    @Column(name = "zodiac")
    public String getZodiac() {
        return zodiac;
    }

    public void setZodiac(String zodiac) {
        this.zodiac = zodiac;
    }

    @Basic
    @Column(name = "age")
    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Basic
    @Column(name = "constellation")
    public String getConstellation() {
        return constellation;
    }

    public void setConstellation(String constellation) {
        this.constellation = constellation;
    }

    @Basic
    @Column(name = "blood_type")
    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    @Basic
    @Column(name = "domicile")
    public String getDomicile() {
        return domicile;
    }

    public void setDomicile(String domicile) {
        this.domicile = domicile;
    }

    @Basic
    @Column(name = "political_outlook")
    public String getPoliticalOutlook() {
        return politicalOutlook;
    }

    public void setPoliticalOutlook(String politicalOutlook) {
        this.politicalOutlook = politicalOutlook;
    }

    @Basic
    @Column(name = "time_to_join_the_party")
    public String getTimeToJoinTheParty() {
        return timeToJoinTheParty;
    }

    public void setTimeToJoinTheParty(String timeToJoinTheParty) {
        this.timeToJoinTheParty = timeToJoinTheParty;
    }

    @Basic
    @Column(name = "archiving_organization")
    public String getArchivingOrganization() {
        return archivingOrganization;
    }

    public void setArchivingOrganization(String archivingOrganization) {
        this.archivingOrganization = archivingOrganization;
    }

    @Basic
    @Column(name = "state_of_children")
    public String getStateOfChildren() {
        return stateOfChildren;
    }

    public void setStateOfChildren(String stateOfChildren) {
        this.stateOfChildren = stateOfChildren;
    }

    @Basic
    @Column(name = "do_children_have_commercial_insurance")
    public String getDoChildrenHaveCommercialInsurance() {
        return doChildrenHaveCommercialInsurance;
    }

    public void setDoChildrenHaveCommercialInsurance(String doChildrenHaveCommercialInsurance) {
        this.doChildrenHaveCommercialInsurance = doChildrenHaveCommercialInsurance;
    }

    @Basic
    @Column(name = "is_there_any_violation_of_law_or_discipline")
    public String getIsThereAnyViolationOfLawOrDiscipline() {
        return isThereAnyViolationOfLawOrDiscipline;
    }

    public void setIsThereAnyViolationOfLawOrDiscipline(String isThereAnyViolationOfLawOrDiscipline) {
        this.isThereAnyViolationOfLawOrDiscipline = isThereAnyViolationOfLawOrDiscipline;
    }

    @Basic
    @Column(name = "are_there_any_major_medical_histories")
    public String getAreThereAnyMajorMedicalHistories() {
        return areThereAnyMajorMedicalHistories;
    }

    public void setAreThereAnyMajorMedicalHistories(String areThereAnyMajorMedicalHistories) {
        this.areThereAnyMajorMedicalHistories = areThereAnyMajorMedicalHistories;
    }

    @Basic
    @Column(name = "qq")
    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    @Basic
    @Column(name = "wechat")
    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat;
    }

    @Basic
    @Column(name = "residence_card_city")
    public String getResidenceCardCity() {
        return residenceCardCity;
    }

    public void setResidenceCardCity(String residenceCardCity) {
        this.residenceCardCity = residenceCardCity;
    }

    @Basic
    @Column(name = "date_of_residence_permit")
    public String getDateOfResidencePermit() {
        return dateOfResidencePermit;
    }

    public void setDateOfResidencePermit(String dateOfResidencePermit) {
        this.dateOfResidencePermit = dateOfResidencePermit;
    }

    @Basic
    @Column(name = "residence_permit_deadline")
    public String getResidencePermitDeadline() {
        return residencePermitDeadline;
    }

    public void setResidencePermitDeadline(String residencePermitDeadline) {
        this.residencePermitDeadline = residencePermitDeadline;
    }

    @Basic
    @Column(name = "place_of_residence")
    public String getPlaceOfResidence() {
        return placeOfResidence;
    }

    public void setPlaceOfResidence(String placeOfResidence) {
        this.placeOfResidence = placeOfResidence;
    }

    @Basic
    @Column(name = "postal_address")
    public String getPostalAddress() {
        return postalAddress;
    }

    public void setPostalAddress(String postalAddress) {
        this.postalAddress = postalAddress;
    }

    @Basic
    @Column(name = "contact_the_mobile_phone")
    public String getContactTheMobilePhone() {
        return contactTheMobilePhone;
    }

    public void setContactTheMobilePhone(String contactTheMobilePhone) {
        this.contactTheMobilePhone = contactTheMobilePhone;
    }

    @Basic
    @Column(name = "personal_mailbox")
    public String getPersonalMailbox() {
        return personalMailbox;
    }

    public void setPersonalMailbox(String personalMailbox) {
        this.personalMailbox = personalMailbox;
    }

    @Basic
    @Column(name = "emergency_contact")
    public String getEmergencyContact() {
        return emergencyContact;
    }

    public void setEmergencyContact(String emergencyContact) {
        this.emergencyContact = emergencyContact;
    }

    @Basic
    @Column(name = "emergency_contact_number")
    public String getEmergencyContactNumber() {
        return emergencyContactNumber;
    }

    public void setEmergencyContactNumber(String emergencyContactNumber) {
        this.emergencyContactNumber = emergencyContactNumber;
    }

    @Basic
    @Column(name = "social_security_computer_number")
    public String getSocialSecurityComputerNumber() {
        return socialSecurityComputerNumber;
    }

    public void setSocialSecurityComputerNumber(String socialSecurityComputerNumber) {
        this.socialSecurityComputerNumber = socialSecurityComputerNumber;
    }

    @Basic
    @Column(name = "provident_fund_account")
    public String getProvidentFundAccount() {
        return providentFundAccount;
    }

    public void setProvidentFundAccount(String providentFundAccount) {
        this.providentFundAccount = providentFundAccount;
    }

    @Basic
    @Column(name = "bank_card_number")
    public String getBankCardNumber() {
        return bankCardNumber;
    }

    public void setBankCardNumber(String bankCardNumber) {
        this.bankCardNumber = bankCardNumber;
    }

    @Basic
    @Column(name = "opening_bank")
    public String getOpeningBank() {
        return openingBank;
    }

    public void setOpeningBank(String openingBank) {
        this.openingBank = openingBank;
    }

    @Basic
    @Column(name = "educational_type")
    public String getEducationalType() {
        return educationalType;
    }

    public void setEducationalType(String educationalType) {
        this.educationalType = educationalType;
    }

    @Basic
    @Column(name = "graduate_school")
    public String getGraduateSchool() {
        return graduateSchool;
    }

    public void setGraduateSchool(String graduateSchool) {
        this.graduateSchool = graduateSchool;
    }

    @Basic
    @Column(name = "enrolment_time")
    public String getEnrolmentTime() {
        return enrolmentTime;
    }

    public void setEnrolmentTime(String enrolmentTime) {
        this.enrolmentTime = enrolmentTime;
    }

    @Basic
    @Column(name = "graduation_time")
    public String getGraduationTime() {
        return graduationTime;
    }

    public void setGraduationTime(String graduationTime) {
        this.graduationTime = graduationTime;
    }

    @Basic
    @Column(name = "major")
    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Basic
    @Column(name = "graduation_certificate")
    public String getGraduationCertificate() {
        return graduationCertificate;
    }

    public void setGraduationCertificate(String graduationCertificate) {
        this.graduationCertificate = graduationCertificate;
    }

    @Basic
    @Column(name = "certificate_of_academic_degree")
    public String getCertificateOfAcademicDegree() {
        return certificateOfAcademicDegree;
    }

    public void setCertificateOfAcademicDegree(String certificateOfAcademicDegree) {
        this.certificateOfAcademicDegree = certificateOfAcademicDegree;
    }

    @Basic
    @Column(name = "home_company")
    public String getHomeCompany() {
        return homeCompany;
    }

    public void setHomeCompany(String homeCompany) {
        this.homeCompany = homeCompany;
    }

    @Basic
    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "resume")
    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    @Basic
    @Column(name = "is_there_any_competition_restriction")
    public String getIsThereAnyCompetitionRestriction() {
        return isThereAnyCompetitionRestriction;
    }

    public void setIsThereAnyCompetitionRestriction(String isThereAnyCompetitionRestriction) {
        this.isThereAnyCompetitionRestriction = isThereAnyCompetitionRestriction;
    }

    @Basic
    @Column(name = "proof_of_departure_of_former_company")
    public String getProofOfDepartureOfFormerCompany() {
        return proofOfDepartureOfFormerCompany;
    }

    public void setProofOfDepartureOfFormerCompany(String proofOfDepartureOfFormerCompany) {
        this.proofOfDepartureOfFormerCompany = proofOfDepartureOfFormerCompany;
    }

    @Basic
    @Column(name = "remarks")
    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmUserCompanyPersonal that = (EmUserCompanyPersonal) o;
        return Objects.equals(userId, that.userId) &&
                Objects.equals(username, that.username) &&
                Objects.equals(mobile, that.mobile) &&
                Objects.equals(timeOfEntry, that.timeOfEntry) &&
                Objects.equals(departmentName, that.departmentName) &&
                Objects.equals(companyId, that.companyId) &&
                Objects.equals(sex, that.sex) &&
                Objects.equals(dateOfBirth, that.dateOfBirth) &&
                Objects.equals(theHighestDegreeOfEducation, that.theHighestDegreeOfEducation) &&
                Objects.equals(nationalArea, that.nationalArea) &&
                Objects.equals(passportNo, that.passportNo) &&
                Objects.equals(idNumber, that.idNumber) &&
                Objects.equals(idCardPhotoPositive, that.idCardPhotoPositive) &&
                Objects.equals(idCardPhotoBack, that.idCardPhotoBack) &&
                Objects.equals(nativePlace, that.nativePlace) &&
                Objects.equals(nation, that.nation) &&
                Objects.equals(englishName, that.englishName) &&
                Objects.equals(maritalStatus, that.maritalStatus) &&
                Objects.equals(staffPhoto, that.staffPhoto) &&
                Objects.equals(birthday, that.birthday) &&
                Objects.equals(zodiac, that.zodiac) &&
                Objects.equals(age, that.age) &&
                Objects.equals(constellation, that.constellation) &&
                Objects.equals(bloodType, that.bloodType) &&
                Objects.equals(domicile, that.domicile) &&
                Objects.equals(politicalOutlook, that.politicalOutlook) &&
                Objects.equals(timeToJoinTheParty, that.timeToJoinTheParty) &&
                Objects.equals(archivingOrganization, that.archivingOrganization) &&
                Objects.equals(stateOfChildren, that.stateOfChildren) &&
                Objects.equals(doChildrenHaveCommercialInsurance, that.doChildrenHaveCommercialInsurance) &&
                Objects.equals(isThereAnyViolationOfLawOrDiscipline, that.isThereAnyViolationOfLawOrDiscipline) &&
                Objects.equals(areThereAnyMajorMedicalHistories, that.areThereAnyMajorMedicalHistories) &&
                Objects.equals(qq, that.qq) &&
                Objects.equals(wechat, that.wechat) &&
                Objects.equals(residenceCardCity, that.residenceCardCity) &&
                Objects.equals(dateOfResidencePermit, that.dateOfResidencePermit) &&
                Objects.equals(residencePermitDeadline, that.residencePermitDeadline) &&
                Objects.equals(placeOfResidence, that.placeOfResidence) &&
                Objects.equals(postalAddress, that.postalAddress) &&
                Objects.equals(contactTheMobilePhone, that.contactTheMobilePhone) &&
                Objects.equals(personalMailbox, that.personalMailbox) &&
                Objects.equals(emergencyContact, that.emergencyContact) &&
                Objects.equals(emergencyContactNumber, that.emergencyContactNumber) &&
                Objects.equals(socialSecurityComputerNumber, that.socialSecurityComputerNumber) &&
                Objects.equals(providentFundAccount, that.providentFundAccount) &&
                Objects.equals(bankCardNumber, that.bankCardNumber) &&
                Objects.equals(openingBank, that.openingBank) &&
                Objects.equals(educationalType, that.educationalType) &&
                Objects.equals(graduateSchool, that.graduateSchool) &&
                Objects.equals(enrolmentTime, that.enrolmentTime) &&
                Objects.equals(graduationTime, that.graduationTime) &&
                Objects.equals(major, that.major) &&
                Objects.equals(graduationCertificate, that.graduationCertificate) &&
                Objects.equals(certificateOfAcademicDegree, that.certificateOfAcademicDegree) &&
                Objects.equals(homeCompany, that.homeCompany) &&
                Objects.equals(title, that.title) &&
                Objects.equals(resume, that.resume) &&
                Objects.equals(isThereAnyCompetitionRestriction, that.isThereAnyCompetitionRestriction) &&
                Objects.equals(proofOfDepartureOfFormerCompany, that.proofOfDepartureOfFormerCompany) &&
                Objects.equals(remarks, that.remarks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, username, mobile, timeOfEntry, departmentName, companyId, sex, dateOfBirth, theHighestDegreeOfEducation, nationalArea, passportNo, idNumber, idCardPhotoPositive, idCardPhotoBack, nativePlace, nation, englishName, maritalStatus, staffPhoto, birthday, zodiac, age, constellation, bloodType, domicile, politicalOutlook, timeToJoinTheParty, archivingOrganization, stateOfChildren, doChildrenHaveCommercialInsurance, isThereAnyViolationOfLawOrDiscipline, areThereAnyMajorMedicalHistories, qq, wechat, residenceCardCity, dateOfResidencePermit, residencePermitDeadline, placeOfResidence, postalAddress, contactTheMobilePhone, personalMailbox, emergencyContact, emergencyContactNumber, socialSecurityComputerNumber, providentFundAccount, bankCardNumber, openingBank, educationalType, graduateSchool, enrolmentTime, graduationTime, major, graduationCertificate, certificateOfAcademicDegree, homeCompany, title, resume, isThereAnyCompetitionRestriction, proofOfDepartureOfFormerCompany, remarks);
    }
}
