package in.aj7parihar.lld218072024.lld2class6.strategydesignpattern;

import in.aj7parihar.lld218072024.lld2class6.strategydesignpattern.factory.PathCalculatorFactory;
import in.aj7parihar.lld218072024.lld2class6.strategydesignpattern.strategy.PathCalculator;

public class Client {
    public static void main(String[] args) {
        demoStrategyDesignPattern();
    }
    public static void demoStrategyDesignPattern() {
        // So what Behavioral Design Pattern does is, it creates the class of all the different algorithms and then
        // use there objects interchangeably, in this case it is Strategy Design Pattern.
        // So if I want to decide at run time which strategy to choose from the options
        // I have the flexibility to do so and this is what we call "loose coupling".

        // Today I am choosing Bike based on the factors such as cost, weather, etc.
        // PathCalculator pathCalculator = new BikePathCalculator();

        // Let's say tomorrow I have to choose Car then
        // PathCalculator pathCalculator = new CarPathCalculator();

        // if I don't want to choose both of the strategies then I can choose from the options I have
        // PathCalculator pathCalculator = new WalkPathCalculator();


        // Another way of implementing the same logic by using factory method

        PathCalculator pathCalculator = PathCalculatorFactory.findModeType(ModeTypes.CAR);
        FindPath findPath = new FindPath(pathCalculator);
        String source = "Kashmir";
        String destination = "Kanyakumari";
        findPath.getPath(source, destination);
    }
}
