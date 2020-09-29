package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDSpecialPricingConditionsRetrieveInputModelSpecialPricingConditionsOfferedService;
import org.bian.dto.SDSpecialPricingConditionsRetrieveInputModelSpecialPricingConditionsRetrieveActionRecord;

import javax.validation.Valid;
  
/**
 * SDSpecialPricingConditionsRetrieveInputModel
 */
public class SDSpecialPricingConditionsRetrieveInputModel   {
  private Object specialPricingConditionsRetrieveActionTaskRecord = null;

  private String specialPricingConditionsRetrieveActionRequest = null;

  private SDSpecialPricingConditionsRetrieveInputModelSpecialPricingConditionsRetrieveActionRecord specialPricingConditionsRetrieveActionRecord = null;

  private SDSpecialPricingConditionsRetrieveInputModelSpecialPricingConditionsOfferedService specialPricingConditionsOfferedService = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return specialPricingConditionsRetrieveActionTaskRecord
  **/

  public Object getSpecialPricingConditionsRetrieveActionTaskRecord() {
    return specialPricingConditionsRetrieveActionTaskRecord;
  }

  public void setSpecialPricingConditionsRetrieveActionTaskRecord(Object specialPricingConditionsRetrieveActionTaskRecord) {
    this.specialPricingConditionsRetrieveActionTaskRecord = specialPricingConditionsRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return specialPricingConditionsRetrieveActionRequest
  **/

  public String getSpecialPricingConditionsRetrieveActionRequest() {
    return specialPricingConditionsRetrieveActionRequest;
  }

  public void setSpecialPricingConditionsRetrieveActionRequest(String specialPricingConditionsRetrieveActionRequest) {
    this.specialPricingConditionsRetrieveActionRequest = specialPricingConditionsRetrieveActionRequest;
  }


  /**
   * Get specialPricingConditionsRetrieveActionRecord
   * @return specialPricingConditionsRetrieveActionRecord
  **/

  public SDSpecialPricingConditionsRetrieveInputModelSpecialPricingConditionsRetrieveActionRecord getSpecialPricingConditionsRetrieveActionRecord() {
    return specialPricingConditionsRetrieveActionRecord;
  }

  public void setSpecialPricingConditionsRetrieveActionRecord(SDSpecialPricingConditionsRetrieveInputModelSpecialPricingConditionsRetrieveActionRecord specialPricingConditionsRetrieveActionRecord) {
    this.specialPricingConditionsRetrieveActionRecord = specialPricingConditionsRetrieveActionRecord;
  }


  /**
   * Get specialPricingConditionsOfferedService
   * @return specialPricingConditionsOfferedService
  **/

  public SDSpecialPricingConditionsRetrieveInputModelSpecialPricingConditionsOfferedService getSpecialPricingConditionsOfferedService() {
    return specialPricingConditionsOfferedService;
  }

  public void setSpecialPricingConditionsOfferedService(SDSpecialPricingConditionsRetrieveInputModelSpecialPricingConditionsOfferedService specialPricingConditionsOfferedService) {
    this.specialPricingConditionsOfferedService = specialPricingConditionsOfferedService;
  }


}

