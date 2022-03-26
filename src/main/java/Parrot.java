public class Parrot extends Bird{
    public Parrot(String name, String color){
        super(name,color);
    }

    @Override
    public void speak(){
        System.out.println("Help!!!! I am " + name + ", they've turned me into a " + color + " parrot");
    }

    @Override
    public void fly() {
        super.fly();
    }

}
