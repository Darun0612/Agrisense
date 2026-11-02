package AGRISENSE;
public class Farm {
	    int farmId;
	    int farmerId;
	    String farmLocation;
	    String soilType;
	    double cultivationArea;
  String currentCrop;
	    String farmStatus;
	    public Farm(int farmId, int farmerId, String farmLocation, String soilType, double cultivationArea, String currentCrop, String farmStatus) {
	        this.farmId = farmId;
	        this.farmerId = farmerId;
	        this.farmLocation = farmLocation;
	        this.soilType = soilType;
	        this.cultivationArea = cultivationArea;
	        this.currentCrop = currentCrop;
	        this.farmStatus = farmStatus;
	    }
	    void registerFarm() { System.out.println("Farm registered at " + farmLocation); }
	    void updateFarm(String newStatus) { this.farmStatus = newStatus; }
	    void displayFarm() { System.out.println("Farm ID: " + farmId + " | Location: " + farmLocation); }
	    void allocateCrop(String crop) { this.currentCrop = crop; }
	    void updateSoilInformation(String soil) { this.soilType = soil; }
	}

