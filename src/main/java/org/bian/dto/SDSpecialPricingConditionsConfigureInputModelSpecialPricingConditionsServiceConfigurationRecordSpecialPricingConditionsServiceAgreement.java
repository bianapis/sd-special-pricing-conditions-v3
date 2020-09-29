package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDSpecialPricingConditionsConfigureInputModelSpecialPricingConditionsServiceConfigurationRecordSpecialPricingConditionsServiceAgreement
 */
public class SDSpecialPricingConditionsConfigureInputModelSpecialPricingConditionsServiceConfigurationRecordSpecialPricingConditionsServiceAgreement   {
  private String specialPricingConditionsServiceAgreementReference = null;

  private String specialPricingConditionsServiceUserReference = null;

  private String specialPricingConditionsServiceAgreementTermsandConditions = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the offered service agreement 
   * @return specialPricingConditionsServiceAgreementReference
  **/

  public String getSpecialPricingConditionsServiceAgreementReference() {
    return specialPricingConditionsServiceAgreementReference;
  }

  public void setSpecialPricingConditionsServiceAgreementReference(String specialPricingConditionsServiceAgreementReference) {
    this.specialPricingConditionsServiceAgreementReference = specialPricingConditionsServiceAgreementReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the user covered by the contract 
   * @return specialPricingConditionsServiceUserReference
  **/

  public String getSpecialPricingConditionsServiceUserReference() {
    return specialPricingConditionsServiceUserReference;
  }

  public void setSpecialPricingConditionsServiceUserReference(String specialPricingConditionsServiceUserReference) {
    this.specialPricingConditionsServiceUserReference = specialPricingConditionsServiceUserReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Terms and conditions covering the service agreement 
   * @return specialPricingConditionsServiceAgreementTermsandConditions
  **/

  public String getSpecialPricingConditionsServiceAgreementTermsandConditions() {
    return specialPricingConditionsServiceAgreementTermsandConditions;
  }

  public void setSpecialPricingConditionsServiceAgreementTermsandConditions(String specialPricingConditionsServiceAgreementTermsandConditions) {
    this.specialPricingConditionsServiceAgreementTermsandConditions = specialPricingConditionsServiceAgreementTermsandConditions;
  }


}

