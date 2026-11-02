package AGRISENSE;
public class ValidateService {
	    boolean validateFarmerId(int farmerId) { return farmerId > 0; }
	    boolean validateCropId(int cropId) { return cropId > 0; }
	    boolean validateMobileNumber(long mobileNumber) { return String.valueOf(mobileNumber).length() >= 10; }
	    boolean validateEmail(String email) { return email != null && email.contains("@"); }
	}


