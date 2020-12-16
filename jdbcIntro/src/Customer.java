public class Customer {
    private int id;
    private String name;
    private String surname;
    private String city;

    public Customer(int id, String name, String surname, String city){
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.city = city;
    }

    public void getCustomer (){
        System.out.println (id + " - " +name + "\t- " +surname+"\t- "+city );
    }
}
