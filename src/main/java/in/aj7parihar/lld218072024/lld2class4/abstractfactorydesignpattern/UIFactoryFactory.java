package in.aj7parihar.lld218072024.lld2class4.abstractfactorydesignpattern;

public class UIFactoryFactory {
    public static UIFactory getUIFactory(SupportedPlatforms platform){
        if(platform.equals(SupportedPlatforms.ANDRIOD)){
            return new AndroidUIFactory();
        }else if(platform.equals(SupportedPlatforms.IOS)){
            return new IosUIFactory();
        }else if(platform.equals(SupportedPlatforms.WINDOWS)){
            return new WindowsUIFactory();
        }else{
            throw new RuntimeException("Unsupported platform " + platform);
        }
    }
}
