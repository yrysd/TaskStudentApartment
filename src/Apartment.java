public class Apartment {

    private String title, address;
    private int price;

    public void setTitle(String title){
        this.title=title;
    }public String getTitle(){
        return title;
    }public void setAddress(String address){
        this.address=address;
    }public String getAddress(){
        return address;
    }public void setPrice(int price){
        this.price=price;
    }public int getPrice(){
        return price;
    }

    public int payPerMonth(Student[] students){
        int counter=0;
        for (Student student:students) {
            if(student.getAddress().equals(getAddress())) counter++;
        } return getPrice()/counter;
    }


}
