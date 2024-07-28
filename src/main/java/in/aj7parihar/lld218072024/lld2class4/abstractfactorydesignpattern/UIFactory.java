package in.aj7parihar.lld218072024.lld2class4.abstractfactorydesignpattern;

import in.aj7parihar.lld218072024.lld2class4.abstractfactorydesignpattern.components.button.Button;
import in.aj7parihar.lld218072024.lld2class4.abstractfactorydesignpattern.components.dropdown.Dropdown;
import in.aj7parihar.lld218072024.lld2class4.abstractfactorydesignpattern.components.menu.Menu;

public interface UIFactory {
    Button createButton();
    Dropdown createDropdown();
    Menu createMenu();
}
