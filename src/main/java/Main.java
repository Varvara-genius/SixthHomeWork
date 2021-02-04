public class Main {
    static int count = 0;
    public static void main(String[] args) {

        Cat cat = new Cat("Кот");
        cat.animalInfo();
        cat.run(135);
        cat.swim(0);
        Dog dog = new Dog("Пёс");
        dog.animalInfo();
        dog.run(450);
        dog.swim(9);
        Cat cat2 = new Cat("Мурзик");
        cat2.animalInfo();
        cat2.run(100);
        cat2.swim(0);
        Dog dog2 = new Dog("Бобик");
        dog2.animalInfo();
        dog2.run(300);
        dog2.swim(4);
        Cat cat3 = new Cat("Люцифер");
        cat3.animalInfo();
        cat3.run(200);
        cat3.swim(0);

        System.out.println("Количество всех животных: " + (cat.count + dog.count));
        cat.count();
        dog.count();
    }
}