package in.aj7parihar.lld218072024.lld2class6.strategydesignpattern.factory;

import in.aj7parihar.lld218072024.lld2class6.strategydesignpattern.ModeTypes;
import in.aj7parihar.lld218072024.lld2class6.strategydesignpattern.strategy.BikePathCalculator;
import in.aj7parihar.lld218072024.lld2class6.strategydesignpattern.strategy.CarPathCalculator;
import in.aj7parihar.lld218072024.lld2class6.strategydesignpattern.strategy.PathCalculator;
import in.aj7parihar.lld218072024.lld2class6.strategydesignpattern.strategy.WalkPathCalculator;

public class PathCalculatorFactory {
    public static PathCalculator findModeType(ModeTypes modeTypes){
        if(modeTypes.equals(ModeTypes.CAR)){
            return new CarPathCalculator();
        }else if(modeTypes.equals(ModeTypes.BIKE)){
            return new BikePathCalculator();
        }else if(modeTypes.equals(ModeTypes.WALK)){
            return new WalkPathCalculator();
        }else{
            return null;
        }
    }
}
