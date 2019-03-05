public class TennisGame {

    public static final String LOVE_ALL = "Love-All";
    public static final String FIFTEEN_ALL = "Fifteen-All";
    public static final String THIRTY_ALL = "Thirty-All";
    public static final String FORTY_ALL = "Forty-All";
    public static final String DEUCE = "Deuce";
    public static final String LOVE = "Love";
    public static final String FIFTEEN = "Fifteen";
    public static final String THIRTY = "Thirty";
    public static final String FORTY = "Forty";
    public static final String ADVANTAGE_PLAYER_1 = "Advantage player1";
    public static final String ADVANTAGE_PLAYER_2 = "Advantage player2";
    public static final String WIN_FOR_PLAYER_1 = "Win for player1";
    public static final String WIN_FOR_PLAYER_2 = "Win for player2";

    public static String getScore(String firstPlayer, String secondPlayer, int scoreOfFirstPlayer, int scoreOfSecondPlayer) {
        String score = "";
        int tempScore = 0;
        if (scoreOfFirstPlayer == scoreOfSecondPlayer) {
            score = getScoreOfFirstPlayer(scoreOfFirstPlayer);
        } else if (scoreOfFirstPlayer >= 4 || scoreOfSecondPlayer >= 4) {
            score = compareLargerOrEqual(scoreOfFirstPlayer, scoreOfSecondPlayer);
        } else {
            score = getRemainingCases(scoreOfFirstPlayer, scoreOfSecondPlayer, score);
        }
        return score;
    }

    public static String getRemainingCases(int scoreOfFirstPlayer, int scoreOfSecondPlayer, String score) {
        int tempScore;
        for (int i = 1; i < 3; i++) {
            if (i == 1) tempScore = scoreOfFirstPlayer;
            else {
                score += "-";
                tempScore = scoreOfSecondPlayer;
            }
            switch (tempScore) {
                case 0:
                    score += LOVE;
                    break;
                case 1:
                    score += FIFTEEN;
                    break;
                case 2:
                    score += THIRTY;
                    break;
                case 3:
                    score += FORTY;
                    break;
            }
        }
        return score;
    }

    public static String getScoreOfFirstPlayer(int scoreOfFirstPlayer) {
        String score;
        switch (scoreOfFirstPlayer) {
            case 0:
                score = LOVE_ALL;
                break;
            case 1:
                score = FIFTEEN_ALL;
                break;
            case 2:
                score = THIRTY_ALL;
                break;
            case 3:
                score = FORTY_ALL;
                break;
            default:
                score = DEUCE;
                break;

        }
        return score;
    }

    private static String compareLargerOrEqual(int scoreOfFirstPlayer, int scoreOfSecondPlayer) {
        String score;
        int minusResult = scoreOfFirstPlayer - scoreOfSecondPlayer;
        if (minusResult == 1) score = ADVANTAGE_PLAYER_1;
        else if (minusResult == -1) score = ADVANTAGE_PLAYER_2;
        else if (minusResult >= 2) score = WIN_FOR_PLAYER_1;
        else score = WIN_FOR_PLAYER_2;
        return score;
    }
}
