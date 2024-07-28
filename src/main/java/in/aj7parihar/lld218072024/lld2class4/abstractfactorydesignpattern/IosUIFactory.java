package in.aj7parihar.lld218072024.lld2class4.abstractfactorydesignpattern;

import in.aj7parihar.lld218072024.lld2class4.abstractfactorydesignpattern.components.button.Button;
import in.aj7parihar.lld218072024.lld2class4.abstractfactorydesignpattern.components.button.IOSButton;
import in.aj7parihar.lld218072024.lld2class4.abstractfactorydesignpattern.components.dropdown.Dropdown;
import in.aj7parihar.lld218072024.lld2class4.abstractfactorydesignpattern.components.dropdown.IosDropdown;
import in.aj7parihar.lld218072024.lld2class4.abstractfactorydesignpattern.components.menu.Menu;

public class IosUIFactory implements UIFactory {

    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public Dropdown createDropdown() {
        return new IosDropdown();
    }

    @Override
    public Menu createMenu() {
        return null;
    }
}
