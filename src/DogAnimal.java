class Animal{
    String name;
    String kind;
    public void bark(){
        System.out.println(name + "가 짖는다");
    }
}
class Dog extends Animal{
    Dog(String name,String kind){
        this.name = name;
        this.kind = kind;
    }
    @Override
    public void bark() {
        System.out.println("월월");
    }
}
public class DogAnimal {
    public static void main(String[] args) {
        Animal dog = new Dog("코코", "강아지");
        dog.bark();
    }
}

git add oop/DogAnimal.java README.md



