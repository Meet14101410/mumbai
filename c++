#include <iostream>
#include <string>
#include <unordered_map>
#include <vector>

// Represents a key landmark
struct Landmark {
    std::string name;
    std::string type;
};

// Manages information about Mumbai
class MumbaiInfoSystem {
private:
    std::unordered_map<std::string, std::string> city_facts;
    std::vector<Landmark> major_landmarks;

public:
    MumbaiInfoSystem() {
        city_facts["State"] = "Maharashtra";
        city_facts["Roles"] = "Financial Hub, Major Port, Bollywood";
        city_facts["Population_Millions"] = "12.5 (Municipal Corp. 2011)";
        city_facts["Metro_Population_Millions"] = "20+ (MMR)";

        major_landmarks.push_back({"Gateway of India", "Monument"});
        major_landmarks.push_back({"CSMT (Terminal)", "UNESCO World Heritage Site"});
        major_landmarks.push_back({"Marine Drive", "Promenade/Iconic Street"});
        major_landmarks.push_back({"Bandra–Worli Sea Link", "Bridge/Infrastructure"});
    }

    void display_city_facts() const {
        std::cout << "=== 🇮🇳 Mumbai City Key Facts ===" << std::endl;
        std::cout << "State: " << city_facts.at("State") << std::endl;
        std::cout << "Primary Roles: " << city_facts.at("Roles") << std::endl;
        std::cout << "Population: " << city_facts.at("Population_Millions") << " million" << std::endl;
    }
    
    void list_landmarks() const {
        std::cout << "\n--- Major Landmarks ---" << std::endl;
        for (const auto& landmark : major_landmarks) {
            std::cout << "- " << landmark.name << " (" << landmark.type << ")" << std::endl;
        }
        std::cout << "=========================" << std::endl;
    }
};

int main() {
    MumbaiInfoSystem info_system;
    
    info_system.display_city_facts();
    info_system.list_landmarks();

    return 0;
}
