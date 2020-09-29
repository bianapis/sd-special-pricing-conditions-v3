package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDSpecialPricingConditionsRetrieveOutputModelSpecialPricingConditionsOfferedServiceSpecialPricingConditionsServiceRecordSpecialPricingConditionsServicePoliciesandGuidelines
 */
public class SDSpecialPricingConditionsRetrieveOutputModelSpecialPricingConditionsOfferedServiceSpecialPricingConditionsServiceRecordSpecialPricingConditionsServicePoliciesandGuidelines   {
  private String specialPricingConditionsServiceEligibility = null;

  private String specialPricingConditionsServiceIntendedUses = null;

  private String specialPricingConditionsServicePricingandTerms = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Policies and rules governing access to the offered service, includes eligibility and qualifications 
   * @return specialPricingConditionsServiceEligibility
  **/

  public String getSpecialPricingConditionsServiceEligibility() {
    return specialPricingConditionsServiceEligibility;
  }

  public void setSpecialPricingConditionsServiceEligibility(String specialPricingConditionsServiceEligibility) {
    this.specialPricingConditionsServiceEligibility = specialPricingConditionsServiceEligibility;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Guidelines covering allowed, intended use of the service 
   * @return specialPricingConditionsServiceIntendedUses
  **/

  public String getSpecialPricingConditionsServiceIntendedUses() {
    return specialPricingConditionsServiceIntendedUses;
  }

  public void setSpecialPricingConditionsServiceIntendedUses(String specialPricingConditionsServiceIntendedUses) {
    this.specialPricingConditionsServiceIntendedUses = specialPricingConditionsServiceIntendedUses;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Terms, prices, penalties associated with use of the service 
   * @return specialPricingConditionsServicePricingandTerms
  **/

  public String getSpecialPricingConditionsServicePricingandTerms() {
    return specialPricingConditionsServicePricingandTerms;
  }

  public void setSpecialPricingConditionsServicePricingandTerms(String specialPricingConditionsServicePricingandTerms) {
    this.specialPricingConditionsServicePricingandTerms = specialPricingConditionsServicePricingandTerms;
  }


}

