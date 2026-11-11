package abstract_factory;

public interface UIComponentFactory {
    Button createButton();
    TextField createTextField();
    Checkbox createCheckbox();
}
