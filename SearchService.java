package AGRISENSE;
import java.util.List;
public class SearchService {
	Farmer searchFarmer(List<Farmer> farmerList, int farmerId) {
        return farmerList.stream()
                .filter(farmer -> farmer.farmerId == farmerId)
                .findFirst()
                .orElse(null);
    }

    Crop searchCrop(List<Crop> cropList, int cropId) {
        return cropList.stream()
                .filter(crop -> crop.cropId == cropId)
                .findFirst()
                .orElse(null);
    }
    
    Farm searchFarm(List<Farm> farmList, int farmId) {
        return farmList.stream()
                .filter(farm -> farm.farmId == farmId)
                .findFirst()
                .orElse(null);
    }

    HarvestSales searchHarvest(List<HarvestSales> harvestList, int harvestId) {
        return harvestList.stream()
                .filter(harvest -> harvest.harvestId == harvestId)
                .findFirst()
                .orElse(null);
    }
}