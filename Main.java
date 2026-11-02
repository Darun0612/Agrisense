package AGRISENSE;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    
    static ArrayList<Farmer> farmerList = new ArrayList<>();
    static ArrayList<Crop> cropList = new ArrayList<>();
    static ArrayList<Farm> farmList = new ArrayList<>();
    static ArrayList<IrrigationManagement> irrigationList = new ArrayList<>();
    static ArrayList<HarvestSales> harvestList = new ArrayList<>();
    
    static ValidateService validator = new ValidateService();
    static SearchService searcher = new SearchService();
    static ReportGenerationService reporter = new ReportGenerationService();
    static AnalysisService analyzer = new AnalysisService();

    public static void main(String[] args) {
        boolean exit = false;
        System.out.println("==================================================");
        System.out.println("  AGRISENSE - DIGITAL FARMING ASSISTANT (MAIN)   ");
        System.out.println("==================================================");
        
        while (!exit) {
            displayMenu();
            
            try {
                int choice = scanner.nextInt();
                scanner.nextLine(); 
                exit = processChoice(choice);
            } catch (Exception e) {
                System.out.println("--- ERROR: Invalid input. Please enter a valid number. ---");
                scanner.nextLine(); 
            }
        }
    }

    static void displayMenu() {
        System.out.println("\n------------- MAIN MENU -------------");
        System.out.println("1. Register Farmer");
        System.out.println("2. Register Crop");
        System.out.println("3. Register Farm");
        System.out.println("4. Schedule Irrigation");
        System.out.println("5. Record Harvest & Sale");
        System.out.println("6. Search & Reports Menu");
        System.out.println("7. Data Analysis Menu");
        System.out.println("8. Save Data & Exit");
        System.out.print("Enter your choice (1-8): ");
    }

    static boolean processChoice(int choice) {
        switch (choice) {
            case 1:
                System.out.print("Enter Farmer ID: ");
                int fId = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Enter Farmer Name: ");
                String name = scanner.nextLine();
                System.out.print("Enter Village: ");
                String village = scanner.nextLine();
                System.out.print("Enter District: ");
                String district = scanner.nextLine();
                System.out.print("Enter Mobile Number (10 digits): ");
                long mobile = scanner.nextLong();
                scanner.nextLine();
                System.out.print("Enter Email: ");
                String email = scanner.nextLine();
                
                if (!validator.validateMobileNumber(mobile)) {
                    System.out.println("Registration Failed: Mobile number must be at least 10 digits.");
                    break;
                }
                if (!validator.validateEmail(email)) {
                    System.out.println("Registration Failed: Invalid email format (must contain '@').");
                    break;
                }

                System.out.print("Enter Land Area (acres): ");
                double land = scanner.nextDouble();
                System.out.print("Enter Experience (years): ");
                int exp = scanner.nextInt();
                
                Farmer newFarmer = new Farmer(fId, name, village, district, mobile, email, land, exp);
                farmerList.add(newFarmer);
                newFarmer.registerFarmer();
                break;
                
            case 2:
                System.out.print("Enter Crop ID: ");
                int cId = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Enter Crop Name: ");
                String cName = scanner.nextLine();
                System.out.print("Enter Variety: ");
                String variety = scanner.nextLine();
                System.out.print("Enter Sowing Date: ");
                String sowingDate = scanner.nextLine();
                System.out.print("Enter Harvest Date: ");
                String harvestDate = scanner.nextLine();
                System.out.print("Enter Fertilizer Type: ");
                String fertilizer = scanner.nextLine();
                
                Crop newCrop = new Crop(cId, cName, variety, sowingDate, harvestDate, fertilizer, "Sown");
                cropList.add(newCrop);
                newCrop.registerCrop();
                break;
                
            case 3:
                System.out.print("Enter Farm ID: ");
                int farmId = scanner.nextInt();
                System.out.print("Enter Farmer ID: ");
                int ownerId = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Enter Location: ");
                String location = scanner.nextLine();
                System.out.print("Enter Soil Type: ");
                String soil = scanner.nextLine();
                System.out.print("Enter Area (acres): ");
                double area = scanner.nextDouble();
                scanner.nextLine();
                System.out.print("Enter Current Crop: ");
                String curCrop = scanner.nextLine();
                
                Farm newFarm = new Farm(farmId, ownerId, location, soil, area, curCrop, "Active");
                farmList.add(newFarm);
                newFarm.registerFarm();
                break;
                
            case 4:
                System.out.print("Enter Irrigation ID: ");
                int irId = scanner.nextInt();
                System.out.print("Enter Farm ID: ");
                int fIdRef = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Enter Method: ");
                String method = scanner.nextLine();
                System.out.print("Enter Date: ");
                String irDate = scanner.nextLine();
                System.out.print("Enter Water Quantity (liters): ");
                double waterQty = scanner.nextDouble();
                scanner.nextLine();
                System.out.print("Enter Fertilizer Applied: ");
                String fertApplied = scanner.nextLine();
                
                IrrigationManagement newIrrigation = new IrrigationManagement(irId, fIdRef, method, irDate, waterQty, fertApplied, "Scheduled");
                irrigationList.add(newIrrigation);
                newIrrigation.scheduleIrrigation();
                break;
                
            case 5:
                System.out.print("Enter Harvest ID: ");
                int hId = scanner.nextInt();
                System.out.print("Enter Crop ID: ");
                int cropIdRef = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Enter Harvest Date: ");
                String hDate = scanner.nextLine();
                System.out.print("Enter Quantity (kg): ");
                double qty = scanner.nextDouble();
                System.out.print("Enter Selling Price per kg: ");
                double price = scanner.nextDouble();
                scanner.nextLine();
                System.out.print("Enter Buyer Name: ");
                String buyer = scanner.nextLine();
                
                HarvestSales newSale = new HarvestSales(hId, cropIdRef, hDate, qty, price, buyer);
                harvestList.add(newSale);
                newSale.recordHarvest();
                break;
                
            case 6:
                System.out.println("\n--- Search & Reports ---");
                System.out.println("1. Search Farmer");
                System.out.println("2. Search Crop");
                System.out.print("Choose option (1-2): ");
                int searchChoice = scanner.nextInt();
                
                if (searchChoice == 1) {
                    System.out.print("Enter Farmer ID to search: ");
                    int searchId = scanner.nextInt();
                    Farmer foundF = searcher.searchFarmer(farmerList, searchId);
                    if (foundF != null) reporter.generateFarmerReport(foundF);
                    else System.out.println("Farmer not found.");
                } else if (searchChoice == 2) {
                    System.out.print("Enter Crop ID to search: ");
                    int searchId = scanner.nextInt();
                    Crop foundC = searcher.searchCrop(cropList, searchId);
                    if (foundC != null) reporter.generateCropReport(foundC);
                    else System.out.println("Crop not found.");
                } else {
                    System.out.println("Invalid search option.");
                }
                break;
                
            case 7:
                System.out.println("\n--- Data Analysis ---");
                analyzer.generateSummary(farmerList.size(), cropList.size(), farmList.size());
                analyzer.calculateTotalRevenue(harvestList);
                analyzer.identifyHighestYieldCrop(harvestList);
                analyzer.analyzeWaterConsumption(irrigationList);
                break;
                
            case 8:
               
                System.out.println("Exiting AgriSense. Goodbye!");
                return true;
                	
                
            default:
                System.out.println("Invalid choice. Enter 1-8.");
                
        }
        return false;
    }
}