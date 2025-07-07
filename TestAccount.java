public class TestAccount {
    public static void main (String [] args){
        Account cat = new Account("a001", "cat",1000);
        Account dog = new Account("a002", "dog", 0);
        cat.credit(500);
        cat.debit(100);
        cat.transfer(dog, 500);
        System.out.println(cat.toString());
        System.out.println(dog.toString());
    }
}
