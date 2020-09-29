package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDSpecialPricingConditionsRetrieveOutputModelSpecialPricingConditionsOfferedServiceSpecialPricingConditionsServiceRecordSpecialPricingConditionsServicePoliciesandGuidelines;

import javax.validation.Valid;
  
/**
 * SDSpecialPricingConditionsRetrieveOutputModelSpecialPricingConditionsOfferedServiceSpecialPricingConditionsServiceRecord
 */
public class SDSpecialPricingConditionsRetrieveOutputModelSpecialPricingConditionsOfferedServiceSpecialPricingConditionsServiceRecord   {
  private String specialPricingConditionsServiceType = null;

  private String specialPricingConditionsServiceVersion = null;

  private String specialPricingConditionsServiceDescription = null;

  private SDSpecialPricingConditionsRetrieveOutputModelSpecialPricingConditionsOfferedServiceSpecialPricingConditionsServiceRecordSpecialPricingConditionsServicePoliciesandGuidelines specialPricingConditionsServicePoliciesandGuidelines = null;

  private String specialPricingConditionsServiceSchedule = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Refers to the different types of services offered 
   * @return specialPricingConditionsServiceType
  **/

  public String getSpecialPricingConditionsServiceType() {
    return specialPricingConditionsServiceType;
  }

  public void setSpecialPricingConditionsServiceType(String specialPricingConditionsServiceType) {
    this.specialPricingConditionsServiceType = specialPricingConditionsServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The version details of the service when appropriate 
   * @return specialPricingConditionsServiceVersion
  **/

  public String getSpecialPricingConditionsServiceVersion() {
    return specialPricingConditionsServiceVersion;
  }

  public void setSpecialPricingConditionsServiceVersion(String specialPricingConditionsServiceVersion) {
    this.specialPricingConditionsServiceVersion = specialPricingConditionsServiceVersion;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the offered service  
   * @return specialPricingConditionsServiceDescription
  **/

  public String getSpecialPricingConditionsServiceDescription() {
    return specialPricingConditionsServiceDescription;
  }

  public void setSpecialPricingConditionsServiceDescription(String specialPricingConditionsServiceDescription) {
    this.specialPricingConditionsServiceDescription = specialPricingConditionsServiceDescription;
  }


  /**
   * Get specialPricingConditionsServicePoliciesandGuidelines
   * @return specialPricingConditionsServicePoliciesandGuidelines
  **/

  public SDSpecialPricingConditionsRetrieveOutputModelSpecialPricingConditionsOfferedServiceSpecialPricingConditionsServiceRecordSpecialPricingConditionsServicePoliciesandGuidelines getSpecialPricingConditionsServicePoliciesandGuidelines() {
    return specialPricingConditionsServicePoliciesandGuidelines;
  }

  public void setSpecialPricingConditionsServicePoliciesandGuidelines(SDSpecialPricingConditionsRetrieveOutputModelSpecialPricingConditionsOfferedServiceSpecialPricingConditionsServiceRecordSpecialPricingConditionsServicePoliciesandGuidelines specialPricingConditionsServicePoliciesandGuidelines) {
    this.specialPricingConditionsServicePoliciesandGuidelines = specialPricingConditionsServicePoliciesandGuidelines;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Schedule defining when the accessed service is available 
   * @return specialPricingConditionsServiceSchedule
  **/

  public String getSpecialPricingConditionsServiceSchedule() {
    return specialPricingConditionsServiceSchedule;
  }

  public void setSpecialPricingConditionsServiceSchedule(String specialPricingConditionsServiceSchedule) {
    this.specialPricingConditionsServiceSchedule = specialPricingConditionsServiceSchedule;
  }


}

