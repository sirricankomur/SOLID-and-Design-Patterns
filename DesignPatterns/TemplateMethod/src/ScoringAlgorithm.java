public abstract class ScoringAlgorithm {

    public int generateScore(int hits, int time) {
        int score = calculateBaseScore(hits);
        int reduction = calculateReduction(time);
        return calculateOverallScore(score, reduction);
    }

    public abstract int calculateOverallScore(int score, int reduction);

    public abstract int calculateReduction(int time);

    public abstract int calculateBaseScore(int hits);
}
