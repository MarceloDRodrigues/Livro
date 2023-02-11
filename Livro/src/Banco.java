import java.util.Scanner;

public class Banco {

    private String name;
    private float agency;
    private int number;
    private float balance;
    private String passwd;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public float getAgency() {
        return agency;
    }

    public void setAgency(float agency) {
        this.agency = agency;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public Banco(String name, int number, float agency, float balance, String passwd) {
        this.name = name;
        this.number = number;
        this.agency = agency;
        this.balance = balance;
        this.passwd = passwd;
    }

    public void passCheck() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please, write you password: ");
        String passConfirm = scanner.next();
        scanner.close();

        if (!passConfirm.equals(this.passwd)) {
            throw new Exception("Incorrect password!!!");
        }

    }

    public void show() {
        passCheck();
        System.out.println(this.getName() + this.getNumber() + this.getAgency() + this.getBalance());
    }

    public void transfer(Banco accountDestiny, float value) {
        this.balance -= value;
        accountDestiny.balance += value;
    }

    public void checkOut(float value) {
        this.balance -= value;
    }

    public void deposit(float value) {
        this.balance += value;
    }

}
