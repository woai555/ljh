package com.ljh.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author ljh
 * @since 2020-10-26
 */
public class VAppEpidemic implements Serializable {

    private static final long serialVersionUID=1L;

    private String idCardNo;

    private String idCardType;

    private String idCardName;

    private String patName;

    private String phone;

    private String province;

    private String city;

    private String area;

    private String address;

    private String temperature;

    private Integer fourteenLive;

    private Integer fourteenContact;

    private Integer aroundVirus;

    private Integer contactVirus;

    private String isSpeTrip;

    private String fromCountry;

    private String bjProvince;

    private String bjCity;

    private String bjArea;

    private String bjAddress;

    private LocalDateTime arriveDate;

    private String flightNumber;

    private String seatNumber;

    private String countryDeparture;

    private LocalDateTime startDate;

    private LocalDateTime endDate;

    private String isMarkets;

    private String marketsAddr;

    private String isFebrileSymptoms;

    private String isCommunity;

    private String isHighRisk;

    private String highRiskAddr;

    private String plagueArea;


    public String getIdCardNo() {
        return idCardNo;
    }

    public void setIdCardNo(String idCardNo) {
        this.idCardNo = idCardNo;
    }

    public String getIdCardType() {
        return idCardType;
    }

    public void setIdCardType(String idCardType) {
        this.idCardType = idCardType;
    }

    public String getIdCardName() {
        return idCardName;
    }

    public void setIdCardName(String idCardName) {
        this.idCardName = idCardName;
    }

    public String getPatName() {
        return patName;
    }

    public void setPatName(String patName) {
        this.patName = patName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public Integer getFourteenLive() {
        return fourteenLive;
    }

    public void setFourteenLive(Integer fourteenLive) {
        this.fourteenLive = fourteenLive;
    }

    public Integer getFourteenContact() {
        return fourteenContact;
    }

    public void setFourteenContact(Integer fourteenContact) {
        this.fourteenContact = fourteenContact;
    }

    public Integer getAroundVirus() {
        return aroundVirus;
    }

    public void setAroundVirus(Integer aroundVirus) {
        this.aroundVirus = aroundVirus;
    }

    public Integer getContactVirus() {
        return contactVirus;
    }

    public void setContactVirus(Integer contactVirus) {
        this.contactVirus = contactVirus;
    }

    public String getIsSpeTrip() {
        return isSpeTrip;
    }

    public void setIsSpeTrip(String isSpeTrip) {
        this.isSpeTrip = isSpeTrip;
    }

    public String getFromCountry() {
        return fromCountry;
    }

    public void setFromCountry(String fromCountry) {
        this.fromCountry = fromCountry;
    }

    public String getBjProvince() {
        return bjProvince;
    }

    public void setBjProvince(String bjProvince) {
        this.bjProvince = bjProvince;
    }

    public String getBjCity() {
        return bjCity;
    }

    public void setBjCity(String bjCity) {
        this.bjCity = bjCity;
    }

    public String getBjArea() {
        return bjArea;
    }

    public void setBjArea(String bjArea) {
        this.bjArea = bjArea;
    }

    public String getBjAddress() {
        return bjAddress;
    }

    public void setBjAddress(String bjAddress) {
        this.bjAddress = bjAddress;
    }

    public LocalDateTime getArriveDate() {
        return arriveDate;
    }

    public void setArriveDate(LocalDateTime arriveDate) {
        this.arriveDate = arriveDate;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getCountryDeparture() {
        return countryDeparture;
    }

    public void setCountryDeparture(String countryDeparture) {
        this.countryDeparture = countryDeparture;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    public String getIsMarkets() {
        return isMarkets;
    }

    public void setIsMarkets(String isMarkets) {
        this.isMarkets = isMarkets;
    }

    public String getMarketsAddr() {
        return marketsAddr;
    }

    public void setMarketsAddr(String marketsAddr) {
        this.marketsAddr = marketsAddr;
    }

    public String getIsFebrileSymptoms() {
        return isFebrileSymptoms;
    }

    public void setIsFebrileSymptoms(String isFebrileSymptoms) {
        this.isFebrileSymptoms = isFebrileSymptoms;
    }

    public String getIsCommunity() {
        return isCommunity;
    }

    public void setIsCommunity(String isCommunity) {
        this.isCommunity = isCommunity;
    }

    public String getIsHighRisk() {
        return isHighRisk;
    }

    public void setIsHighRisk(String isHighRisk) {
        this.isHighRisk = isHighRisk;
    }

    public String getHighRiskAddr() {
        return highRiskAddr;
    }

    public void setHighRiskAddr(String highRiskAddr) {
        this.highRiskAddr = highRiskAddr;
    }

    public String getPlagueArea() {
        return plagueArea;
    }

    public void setPlagueArea(String plagueArea) {
        this.plagueArea = plagueArea;
    }

    @Override
    public String toString() {
        return "VAppEpidemic{" +
        "idCardNo=" + idCardNo +
        ", idCardType=" + idCardType +
        ", idCardName=" + idCardName +
        ", patName=" + patName +
        ", phone=" + phone +
        ", province=" + province +
        ", city=" + city +
        ", area=" + area +
        ", address=" + address +
        ", temperature=" + temperature +
        ", fourteenLive=" + fourteenLive +
        ", fourteenContact=" + fourteenContact +
        ", aroundVirus=" + aroundVirus +
        ", contactVirus=" + contactVirus +
        ", isSpeTrip=" + isSpeTrip +
        ", fromCountry=" + fromCountry +
        ", bjProvince=" + bjProvince +
        ", bjCity=" + bjCity +
        ", bjArea=" + bjArea +
        ", bjAddress=" + bjAddress +
        ", arriveDate=" + arriveDate +
        ", flightNumber=" + flightNumber +
        ", seatNumber=" + seatNumber +
        ", countryDeparture=" + countryDeparture +
        ", startDate=" + startDate +
        ", endDate=" + endDate +
        ", isMarkets=" + isMarkets +
        ", marketsAddr=" + marketsAddr +
        ", isFebrileSymptoms=" + isFebrileSymptoms +
        ", isCommunity=" + isCommunity +
        ", isHighRisk=" + isHighRisk +
        ", highRiskAddr=" + highRiskAddr +
        ", plagueArea=" + plagueArea +
        "}";
    }
}
