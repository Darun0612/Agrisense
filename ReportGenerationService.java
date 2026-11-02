package AGRISENSE;

public class ReportGenerationService {
    void generateFarmerReport(Farmer farmer) {
        System.out.println("\n--- Farmer Report ---");
        farmer.displayFarmer();
    }

    void generateCropReport(Crop crop) {
        System.out.println("\n--- Crop Report ---");
        crop.displayCrop();
    }

    void generateHarvestReport(HarvestSales harvest) {
        System.out.println("\n--- Harvest Report ---");
        harvest.displayHarvest();
    }

    void generateRevenueReport(HarvestSales harvest) {
        System.out.println("\n--- Revenue Report ---");
        System.out.println("Crop ID: " + harvest.cropId);
        System.out.println("Buyer: " + harvest.buyerName);
        System.out.println("Total Income: $" + harvest.totalRevenue);
    }
}