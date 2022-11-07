import java.util.Scanner;

public class Student {

    private String fullName, address;
    private int phoneNumber, bankAccount;

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setBankAccount(int bankAccount) {
        this.bankAccount = bankAccount;
    }

    public int getBankAccount() {
        return bankAccount;
    }

    public void liveIn(Apartment[] apartments, Student[] students) {
        int result = 0;
        for (Apartment a : apartments) {
            if (a.getAddress().equals(address))
                result = bankAccount / a.payPerMonth(students);
        }
        System.out.println("Live In : " + result);
    }

    public void changeInfo() {
        System.out.print("Enter a Full Name : ");
        this.fullName = new Scanner(System.in).nextLine();
        System.out.print("Enter an Address : ");
        this.address = new Scanner(System.in).nextLine();
        System.out.print("Enter a phone number : ");
        phoneNumber = new Scanner(System.in).nextInt();
        System.out.print("Enter a Bank Account : ");
        bankAccount = new Scanner(System.in).nextInt();
        System.out.println("The end");
    }
}
