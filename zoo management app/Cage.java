public class Cage{
// Create a private instance variable of type Animal. Don't instantiate the variable, only declare it
   private Animal animal;
    // No-arg constructor:
    Cage(){
       // - Instantiates this cage with a random Animal.
       Animal animal = new Animal();
    // Hint: Animal() can choose a random type.
      
    }
    // Constructor with Animal parameter:
    Cage(Animal animal){
       // - Places that Animal into the cage.
      // - Use this.animal to avoid shadowing confusion.
      this.animal = animal;
    }
    
    // Write a Getter/Accessor for returning the Animal instance variable
   Animal getAnimal(){
      return this.animal;
    } 
   
    // Write a Setter/Mutator for editing the Animal instance variable
   void setAnimal(Animal animal){
   
   }
    public String toString(){
    // Friendly cage description including the animal.
      String returnString = "";
      returnString = "This is the " + animal + " cage.";
      return returnString;
  }
 
   
}