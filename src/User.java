public class User {
    private int userId;
    private String userName;
    private String firstName;
    private String lastName;
    private String birthday;
    private String nationalyId;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public User(int userId, String userName, String firstName, String lastName, String birthday, String nationalyId) {
        this.setUserId(userId);
        this.setUserName(userName);
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setBirthday(birthday);
        this.setNationalyId(nationalyId);
    }

    public User(){

    }

    public String getNationalyId() {
        return nationalyId;
    }

    public void setNationalyId(String nationalyId) {
        this.nationalyId = nationalyId;
    }

}