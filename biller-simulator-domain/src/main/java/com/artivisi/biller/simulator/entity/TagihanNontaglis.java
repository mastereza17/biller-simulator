/**
 * Copyright (C) 2011 ArtiVisi Intermedia <info@artivisi.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.artivisi.biller.simulator.entity;

import java.math.BigDecimal;
import java.util.Date;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

@Entity @Table(name="tagihan_nontaglis")
public class TagihanNontaglis {
	
	@Id @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
	private String id ;
	@Column(name="switcher_id", nullable=false)
	private String switcherId ;
	@Column(name="registration_number",nullable=false,unique=true)
	private String registrationNumber ;
	@Column(name="area_code", nullable=false)
	private Integer areaCode ;
	@Column(name="transaction_code",nullable=false)
	private Integer transactionCode ;
	@Column(name="transaction_name",nullable=false)
	private String transactionName ;
	
	@Temporal(TemporalType.DATE)
	@Column(name="registration_date", nullable=false)
	private Date registrationDate ;
	
	@Temporal(TemporalType.DATE)
	@Column(name="expiration_date", nullable=false)
	private Date expirationDate ;
	
	@Column(name="subscriber_id",nullable=false)
	private BigDecimal subscriberId ;
	@Column(name="subscriber_name",nullable=false)
	private String subscriberName ;
	@Column(name="ref_number",nullable=false)
	private String plnRefNumber ;
	@Column(name="receipt_number",nullable=false)
	private String caReceiptRefNumber ;
	@Column(name="service_unit",nullable=false)
	private String serviceUnit ;
	@Column(name="service_unit_address",nullable=false)
	private String serviceUnitAdress ;
	@Column(name="service_unit_phone",nullable=false)
	private String serviceUnitPhone ;
	@Column(name="total_amount_unit",nullable=false)
	private BigDecimal totalTransactionAmountMinorUnit ;
	@Column(name="total_amount",nullable=false)
	private BigDecimal totalTransactionAmount ;
	@Column(name="pln_bil_unit",nullable=false)
	private BigDecimal plnBillMinorUnit ;
	@Column(name="rptag",nullable=false)
	private BigDecimal rptag ;
	@Column(name="charge_unit",nullable=false)
	private BigDecimal adminChargeUnit ;
	@Column(name="admin_charge",nullable=false)
	private BigDecimal adminCharge ;
	@Column(name="mutation_number",nullable=false)
	private Integer mutationNumber ;
	@Column(name="subscriber_segmentation",nullable=false)
	private Integer subscriberSegmentation ;
	@Column(name="power_consuming_category",nullable=false)
	private Integer powerConsumingCategory ;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSwitcherId() {
		return switcherId;
	}
	public void setSwitcherId(String switcherId) {
		this.switcherId = switcherId;
	}
	public String getRegistrationNumber() {
		return registrationNumber;
	}
	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}
	public Integer getAreaCode() {
		return areaCode;
	}
	public void setAreaCode(Integer areaCode) {
		this.areaCode = areaCode;
	}
	public Integer getTransactionCode() {
		return transactionCode;
	}
	public void setTransactionCode(Integer transactionCode) {
		this.transactionCode = transactionCode;
	}
	public String getTransactionName() {
		return transactionName;
	}
	public void setTransactionName(String transactionName) {
		this.transactionName = transactionName;
	}
	public Date getRegistrationDate() {
		return registrationDate;
	}
	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}
	public Date getExpirationDate() {
		return expirationDate;
	}
	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}
	public BigDecimal getSubscriberId() {
		return subscriberId;
	}
	public void setSubscriberId(BigDecimal subscriberId) {
		this.subscriberId = subscriberId;
	}
	public String getSubscriberName() {
		return subscriberName;
	}
	public void setSubscriberName(String subscriberName) {
		this.subscriberName = subscriberName;
	}
	public String getPlnRefNumber() {
		return plnRefNumber;
	}
	public void setPlnRefNumber(String plnRefNumber) {
		this.plnRefNumber = plnRefNumber;
	}
	public String getCaReceiptRefNumber() {
		return caReceiptRefNumber;
	}
	public void setCaReceiptRefNumber(String caReceiptRefNumber) {
		this.caReceiptRefNumber = caReceiptRefNumber;
	}
	public String getServiceUnit() {
		return serviceUnit;
	}
	public void setServiceUnit(String serviceUnit) {
		this.serviceUnit = serviceUnit;
	}
	public String getServiceUnitAdress() {
		return serviceUnitAdress;
	}
	public void setServiceUnitAdress(String serviceUnitAdress) {
		this.serviceUnitAdress = serviceUnitAdress;
	}
	public String getServiceUnitPhone() {
		return serviceUnitPhone;
	}
	public void setServiceUnitPhone(String serviceUnitPhone) {
		this.serviceUnitPhone = serviceUnitPhone;
	}
	public BigDecimal getTotalTransactionAmountMinorUnit() {
		return totalTransactionAmountMinorUnit;
	}
	public void setTotalTransactionAmountMinorUnit(
			BigDecimal totalTransactionAmountMinorUnit) {
		this.totalTransactionAmountMinorUnit = totalTransactionAmountMinorUnit;
	}
	public BigDecimal getTotalTransactionAmount() {
		return totalTransactionAmount;
	}
	public void setTotalTransactionAmount(BigDecimal totalTransactionAmount) {
		this.totalTransactionAmount = totalTransactionAmount;
	}
	public BigDecimal getPlnBillMinorUnit() {
		return plnBillMinorUnit;
	}
	public void setPlnBillMinorUnit(BigDecimal plnBillMinorUnit) {
		this.plnBillMinorUnit = plnBillMinorUnit;
	}
	public BigDecimal getRptag() {
		return rptag;
	}
	public void setRptag(BigDecimal rptag) {
		this.rptag = rptag;
	}
	public BigDecimal getAdminChargeUnit() {
		return adminChargeUnit;
	}
	public void setAdminChargeUnit(BigDecimal adminChargeUnit) {
		this.adminChargeUnit = adminChargeUnit;
	}
	public BigDecimal getAdminCharge() {
		return adminCharge;
	}
	public void setAdminCharge(BigDecimal adminCharge) {
		this.adminCharge = adminCharge;
	}
	public Integer getMutationNumber() {
		return mutationNumber;
	}
	public void setMutationNumber(Integer mutationNumber) {
		this.mutationNumber = mutationNumber;
	}
	public Integer getSubscriberSegmentation() {
		return subscriberSegmentation;
	}
	public void setSubscriberSegmentation(Integer subscriberSegmentation) {
		this.subscriberSegmentation = subscriberSegmentation;
	}
	public Integer getPowerConsumingCategory() {
		return powerConsumingCategory;
	}
	public void setPowerConsumingCategory(Integer powerConsumingCategory) {
		this.powerConsumingCategory = powerConsumingCategory;
	}
	
}
