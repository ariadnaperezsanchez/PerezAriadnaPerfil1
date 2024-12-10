public class Perfil {
    private String name;
    private String foods;
    private String hobbies;
    private String funFacts;

    public Perfil(String name, String foods, String hobbies, String funFacts) {
        this.name = name;
        this.foods = foods;
        this.hobbies = hobbies;
        this.funFacts = funFacts;
    }

    public String getName() {
        return this.name;
    }

    public String getFoods() {
        return this.foods;
    }

    public String getHobbies() {
        return this.hobbies;
    }

    public String getFunFacts() {
        return this.funFacts;
    }

    public String toString() {
        return "Perfil{name='" + this.name + "', foods='" + this.foods + "', hobbies='" + this.hobbies + "', funFacts='" + this.funFacts + "'}";
    }
}