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

