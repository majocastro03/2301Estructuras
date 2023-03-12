package client;

public class Usuario {
    int saldo;
    String user;
    String cont;

    public Usuario(String user, String cont) {
        this.user = user;
        this.cont = cont;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getUser() {
        return user;
    }

    public String getCont() {
        return cont;
    }
}
