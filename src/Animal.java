public class Animal {

    int age;
    int weight;

    void sleep(){
        System.out.println("I'm sleeping");
    }

    boolean isOlder(Animal other){
        if (other.age > this.age)
            return false;
        else
            return true;
    }

    int howmuchshouldIeat(){
        return age + 2* weight;
    }

}
