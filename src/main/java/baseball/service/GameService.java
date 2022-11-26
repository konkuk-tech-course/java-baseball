package baseball.service;

public class GameService {
    private static GameService instance = new GameService();

    private GameService() {}

    public static GameService getInstance() {
        return instance;
    }

    }


}
