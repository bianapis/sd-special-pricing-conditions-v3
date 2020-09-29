package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDSpecialPricingConditionsFeedbackInputModelSpecialPricingConditionsFeedbackActionRecord;

import javax.validation.Valid;
  
/**
 * SDSpecialPricingConditionsFeedbackInputModel
 */
public class SDSpecialPricingConditionsFeedbackInputModel   {
  private Object specialPricingConditionsFeedbackActionTaskRecord = null;

  private SDSpecialPricingConditionsFeedbackInputModelSpecialPricingConditionsFeedbackActionRecord specialPricingConditionsFeedbackActionRecord = null;


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

  public SDSpecialPricingConditionsFeedbackInputModelSpecialPricingConditionsFeedbackActionRecord getSpecialPricingConditionsFeedbackActionRecord() {
    return specialPricingConditionsFeedbackActionRecord;
  }

  public void setSpecialPricingConditionsFeedbackActionRecord(SDSpecialPricingConditionsFeedbackInputModelSpecialPricingConditionsFeedbackActionRecord specialPricingConditionsFeedbackActionRecord) {
    this.specialPricingConditionsFeedbackActionRecord = specialPricingConditionsFeedbackActionRecord;
  }


}

