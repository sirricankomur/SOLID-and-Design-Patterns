public class WomenScoringAlgorithm extends ScoringAlgorithm {
    @Override
    public int calculateOverallScore(int score, int reduction) {
        return score - reduction;
    }

    @Override
    public int calculateReduction(int time) {
        return (int) time / 7;
    }

    @Override
    public int calculateBaseScore(int hits) {
        return hits * 120;
    }
}
