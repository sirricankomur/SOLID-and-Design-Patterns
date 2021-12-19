public class Main {

    public static void main(String[] args) {
        ScoringAlgorithm scoringAlgorithm;

        System.out.println("Men");
        scoringAlgorithm = new MenScoringAlgorithm();
        System.out.println(scoringAlgorithm.generateScore(10, 20));

        System.out.println("Women");
        scoringAlgorithm = new WomenScoringAlgorithm();
        System.out.println(scoringAlgorithm.generateScore(10, 20));

        System.out.println("Children");
        scoringAlgorithm = new ChildrenScoringAlgorithm();
        System.out.println(scoringAlgorithm.generateScore(10, 20));
    }
}
