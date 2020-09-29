package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDSpecialPricingConditionsRetrieveOutputModelSpecialPricingConditionsOfferedServiceSpecialPricingConditionsServiceRecord;

import javax.validation.Valid;
  
/**
 * SDSpecialPricingConditionsRetrieveOutputModelSpecialPricingConditionsOfferedService
 */
public class SDSpecialPricingConditionsRetrieveOutputModelSpecialPricingConditionsOfferedService   {
  private String specialPricingConditionsServiceReference = null;

  private SDSpecialPricingConditionsRetrieveOutputModelSpecialPricingConditionsOfferedServiceSpecialPricingConditionsServiceRecord specialPricingConditionsServiceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service offered by the service center 
   * @return specialPricingConditionsServiceReference
  **/

  public String getSpecialPricingConditionsServiceReference() {
    return specialPricingConditionsServiceReference;
  }

  public void setSpecialPricingConditionsServiceReference(String specialPricingConditionsServiceReference) {
    this.specialPricingConditionsServiceReference = specialPricingConditionsServiceReference;
  }


  /**
   * Get specialPricingConditionsServiceRecord
   * @return specialPricingConditionsServiceRecord
  **/

  public SDSpecialPricingConditionsRetrieveOutputModelSpecialPricingConditionsOfferedServiceSpecialPricingConditionsServiceRecord getSpecialPricingConditionsServiceRecord() {
    return specialPricingConditionsServiceRecord;
  }

  public void setSpecialPricingConditionsServiceRecord(SDSpecialPricingConditionsRetrieveOutputModelSpecialPricingConditionsOfferedServiceSpecialPricingConditionsServiceRecord specialPricingConditionsServiceRecord) {
    this.specialPricingConditionsServiceRecord = specialPricingConditionsServiceRecord;
  }


}

