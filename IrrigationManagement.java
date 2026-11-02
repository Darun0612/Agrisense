package AGRISENSE;
public class IrrigationManagement {
	    int irrigationId;
	    int farmId;
	    String irrigationMethod;
	    String irrigationDate;
	    double waterQuantity;
	    String fertilizerApplied;
	    String irrigationStatus;

	    public IrrigationManagement(int irrigationId, int farmId, String irrigationMethod, String irrigationDate, double waterQuantity, String fertilizerApplied, String irrigationStatus) {
	        this.irrigationId = irrigationId;
	        this.farmId = farmId;
	        this.irrigationMethod = irrigationMethod;
	        this.irrigationDate = irrigationDate;
	        this.waterQuantity = waterQuantity;
	        this.fertilizerApplied = fertilizerApplied;
	        this.irrigationStatus = irrigationStatus;
	    }

	    void scheduleIrrigation() { System.out.println("Irrigation scheduled."); }
	    void updateIrrigation(String status) { this.irrigationStatus = status; }
	    void displayIrrigation() { System.out.println("Irrigation ID: " + irrigationId); }
	    void calculateWaterUsage() { System.out.println("Water usage: " + waterQuantity + " liters."); }
	    void recordResourceUsage() { System.out.println("Fertilizer applied: " + fertilizerApplied); }
	}

