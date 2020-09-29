package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDSpecialPricingConditionsFeedbackOutputModelSpecialPricingConditionsFeedbackActionRecord;

import javax.validation.Valid;
  
/**
 * SDSpecialPricingConditionsFeedbackOutputModel
 */
public class SDSpecialPricingConditionsFeedbackOutputModel   {
  private String specialPricingConditionsFeedbackActionTaskReference = null;

  private Object specialPricingConditionsFeedbackActionTaskRecord = null;

  private SDSpecialPricingConditionsFeedbackOutputModelSpecialPricingConditionsFeedbackActionRecord specialPricingConditionsFeedbackActionRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a feedback service call 
   * @return specialPricingConditionsFeedbackActionTaskReference
  **/

  public String getSpecialPricingConditionsFeedbackActionTaskReference() {
    return specialPricingConditionsFeedbackActionTaskReference;
  }

  public void setSpecialPricingConditionsFeedbackActionTaskReference(String specialPricingConditionsFeedbackActionTaskReference) {
    this.specialPricingConditionsFeedbackActionTaskReference = specialPricingConditionsFeedbackActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The feedback service call consolidated processing record 
   * @return specialPricingConditionsFeedbackActionTaskRecord
  **/

  public Object getSpecialPricingConditionsFeedbackActionTaskRecord() {
    return specialPricingConditionsFeedbackActionTaskRecord;
  }

  public void setSpecialPricingConditionsFeedbackActionTaskRecord(Object specialPricingConditionsFeedbackActionTaskRecord) {
    this.specialPricingConditionsFeedbackActionTaskRecord = specialPricingConditionsFeedbackActionTaskRecord;
  }


  /**
   * Get specialPricingConditionsFeedbackActionRecord
   * @return specialPricingConditionsFeedbackActionRecord
  **/

  public SDSpecialPricingConditionsFeedbackOutputModelSpecialPricingConditionsFeedbackActionRecord getSpecialPricingConditionsFeedbackActionRecord() {
    return specialPricingConditionsFeedbackActionRecord;
  }

  public void setSpecialPricingConditionsFeedbackActionRecord(SDSpecialPricingConditionsFeedbackOutputModelSpecialPricingConditionsFeedbackActionRecord specialPricingConditionsFeedbackActionRecord) {
    this.specialPricingConditionsFeedbackActionRecord = specialPricingConditionsFeedbackActionRecord;
  }


}

