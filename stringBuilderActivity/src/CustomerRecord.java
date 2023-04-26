import java.util.ArrayList;
public class CustomerRecord {
    static ArrayList<Customer>customer = new ArrayList<Customer>();
    //StringBuilder stringBuilder1 = new StringBuilder();

    public static void add(Customer cust ){

        customer.add(cust);
    }
    public String allcustomers() {
        StringBuilder stringBuilder1 = new StringBuilder();

        for (Customer customer : customer) {
            stringBuilder1.append(customer.getCustomerInfo());

            System.out.println();
        }
        return stringBuilder1.toString();



    }
}
