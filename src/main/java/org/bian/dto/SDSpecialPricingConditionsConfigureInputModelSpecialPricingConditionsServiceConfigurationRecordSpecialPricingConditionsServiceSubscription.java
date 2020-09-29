package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDSpecialPricingConditionsConfigureInputModelSpecialPricingConditionsServiceConfigurationRecordSpecialPricingConditionsServiceSubscription
 */
public class SDSpecialPricingConditionsConfigureInputModelSpecialPricingConditionsServiceConfigurationRecordSpecialPricingConditionsServiceSubscription   {
  private String specialPricingConditionsServiceSubscriberReference = null;

  private String specialPricingConditionsServiceSubscriberAccessProfile = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Maintains reference to allowed users or subscribers to the service which can be any known party 
   * @return specialPricingConditionsServiceSubscriberReference
  **/

  public String getSpecialPricingConditionsServiceSubscriberReference() {
    return specialPricingConditionsServiceSubscriberReference;
  }

  public void setSpecialPricingConditionsServiceSubscriberReference(String specialPricingConditionsServiceSubscriberReference) {
    this.specialPricingConditionsServiceSubscriberReference = specialPricingConditionsServiceSubscriberReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The allowed service access for a user or subscriber to the service which can be any known party 
   * @return specialPricingConditionsServiceSubscriberAccessProfile
  **/

  public String getSpecialPricingConditionsServiceSubscriberAccessProfile() {
    return specialPricingConditionsServiceSubscriberAccessProfile;
  }

  public void setSpecialPricingConditionsServiceSubscriberAccessProfile(String specialPricingConditionsServiceSubscriberAccessProfile) {
    this.specialPricingConditionsServiceSubscriberAccessProfile = specialPricingConditionsServiceSubscriberAccessProfile;
  }


}

