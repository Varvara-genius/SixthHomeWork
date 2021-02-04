public class Cat extends Animal {
    static int count = 0;
    public Cat(String name) {
        count ++;
        this.name = name;
    }

    @Override
    public void animalInfo() {
        System.out.println("Кота зовут: " + name + "; ");
    }

    @Override
    public void run(int run) {
        if (run > 200){
            System.out.println("Кот не может пробежать больше 200 метров");
        }
        System.out.print(name + " пробежал " + run + " м; " );
    }

    @Override
    public void swim(int swim) {
        System.out.println(name + " не умеет плавать" + "; ");
    }


    public static void count() {
        System.out.println("Количество котов: " + count);
    }
}
