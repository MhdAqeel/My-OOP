public class TestDog {
    public static void main (String [] args){
        Dog mydog = new Dog();
        Dog pakkathUttuDog = new Dog();
        mydog.setName("kaluva");
        mydog.setAge(10);
        pakkathUttuDog.dog("naai",5);
        System.out.println("this is my fuckin dog "+mydog.getName()+" and he is "+mydog.getAge()+" year's old");
        System.out.println("this is my pakkathu uttu fuckin dog "+pakkathUttuDog.getName()+" and he is "+pakkathUttuDog.getAge()+" year's old");

    }
}
