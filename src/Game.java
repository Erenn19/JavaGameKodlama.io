public class Game {
    private int gameId;
    private int price;
    private String gameName;
    private String relaseDate;
    private String details;
    private String pcPerformance;
    private String gameDeveloper;
    public Game(int gameId, int price, String gameName, String relaseDate, String details, String pcPerformance, String gameDeveloper) {
        this.setGameId(gameId);
        this.setPrice(price);
        this.setGameName(gameName);
        this.setRelaseDate(relaseDate);
        this.setDetails(details);
        this.setPcPerformance(pcPerformance);
        this.setGameDeveloper(gameDeveloper);
    }
    public Game() {

    }

    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getRelaseDate() {
        return relaseDate;
    }

    public void setRelaseDate(String relaseDate) {
        this.relaseDate = relaseDate;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getPcPerformance() {
        return pcPerformance;
    }

    public void setPcPerformance(String pcPerformance) {
        this.pcPerformance = pcPerformance;
    }

    public String getGameDeveloper() {
        return gameDeveloper;
    }

    public void setGameDeveloper(String gameDeveloper) {
        this.gameDeveloper = gameDeveloper;
    }
}
