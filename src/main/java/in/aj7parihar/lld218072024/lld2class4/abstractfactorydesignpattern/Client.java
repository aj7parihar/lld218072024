package in.aj7parihar.lld218072024.lld2class4.abstractfactorydesignpattern;

import in.aj7parihar.lld218072024.lld2class4.abstractfactorydesignpattern.components.button.Button;
import in.aj7parihar.lld218072024.lld2class4.abstractfactorydesignpattern.components.dropdown.Dropdown;

public class Client {
    public static void main(String[] args) {
        demoFactory();
    }
    private static void demoFactory() {
        Flutter flutter = new Flutter();

        // In the arguments where we pass "platform" type, instead of creating the same code for Android,
        // Windows, etc., we can just change the name in one code itself.

        // Also instead of hardcoding the platform name, which might also cause the typo or other errors
        // we will create an 'enum' class to hardcode the 'platform types' there and use it here.


        UIFactory iosUiFactory = flutter.getUIFactory(SupportedPlatforms.IOS);
        Button iosButton = iosUiFactory.createButton();
        iosButton.clickButton();

        UIFactory iosUIFactory2 = flutter.getUIFactory(SupportedPlatforms.IOS);
        Dropdown iosDropdown = iosUIFactory2.createDropdown();
        iosDropdown.showDropdown();

        UIFactory androidUiFactory = flutter.getUIFactory(SupportedPlatforms.ANDRIOD);
        Button androidButton = androidUiFactory.createButton();
        androidButton.clickButton();

        UIFactory androidUIFactory2 = flutter.getUIFactory(SupportedPlatforms.ANDRIOD);
        Dropdown androidDropdown = androidUIFactory2.createDropdown();
        androidDropdown.showDropdown();


        UIFactory windowsUiFactory = flutter.getUIFactory(SupportedPlatforms.WINDOWS);
        Button windowsButton = windowsUiFactory.createButton();
        System.out.println(windowsButton);
    }
}
