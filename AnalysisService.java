	package AGRISENSE;
	import java.util.List;
	import java.util.Comparator;

	public class AnalysisService {
	    
	    void calculateTotalRevenue(List<HarvestSales> harvestList) {
	        double total = harvestList.stream()
	                .mapToDouble(harvest -> harvest.totalRevenue) 
	                .sum();                                      
	                
	        System.out.println("Total Agricultural Revenue: $" + total);
	    }

	    void generateSummary(int farmerCount, int cropCount, int farmCount) {
	        System.out.println("\n--- AgriSense System Summary ---");
	        System.out.println("Total Farmers Registered: " + farmerCount);
	        System.out.println("Total Crops Monitored: " + cropCount);
	        System.out.println("Total Farms Managed: " + farmCount);
	    }

	    void identifyHighestYieldCrop(List<HarvestSales> harvestList) {
	        if (harvestList.isEmpty()) {
	            System.out.println("No harvest data available.");
	            return;
	        }
	        
	        HarvestSales highest = harvestList.stream()
	                .max(Comparator.comparingDouble(harvest -> harvest.harvestedQuantity))
	                .orElse(null);
	                
	        System.out.println("Highest Yield was Crop ID: " + highest.cropId + " with " + highest.harvestedQuantity + " units.");
	    }

	    void analyzeWaterConsumption(List<IrrigationManagement> irrigationList) {
	        double totalWater = irrigationList.stream()
	                .mapToDouble(irrigation -> irrigation.waterQuantity)
	                .sum();
	                
	        System.out.println("Total Farm Water Consumption: " + totalWater + " liters");
	    }
	}
