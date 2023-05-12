package factories;

import buttons.Button;
import checkboxes.Checkbox;

//Fábrica abstracta
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
