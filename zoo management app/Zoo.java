public class Zoo {
   Cage cageA;
   Cage cageB;
   Cage cageC;
   
  public Zoo() {
   // 1) No-arg constructor:
    //    - instantiate all 3 cages
    Cage cageA = new Cage();
    Cage cageB = new Cage();
    Cage cageC = new Cage();
    //    - each cage should start with a random Animal
    //    Hint: Cage() can create a random Animal by calling new Animal()
   
    }

    // 2) Overloaded constructor:
    //    - takes 3 Animal parameters and places them into the 3 cages
    //    - must demonstrate constructor overloading and use "this." at least once
    public Zoo(Animal a1, Animal a2, Animal a3) {
     
    }

    // howManyAnimals():
    // Returns the number of Animal objects that have been created so far.
    // Hint: use a static/class variable (and likely a static accessor) in Animal.
    public int howManyAnimals() {
    
    }

    // putAnimalInCage(Cage cage, Animal animal):
    // - If the Cage passed in is one of THIS Zoo's cages, replace the Animal inside it and return true.
    // - If the Cage does NOT belong to this Zoo, do nothing and return false.
    // Note: do NOT create any new cages here.
    public boolean putAnimalInCage(Cage cage, Animal animal) {

    }


    // toString():
    // Return a multi-line description of the Zoo including each cage (and the animal inside).

}