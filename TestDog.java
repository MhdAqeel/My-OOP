public class TestDog {
    public static void main (String [] args){
        Dog mydog = new Dog();
        mydog.setName("kaluva");
        mydog.setAge(10);

        System.out.println("this is my fuckin dog "+mydog.getName()+" and he is "+mydog.getAge()+" year's old");
    }
}
