package factories;

import buttons.Button;
import buttons.WindowsButton;
import checkboxes.Checkbox;
import checkboxes.WindowsCheckbox;

//Fábrica concreta (Windows)
public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {

        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {

        return new WindowsCheckbox();
    }
}
