package AGRISENSE;
public class HarvestSales {
	    int harvestId;
	    int cropId;
	    String harvestDate;
	    double harvestedQuantity;
	    double sellingPrice;
	    String buyerName;
	    double totalRevenue;

	    public HarvestSales(int harvestId, int cropId, String harvestDate, double harvestedQuantity, double sellingPrice, String buyerName) {
	        this.harvestId = harvestId;
	        this.cropId = cropId;
	        this.harvestDate = harvestDate;
	        this.harvestedQuantity = harvestedQuantity;
	        this.sellingPrice = sellingPrice;
	        this.totalRevenue = harvestedQuantity * sellingPrice;
	    }

	    void recordHarvest() { System.out.println("Harvest recorded. Quantity: " + harvestedQuantity); }
	    void calculateRevenue() { System.out.println("Calculated Revenue: $" + totalRevenue); }
	    void updateSales(double newPrice) { this.sellingPrice = newPrice; this.totalRevenue = newPrice * harvestedQuantity; }
	    void displayHarvest() { System.out.println("Harvest ID: " + harvestId + " | Buyer: " + buyerName + " | Revenue: $" + totalRevenue); }
	    void generateInvoice() { System.out.println("--- INVOICE ---\nBuyer: " + buyerName + "\nTotal: $" + totalRevenue); }
	}

