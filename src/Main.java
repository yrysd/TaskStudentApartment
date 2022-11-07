import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Apartment a1=new Apartment();
        a1.setTitle("Alan");
        a1.setAddress("Chuy");
        a1.setPrice(15000);

        Apartment a2=new Apartment();
        a2.setTitle("Nala");
        a2.setAddress("Kok jar");
        a2.setPrice(9000);


        Student s1=new Student();
        s1.setFullName("Nuriza Muratova");
        s1.setAddress("Chuy");
        s1.setPhoneNumber(111111);
        s1.setBankAccount(777777);

        Student s2=new Student();
        s2.setFullName("Eliza Ashyrbaeva");
        s2.setAddress("Kok jar");
        s2.setPhoneNumber(222222);
        s2.setBankAccount(555555);

        Student s3=new Student();
        s3.setFullName("Aigerim Bektenova");
        s3.setAddress("Kok jar");
        s3.setPhoneNumber(333333);
        s3.setBankAccount(888888);

        Student s4=new Student();
        s4.setFullName("Perizat Asanova");
        s4.setAddress("Chuy");
        s4.setPhoneNumber(444444);
        s4.setBankAccount(111111);

        Student s5=new Student();
        s5.setFullName("Aigerim Satova");
        s5.setAddress("Kok jar");
        s5.setPhoneNumber(555555);
        s5.setBankAccount(222222);

        Student s6=new Student();
        s6.setFullName("Asel Narynova");
        s6.setAddress("Chuy");
        s6.setPhoneNumber(666666);
        s6.setBankAccount(444444);


        Apartment [] apartments={a1, a2};
        Student[] students={s1, s2, s3, s4, s5, s6};

        while(true){
            System.out.print("1. Find Students by Address. 2. Pay Per Month. 3. Live in. 4.Change info. :: ");
            int input = new Scanner(System.in).nextInt();
            if(input==1){
                System.out.print("Enter Apartment Title : ");
                String inputTitle=new Scanner(System.in).nextLine();
                if(inputTitle.equals("Alan")){
                    findStudents("Chuy",students);
                }else if(inputTitle.equals("Nala")){
                    findStudents("Kok jar",students);
                }
            } if(input==2){
                System.out.println("Enter apartment number : ");
                int apartmentNumber = new Scanner(System.in).nextInt();
                if(apartmentNumber == 1) System.out.println(a1.payPerMonth(students));
                else if(apartmentNumber == 2) System.out.println(a2.payPerMonth(students));
            }if(input==3){
                System.out.println("Enter Full Name: ");
                String fullName=new Scanner(System.in).nextLine();
                for (Student student:students) {
                    if(student.getFullName().equals(fullName)) s1.liveIn(apartments,students); break;
                }
            }if(input==4){
                System.out.println("Enter full name: ");
                String fullname=new Scanner(System.in).nextLine();
                for (Student student:students) {
                    if(student.getFullName().equals(fullname)){
                        student.changeInfo();
                        break;
                    }

                }
            }
        }


    }
    public static void findStudents(String address ,Student[] students){
        for (Student student:students) {
            if(student.getAddress().equals(address)) {
                System.out.printf("""
                        Student full name: %s
                        Student address: %s
                        Student phone number: %d
                        Student bank account: %d
                        
                        
                        """, student.getFullName(), student.getAddress(), student.getPhoneNumber(), student.getBankAccount());
            }

        }
    }

}

