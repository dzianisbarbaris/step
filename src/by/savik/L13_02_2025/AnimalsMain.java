package by.savik.L13_02_2025;

public class AnimalsMain {
    public static void main(String[] args) {

        Pet[] pets = new Pet[200];
        Owner[] owners = new Owner[100];
        for (Owner owner : owners) {
            owner = OwnerFactory.next();
            for (int i = 0; i < pets.length; i++) {
                owner.addPet(PetFactory.next());
            }
            System.out.println(owner);
        }
    }
}


        /*for (int i = 0; i < owners.length; i++) {
            for (int j = 0; j < pets.length; j++) {
              ;
            }
            }

        for (Owner owner : owners) {
            System.out.println(owner.toString());
        }*/


        /*Owner firstOwner = new Owner();
        Owner secondOwner = new Owner();
        Owner thirdOwner = new Owner();
        Pet cat = new Cat("Мурка", 2);
        Pet dog = new Dog("Барсик", 3);
        Pet bird = new Bird("Кеша", 1);
        Pet cat2 = new Cat("Блошка", 8);
        Pet dog2 = new Dog("Мухтар", 1);*/
        /*Pet[] pets = new Pet[]{cat, dog, bird, cat2};
        cat.setOwner(firstOwner);
        dog.setOwner(secondOwner);
        bird.setOwner(thirdOwner);
        cat2.setOwner(firstOwner);
        secondOwner.addPet(dog2);*/

        /*WildAnimal elephant = new Elephant("Джамбо", 10, "джунглях");
        WildAnimal lion = new Lion("Симба", 5, "саванне");

        for (Pet pet : pets) {
            System.out.println(pet.toString());
        }
        System.out.println();

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

        System.out.println("Общее количество животных " + Animal.getTotalAnimals());
        System.out.println("Общее количество владельцев " + Owner.getTotalOwners());
    }*/

