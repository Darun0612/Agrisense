package AGRISENSE;
public class Crop{
	    int cropId;
	    String cropName;
	    String cropVariety;
	    String sowingDate;
	    String expectedHarvestDate;
	    String fertilizerType;
	    String cropStatus;

	     Crop(int cropId, String cropName, String cropVariety, String sowingDate, String expectedHarvestDate, String fertilizerType, String cropStatus) {
	        this.cropId = cropId;
	        this.cropName = cropName;
	        this.cropVariety = cropVariety;
	        this.sowingDate = sowingDate;
	        this.expectedHarvestDate = expectedHarvestDate;
	        this.fertilizerType = fertilizerType;
	        this.cropStatus = cropStatus;
	    }

	    void registerCrop() { System.out.println("Crop " + cropName + " registered."); }
	    void updateCrop(String expectedHarvestDate) { this.expectedHarvestDate = expectedHarvestDate; }
	    void displayCrop() { System.out.println("Crop ID: " + cropId + " | Name: " + cropName + " | Status: " + cropStatus); }
	    void updateGrowthStatus(String newStatus) { this.cropStatus = newStatus; }
	    void recordPesticideUsage(String pesticide) { System.out.println("Pesticide " + pesticide + " recorded."); }
	}

