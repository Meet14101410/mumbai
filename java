import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Represents a key city landmark
class Landmark {
    private String name;
    private String type;

    public Landmark(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {
        return "- " + name + " (" + type + ")";
    }
}

// Manages information about Mumbai
public class MumbaiInfoSystem {
    private Map<String, String> cityFacts;
    private List<Landmark> majorLandmarks;

    public MumbaiInfoSystem() {
        cityFacts = new HashMap<>();
        cityFacts.put("State", "Maharashtra");
        cityFacts.put("Roles", "Financial Hub, Major Port, Bollywood");
        cityFacts.put("Population_Millions", "12.5 (Municipal Corp. 2011)");
        cityFacts.put("Metro_Population_Millions", "20+ (MMR)");

        majorLandmarks = new ArrayList<>();
        majorLandmarks.add(new Landmark("Gateway of India", "Monument"));
        majorLandmarks.add(new Landmark("CSMT (Terminal)", "UNESCO World Heritage Site"));
        majorLandmarks.add(new Landmark("Marine Drive", "Promenade/Iconic Street"));
        majorLandmarks.add(new Landmark("Bandra–Worli Sea Link", "Bridge/Infrastructure"));
    }

    public void displayCityFacts() {
        System.out.println("=== 🇮🇳 Mumbai City Key Facts ===");
        System.out.println("State: " + cityFacts.get("State"));
        System.out.println("Primary Roles: " + cityFacts.get("Roles"));
        System.out.println("Population: " + cityFacts.get("Population_Millions") + " million");
    }

    public void listLandmarks() {
        System.out.println("\n--- Major Landmarks ---");
        for (Landmark landmark : majorLandmarks) {
            System.out.println(landmark.toString());
        }
        System.out.println("=========================");
    }

    public static void main(String[] args) {
        MumbaiInfoSystem infoSystem = new MumbaiInfoSystem();
        
        infoSystem.displayCityFacts();
        infoSystem.listLandmarks();
    }
}
