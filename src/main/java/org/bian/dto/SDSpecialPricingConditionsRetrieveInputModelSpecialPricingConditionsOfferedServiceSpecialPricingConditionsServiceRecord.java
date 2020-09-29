package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDSpecialPricingConditionsRetrieveInputModelSpecialPricingConditionsOfferedServiceSpecialPricingConditionsServiceRecord
 */
public class SDSpecialPricingConditionsRetrieveInputModelSpecialPricingConditionsOfferedServiceSpecialPricingConditionsServiceRecord   {
  private String specialPricingConditionsServiceVersion = null;


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


}

