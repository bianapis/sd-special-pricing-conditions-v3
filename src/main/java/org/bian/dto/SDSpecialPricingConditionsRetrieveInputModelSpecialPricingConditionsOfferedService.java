package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDSpecialPricingConditionsRetrieveInputModelSpecialPricingConditionsOfferedServiceSpecialPricingConditionsServiceRecord;

import javax.validation.Valid;
  
/**
 * SDSpecialPricingConditionsRetrieveInputModelSpecialPricingConditionsOfferedService
 */
public class SDSpecialPricingConditionsRetrieveInputModelSpecialPricingConditionsOfferedService   {
  private String specialPricingConditionsServiceReference = null;

  private SDSpecialPricingConditionsRetrieveInputModelSpecialPricingConditionsOfferedServiceSpecialPricingConditionsServiceRecord specialPricingConditionsServiceRecord = null;


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

  public SDSpecialPricingConditionsRetrieveInputModelSpecialPricingConditionsOfferedServiceSpecialPricingConditionsServiceRecord getSpecialPricingConditionsServiceRecord() {
    return specialPricingConditionsServiceRecord;
  }

  public void setSpecialPricingConditionsServiceRecord(SDSpecialPricingConditionsRetrieveInputModelSpecialPricingConditionsOfferedServiceSpecialPricingConditionsServiceRecord specialPricingConditionsServiceRecord) {
    this.specialPricingConditionsServiceRecord = specialPricingConditionsServiceRecord;
  }


}

