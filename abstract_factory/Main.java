package abstract_factory;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Tema Claro ===");
        UIComponentFactory lightFactory = new LightThemeFactory();
        Application lightApp = new Application(lightFactory);
        lightApp.render();

        System.out.println();
        System.out.println("=== Tema Escuro ===");
        UIComponentFactory darkFactory = new DarkThemeFactory();
        Application darkApp = new Application(darkFactory);
        darkApp.render();
    }
}
