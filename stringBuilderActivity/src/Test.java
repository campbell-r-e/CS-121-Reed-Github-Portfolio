// Activity 36
// created by Campbell Reed
//

public class Test {
    public static void main(String[] args) {
        CustomerRecord e = new CustomerRecord();
        e.add(new Customer("Campbell","reed","7658934589","nobody@gmail.com","Azs4567",20));
        System.out.println(e.allcustomers());
    }
}
