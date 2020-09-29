package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDSpecialPricingConditionsActivateInputModelSpecialPricingConditionsServiceConfigurationRecordSpecialPricingConditionsServiceConfigurationSetup
 */
public class SDSpecialPricingConditionsActivateInputModelSpecialPricingConditionsServiceConfigurationRecordSpecialPricingConditionsServiceConfigurationSetup   {
  private String specialPricingConditionsServiceConfigurationParameter = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The default activation setting for the offered service configuration parameter  
   * @return specialPricingConditionsServiceConfigurationParameter
  **/

  public String getSpecialPricingConditionsServiceConfigurationParameter() {
    return specialPricingConditionsServiceConfigurationParameter;
  }

  public void setSpecialPricingConditionsServiceConfigurationParameter(String specialPricingConditionsServiceConfigurationParameter) {
    this.specialPricingConditionsServiceConfigurationParameter = specialPricingConditionsServiceConfigurationParameter;
  }


}

