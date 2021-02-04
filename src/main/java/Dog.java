public class Dog extends Animal {
    static int count = 0;
    public Dog(String name) {
        this.name = name;
        count++;
    }

    @Override
    public void animalInfo() {
        System.out.println("Собаку зовут: " + name + "; ");
    }

    @Override
    public void run(int run) {
        if (run > 500){
            System.out.println("Собака не может пробежать больше 500 метров");
        }
        System.out.print(name + " пробежал " + run + " м; ");
    }

    @Override
    public void swim(int swim) {
        if (run > 100){
            System.out.println("Собака не может проплыть больше 10 метров");
        }
        System.out.println(name + " проплыл " + swim + " м; ");
    }


    public static void count() {
        System.out.println("Количество собак: " + count);
    }
}
