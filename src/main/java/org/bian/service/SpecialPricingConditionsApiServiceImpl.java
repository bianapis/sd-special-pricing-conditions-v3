/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class SpecialPricingConditionsApiServiceImpl implements SpecialPricingConditionsApiService {

	public SDSpecialPricingConditionsActivateOutputModel activate(SDSpecialPricingConditionsActivateInputModel request){
		return JsonReader.read("activate-SDSpecialPricingConditionsActivateOutputModel.json",new TypeReference<SDSpecialPricingConditionsActivateOutputModel>(){});
	}
	
	public SDSpecialPricingConditionsConfigureOutputModel configure(String sdReferenceId, SDSpecialPricingConditionsConfigureInputModel request){
		return JsonReader.read("configure-SDSpecialPricingConditionsConfigureOutputModel.json",new TypeReference<SDSpecialPricingConditionsConfigureOutputModel>(){});
	}
	
	public CRSpecialPricingConditionsDirectoryEntryControlOutputModel control(String sdReferenceId, String crReferenceId, CRSpecialPricingConditionsDirectoryEntryControlInputModel request){
		return JsonReader.read("control-CRSpecialPricingConditionsDirectoryEntryControlOutputModel.json",new TypeReference<CRSpecialPricingConditionsDirectoryEntryControlOutputModel>(){});
	}
	
	public CRSpecialPricingConditionsDirectoryEntryExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRSpecialPricingConditionsDirectoryEntryExchangeInputModel request){
		return JsonReader.read("exchange-CRSpecialPricingConditionsDirectoryEntryExchangeOutputModel.json",new TypeReference<CRSpecialPricingConditionsDirectoryEntryExchangeOutputModel>(){});
	}
	
	public CRSpecialPricingConditionsDirectoryEntryExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRSpecialPricingConditionsDirectoryEntryExecuteInputModel request){
		return JsonReader.read("execute-CRSpecialPricingConditionsDirectoryEntryExecuteOutputModel.json",new TypeReference<CRSpecialPricingConditionsDirectoryEntryExecuteOutputModel>(){});
	}
	
	public SDSpecialPricingConditionsFeedbackOutputModel feedback(String sdReferenceId, SDSpecialPricingConditionsFeedbackInputModel request){
		return JsonReader.read("feedback-SDSpecialPricingConditionsFeedbackOutputModel.json",new TypeReference<SDSpecialPricingConditionsFeedbackOutputModel>(){});
	}
	
	public CRSpecialPricingConditionsDirectoryEntryInitiateOutputModel initiate(String sdReferenceId, CRSpecialPricingConditionsDirectoryEntryInitiateInputModel request){
		return JsonReader.read("initiate-CRSpecialPricingConditionsDirectoryEntryInitiateOutputModel.json",new TypeReference<CRSpecialPricingConditionsDirectoryEntryInitiateOutputModel>(){});
	}
	
	public BQPricingTermsInitiateOutputModel initiatePricingterms(String sdReferenceId, String crReferenceId, BQPricingTermsInitiateInputModel request){
		return JsonReader.read("initiate-BQPricingTermsInitiateOutputModel.json",new TypeReference<BQPricingTermsInitiateOutputModel>(){});
	}
	
	public CRSpecialPricingConditionsDirectoryEntryRequestOutputModel request(String sdReferenceId, String crReferenceId, CRSpecialPricingConditionsDirectoryEntryRequestInputModel request){
		return JsonReader.read("request-CRSpecialPricingConditionsDirectoryEntryRequestOutputModel.json",new TypeReference<CRSpecialPricingConditionsDirectoryEntryRequestOutputModel>(){});
	}
	
	public SDSpecialPricingConditionsRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDSpecialPricingConditionsRetrieveOutputModel.json",new TypeReference<SDSpecialPricingConditionsRetrieveOutputModel>(){});
	}
	
	public CRSpecialPricingConditionsDirectoryEntryRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRSpecialPricingConditionsDirectoryEntryRetrieveOutputModel.json",new TypeReference<CRSpecialPricingConditionsDirectoryEntryRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public BQPricingTermsRetrieveOutputModel retrievePricingterms(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQPricingTermsRetrieveOutputModel.json",new TypeReference<BQPricingTermsRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public CRSpecialPricingConditionsDirectoryEntryUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRSpecialPricingConditionsDirectoryEntryUpdateInputModel request){
		return JsonReader.read("update-CRSpecialPricingConditionsDirectoryEntryUpdateOutputModel.json",new TypeReference<CRSpecialPricingConditionsDirectoryEntryUpdateOutputModel>(){});
	}
	
	public BQPricingTermsUpdateOutputModel updatePricingterms(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPricingTermsUpdateInputModel request){
		return JsonReader.read("update-BQPricingTermsUpdateOutputModel.json",new TypeReference<BQPricingTermsUpdateOutputModel>(){});
	}
	
}
