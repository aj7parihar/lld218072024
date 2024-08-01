package in.aj7parihar.lld218072024.lld2class6.strategydesignpattern.strategy;

public class WalkPathCalculator implements PathCalculator {


    @Override
    public void findPath(String source, String destination) {
        System.out.println("Travelling from " + source + " to " + destination + " by Walk");
    }
}
