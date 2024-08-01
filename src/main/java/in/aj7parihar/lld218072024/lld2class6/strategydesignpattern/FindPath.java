package in.aj7parihar.lld218072024.lld2class6.strategydesignpattern;

import in.aj7parihar.lld218072024.lld2class6.strategydesignpattern.strategy.PathCalculator;

public class FindPath {
    private PathCalculator pathCalculator;

    public FindPath(PathCalculator pathCalculator) {
        this.pathCalculator = pathCalculator;
    }


//    public PathCalculator getPathCalculator() {
//        return pathCalculator;
//    }
//
//    public void setPathCalculator(PathCalculator pathCalculator) {
//        this.pathCalculator = pathCalculator;
//    }

    public void getPath(String source, String destination) {
        pathCalculator.findPath(source, destination);
    }
}
