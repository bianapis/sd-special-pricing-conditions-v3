package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDSpecialPricingConditionsRetrieveOutputModelSpecialPricingConditionsOfferedService;
import org.bian.dto.SDSpecialPricingConditionsRetrieveOutputModelSpecialPricingConditionsRetrieveActionRecord;

import javax.validation.Valid;
  
/**
 * SDSpecialPricingConditionsRetrieveOutputModel
 */
public class SDSpecialPricingConditionsRetrieveOutputModel   {
  private String specialPricingConditionsRetrieveActionTaskReference = null;

  private Object specialPricingConditionsRetrieveActionTaskRecord = null;

  private String specialPricingConditionsRetrieveActionResponse = null;

  private SDSpecialPricingConditionsRetrieveOutputModelSpecialPricingConditionsRetrieveActionRecord specialPricingConditionsRetrieveActionRecord = null;

  private SDSpecialPricingConditionsRetrieveOutputModelSpecialPricingConditionsOfferedService specialPricingConditionsOfferedService = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a retrieve service call 
   * @return specialPricingConditionsRetrieveActionTaskReference
  **/

  public String getSpecialPricingConditionsRetrieveActionTaskReference() {
    return specialPricingConditionsRetrieveActionTaskReference;
  }

  public void setSpecialPricingConditionsRetrieveActionTaskReference(String specialPricingConditionsRetrieveActionTaskReference) {
    this.specialPricingConditionsRetrieveActionTaskReference = specialPricingConditionsRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return specialPricingConditionsRetrieveActionResponse
  **/

  public String getSpecialPricingConditionsRetrieveActionResponse() {
    return specialPricingConditionsRetrieveActionResponse;
  }

  public void setSpecialPricingConditionsRetrieveActionResponse(String specialPricingConditionsRetrieveActionResponse) {
    this.specialPricingConditionsRetrieveActionResponse = specialPricingConditionsRetrieveActionResponse;
  }


  /**
   * Get specialPricingConditionsRetrieveActionRecord
   * @return specialPricingConditionsRetrieveActionRecord
  **/

  public SDSpecialPricingConditionsRetrieveOutputModelSpecialPricingConditionsRetrieveActionRecord getSpecialPricingConditionsRetrieveActionRecord() {
    return specialPricingConditionsRetrieveActionRecord;
  }

  public void setSpecialPricingConditionsRetrieveActionRecord(SDSpecialPricingConditionsRetrieveOutputModelSpecialPricingConditionsRetrieveActionRecord specialPricingConditionsRetrieveActionRecord) {
    this.specialPricingConditionsRetrieveActionRecord = specialPricingConditionsRetrieveActionRecord;
  }


  /**
   * Get specialPricingConditionsOfferedService
   * @return specialPricingConditionsOfferedService
  **/

  public SDSpecialPricingConditionsRetrieveOutputModelSpecialPricingConditionsOfferedService getSpecialPricingConditionsOfferedService() {
    return specialPricingConditionsOfferedService;
  }

  public void setSpecialPricingConditionsOfferedService(SDSpecialPricingConditionsRetrieveOutputModelSpecialPricingConditionsOfferedService specialPricingConditionsOfferedService) {
    this.specialPricingConditionsOfferedService = specialPricingConditionsOfferedService;
  }


}

