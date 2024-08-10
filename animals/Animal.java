package animals;

public class Animal{
    String name;
    static int count = 0;

    public Animal(){}

    public Animal (String name){
        this.name = name;
        count++;
    }
    public void run(int distance){
        System.out.println(this.name + " пробежал " + distance + "м");
    }
    public void swim(int distance){
        System.out.println(this.name + " проплыл " + distance + "м"  );
    }

}
