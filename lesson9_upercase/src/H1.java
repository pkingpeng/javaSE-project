import com.pqr.lesson8.homework.Dog;
import com.pqr.lesson8.homework.Human;

public class H1 {
    public static void main(String[] args){
        Human human = new Human("张三");
        human.walk();

        Dog dog = new Dog("大黄");
        dog.bite(human);
        human.attack(dog);
        dog.run();

    }
}
