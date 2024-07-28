package in.aj7parihar.lld218072024.lld2class4.abstractfactorydesignpattern;

import in.aj7parihar.lld218072024.lld2class4.abstractfactorydesignpattern.components.button.Button;
import in.aj7parihar.lld218072024.lld2class4.abstractfactorydesignpattern.components.dropdown.Dropdown;
import in.aj7parihar.lld218072024.lld2class4.abstractfactorydesignpattern.components.menu.Menu;

public class WindowsUIFactory implements UIFactory{

    @Override
    public Button createButton() {
        return null;
    }

    @Override
    public Dropdown createDropdown() {
        return null;
    }

    @Override
    public Menu createMenu() {
        return null;
    }
}
