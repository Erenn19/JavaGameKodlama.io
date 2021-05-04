public class EdevletValidation {
   public static boolean isValid(String nationalyId) {
       if (nationalyId.length() == 11) {
             return true;
       }
             return  false;
   }
}
