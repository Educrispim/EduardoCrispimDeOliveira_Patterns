package abstract_factory;

public class Application {
    private Button button;
    private TextField textField;
    private Checkbox checkbox;

    public Application(UIComponentFactory factory) {
        button = factory.createButton();
        textField = factory.createTextField();
        checkbox = factory.createCheckbox();
    }

    public void render() {
        button.render();
        textField.render();
        checkbox.render();
    }
}
