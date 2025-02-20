package by.savik.L10_02_2025;

// Спросить про геттеры у материнских/наследуемых классов //
public class AnimalsMain {
    public static void main(String[] args) {
        Pet cat = new Cat("Мурка", 2, "Анна");
        Pet dog = new Dog("Барсик", 3, "Олег");
        Pet bird = new Bird("Кеша", 1, " Саша");
        WildAnimal elephant = new Elephant("Джамбо", 10, "джунглях");
        WildAnimal lion = new Lion("Симба", 5, "саванне");

        Pet[] pets = {cat, dog, bird};
        for (Pet pet : pets) {
            System.out.println(pet);
            System.out.println(pet.makeSound());
            System.out.println(pet.move());
            System.out.println(pet.eat());
            System.out.println(pet.play());
            System.out.println();
        }

        WildAnimal[] animals = {elephant, lion};
        for (WildAnimal wildAnimal : animals) {
            System.out.println(wildAnimal);
            System.out.println(wildAnimal.makeSound());
            System.out.println(wildAnimal.move());
            System.out.println(wildAnimal.eat());
            System.out.println(wildAnimal.hunt());
            System.out.println();
        }
    }
}
