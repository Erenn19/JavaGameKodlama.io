public class UserManager implements UserService {
   public void add(User user) {
        if(EdevletValidation.isValid(user.getNationalyId())){
            System.out.println(user.getFirstName() + " Eklendiniz");
        }else{
            System.out.println("Eklenmedin : Kontrolden geçemedin" );
        }

    }
    public void uptade(User user) {

        if(EdevletValidation.isValid(user.getNationalyId())){
            System.out.println(user.getFirstName() + " Güncellendin");
        }else{
            System.out.println("Eklenmedin : Kontorlden geçemedin" );
        }
    }
    public void delete(User user) {
        System.out.println(user.getFirstName() + "Silindiniz");
    }

}
