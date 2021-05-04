public class GameManager implements GameService {

    @Override
    public void add(Game game) {
            System.out.println(game.getGameName()+" Steam oyununu eklediniz");
            System.out.println("\n By mr."+game.getGameDeveloper());

    }
    public void buy(Game game,User user) {
        System.out.println(game.getGameName()+" Oyununu " + user.getUserName()+ " " +game.getPrice()+" Fiyatına satın aldınız.");
    }
}