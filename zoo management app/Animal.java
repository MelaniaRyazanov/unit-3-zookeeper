public class Animal{

    // creat a private instance variable to store the animal type (e.g. "Tiger" or "Bear" or any other type of animal)
   private String animalType;
   private static int count;
    // create Static/class variable to track how many Animal objects have been created
   public static void main(String[] args){
      
   
   }
    // No-argument constructor:
  public Animal(){
   // - Creates a random animal type using the randomAnimalType() method you should write in this class
      animalType = randomAnimalType();
      count = 1;
   }
   // Write a constructor that takes an animal type parameter
   public Animal(String animalType){
      this.animalType = animalType;
   }
    // Create a getter/accessor method that returns the static variable that counts how many
    // animals have been instatiated
   public int getCount(){
      this.count = count; 
      return count;
   }
    // Create a getter/accessor method for returning the animal type
   public String getAnimalType(String animalType){
       return this.animalType;
   }
    // Create a getter/ accessor method for updating the animal type
   public void setAnimalType(String animalType){
      this.animalType = animalType;
   }
    // Create a speak() method that uses the animal type 
   
   public String speak(){
   // returns a sound based on the animal type. You can just return a String with the animal noise
      
   }
   
   // Create the speakBackward() method that calls speak() and returns the reversed String
 
  //**public String speakBackwards(){
   
  //**
  // }
    // Create the toString() method which returns friendly description of the animal
  
   public String toString(){
   String returnString = "";
   //add more
   return returnString;
   
   }
    // Create a static method called "randomAnimalType" that returns a random
    public static String randomAnimalType(){
    }
    // animale type
    // HINT: Decide how many animal types you want to be able to create, pick a random number
    // and then use if/else/if statements to determine what the animal should say
    }