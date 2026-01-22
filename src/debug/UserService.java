package debug;

public class UserService {

    public static String getUser(int id) {
        String user = null;

        if (id == 1) {
            user = "Andrea";
        }

        return user.toUpperCase(); // 💥 NullPointerException
    }

    public static void main(String[] args) {
        System.out.println(getUser(2));
    }
}

