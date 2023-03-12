package client;

public class User {
    private String name;
    private String identificacion;

    public User(String name, String identificacion) {
        this.name = name;
        this.identificacion = identificacion;
    }

    public String getName() {
        return name;
    }

    public String getContraseña() {
        return identificacion;
    }


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", identificacion=" + identificacion +
                '}';
    }
}
