public class  Dog {
    private String name;
    private int age;
    
    public void dog(String name ,int age){
        this.name=name;
        this.age=age;
    }
    //setters
    public void setName(String name ){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }

    //getters
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
}