import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Perfil ariadna = new Perfil("Ariadna", "\ud83c\udf55\ud83e\udd58\ud83e\udd6d", "✈️\ud83d\udecd️\ud83c\udfc4\u200d♀️", "Las \ud83e\udd93 no son blancas con rayas negras, sino negras con rayas blancas. Los \ud83d\udc19 tienen tres ♥️. La \ud83c\udf6f nunca se echa a perder.");
        new Perfil("Ariadna", "\ud83c\udf55\ud83e\udd58\ud83e\udd6d", "✈️\ud83d\udecd️\ud83c\udfc4\u200d♀️", "Las \ud83e\udd93 no son blancas con rayas negras, sino negras con rayas blancas. Los \ud83d\udc19 tienen tres ♥️. La \ud83c\udf6f nunca se echa a perder.");
        String name = ariadna.getName();
        String story = "Cada dia puedes empezar una nueva historia, cual quieres vivir hoy? \uD83D\uDC63\uD83E\uDDDA\u200D♀\uFE0F";
        String foods = ariadna.getFoods();
        String s = "\ud83c\udf55\ud83e\udd58\ud83e\udd6d";
        String h = "✈️\ud83d\udecd️\ud83c\udfc4\u200d♀️";
        String funFacts = "Las \ud83e\udd93 no son blancas con rayas negras, sino negras con rayas blancas. Los \ud83d\udc19 tienen tres ♥️. 1La \ud83c\udf6f nunca se echa a perder.";

        Scanner input = new Scanner(System.in);
        int menu = 0;

        do {
            System.out.println("About me..."+ name);
            System.out.println("[1] Story");
            System.out.println("[2] Favorites");
            System.out.println("[3] Fun Facts");
            System.out.println("[4] Salir");
            if (input.hasNextInt()) {
                menu = input.nextInt();
                input.nextLine();
                switch (menu) {
                    case 1:
                        System.out.println("Mostrando historia...");
                        System.out.println(story);

                        break;
                    case 2:
                        System.out.println("Mostrado hobbies y foods...");
                        System.out.println(h);
                        System.out.println(foods);
                        break;
                    case 3:
                        System.out.println("Mostrando fun facts");
                        System.out.println(funFacts);
                        break;
                    case 4:
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("Opción invalida");
                }
            } else {
                System.out.println("Opción invalida");
                input.nextLine();
            }
        } while(menu != 4);

    }
}