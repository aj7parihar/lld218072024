package in.aj7parihar.lld218072024.lld2class4.abstractfactorydesignpattern;

public class Flutter {
    private SupportedPlatforms platform;

    // Non-factory methods
    void refreshUI(){
        System.out.println("Refreshing UI");
    }

    void setTheme(){
        System.out.println("Setting theme to " + platform);
    }

    UIFactory getUIFactory(SupportedPlatforms platform){
        return UIFactoryFactory.getUIFactory(platform);
    }
}

