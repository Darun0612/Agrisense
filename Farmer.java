package AGRISENSE;
	public class Farmer {
	    int farmerId;
	    String farmerName;
	    String village;
	    String district;
	    long mobileNumber;
	    String email;
	    double landArea;
	    int farmingExperience;

	    public Farmer(int farmerId, String farmerName, String village, String district, long mobileNumber, String email, double landArea, int farmingExperience) {
	        this.farmerId = farmerId;
	        this.farmerName = farmerName;
	        this.village = village;
	        this.district = district;
	        this.mobileNumber = mobileNumber;
	        this.email = email;
	        this.landArea = landArea;
	        this.farmingExperience = farmingExperience;
	    }

	    void registerFarmer() { System.out.println("Farmer " + farmerName + " registered successfully."); }
	    void updateFarmer(long newMobile, double newLandArea) { this.mobileNumber = newMobile; this.landArea = newLandArea; }
	    void displayFarmer() { System.out.println("ID: " + farmerId + " | Name: " + farmerName + " | Village: " + village + " | Land: " + landArea + " acres"); }
	    void viewFarmHistory() { System.out.println("Displaying farm history for " + farmerName); }
	    void deactivateFarmer() { System.out.println("Farmer account deactivated."); }
	}
