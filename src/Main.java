public class Main {

    public static void main(String[] args) {
            User erhan = new User();
            erhan.setUserId(1);
            erhan.setUserName("ErwnReis");
            erhan.setFirstName("Erhan");
            erhan.setLastName("Göçen");
            erhan.setBirthday("10.08.2004");
            erhan.setNationalyId("11111111111");


            Game valorant = new Game();
            valorant.setGameId(1);
            valorant.setGameDeveloper("EREN" );
            valorant.setDetails("Fps game");
            valorant.setPrice(3);
            valorant.setPcPerformance("Min:2 gb ram ,Min:Screen Cart gtx1050");
            valorant.setRelaseDate("5.05.2021");
            valorant.setGameName("Valorant");



            UserService userService = new UserManager();
            userService.add(erhan);
            userService.add(new User(2,"ErwnReis","Eren","Birk","10.08.2004","11111111111"));

            GameService gameService = new GameManager();
                gameService.add(valorant);
                gameService.buy(valorant,erhan);
                System.out.println("--------------");
    }
}