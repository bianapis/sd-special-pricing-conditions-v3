package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQPricingTermsInitiateInputModel
 */
public class BQPricingTermsInitiateInputModel   {
  private String specialPricingConditionsDirectoryEntryInstanceReference = null;

  private Object pricingTermsInitiateActionRecord = null;

  private String pricingTermsPreconditions = null;

  private String pricingTermsPropertySchedule = null;

  private String pricingTermsVersionNumber = null;

  private String specialPricingterms = null;

  private String specialPricingtermsServiceType = null;

  private String specialPricingtermsServiceDescription = null;

  private String specialPricingtermsServiceInputsandOuputs = null;

  private String specialPricingtermsServiceWorkProduct = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Special Pricing Conditions Directory Entry instance 
   * @return specialPricingConditionsDirectoryEntryInstanceReference
  **/

  public String getSpecialPricingConditionsDirectoryEntryInstanceReference() {
    return specialPricingConditionsDirectoryEntryInstanceReference;
  }

  public void setSpecialPricingConditionsDirectoryEntryInstanceReference(String specialPricingConditionsDirectoryEntryInstanceReference) {
    this.specialPricingConditionsDirectoryEntryInstanceReference = specialPricingConditionsDirectoryEntryInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return pricingTermsInitiateActionRecord
  **/

  public Object getPricingTermsInitiateActionRecord() {
    return pricingTermsInitiateActionRecord;
  }

  public void setPricingTermsInitiateActionRecord(Object pricingTermsInitiateActionRecord) {
    this.pricingTermsInitiateActionRecord = pricingTermsInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation before the property is valid/meaningful 
   * @return pricingTermsPreconditions
  **/

  public String getPricingTermsPreconditions() {
    return pricingTermsPreconditions;
  }

  public void setPricingTermsPreconditions(String pricingTermsPreconditions) {
    this.pricingTermsPreconditions = pricingTermsPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The schedule and timing for which the property value is valid 
   * @return pricingTermsPropertySchedule
  **/

  public String getPricingTermsPropertySchedule() {
    return pricingTermsPropertySchedule;
  }

  public void setPricingTermsPropertySchedule(String pricingTermsPropertySchedule) {
    this.pricingTermsPropertySchedule = pricingTermsPropertySchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The version reference for the property value 
   * @return pricingTermsVersionNumber
  **/

  public String getPricingTermsVersionNumber() {
    return pricingTermsVersionNumber;
  }

  public void setPricingTermsVersionNumber(String pricingTermsVersionNumber) {
    this.pricingTermsVersionNumber = pricingTermsVersionNumber;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The Special Pricing Conditions Directory Entry specific Business Service 
   * @return specialPricingterms
  **/

  public String getSpecialPricingterms() {
    return specialPricingterms;
  }

  public void setSpecialPricingterms(String specialPricingterms) {
    this.specialPricingterms = specialPricingterms;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return specialPricingtermsServiceType
  **/

  public String getSpecialPricingtermsServiceType() {
    return specialPricingtermsServiceType;
  }

  public void setSpecialPricingtermsServiceType(String specialPricingtermsServiceType) {
    this.specialPricingtermsServiceType = specialPricingtermsServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return specialPricingtermsServiceDescription
  **/

  public String getSpecialPricingtermsServiceDescription() {
    return specialPricingtermsServiceDescription;
  }

  public void setSpecialPricingtermsServiceDescription(String specialPricingtermsServiceDescription) {
    this.specialPricingtermsServiceDescription = specialPricingtermsServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return specialPricingtermsServiceInputsandOuputs
  **/

  public String getSpecialPricingtermsServiceInputsandOuputs() {
    return specialPricingtermsServiceInputsandOuputs;
  }

  public void setSpecialPricingtermsServiceInputsandOuputs(String specialPricingtermsServiceInputsandOuputs) {
    this.specialPricingtermsServiceInputsandOuputs = specialPricingtermsServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return specialPricingtermsServiceWorkProduct
  **/

  public String getSpecialPricingtermsServiceWorkProduct() {
    return specialPricingtermsServiceWorkProduct;
  }

  public void setSpecialPricingtermsServiceWorkProduct(String specialPricingtermsServiceWorkProduct) {
    this.specialPricingtermsServiceWorkProduct = specialPricingtermsServiceWorkProduct;
  }


}

