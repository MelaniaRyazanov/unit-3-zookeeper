public class Animal{

    // creat a private instance variable to store the animal type (e.g. "Tiger" or "Bear" or any other type of animal)
   private String animalType;
   private int count;
   private String animalNoise;
    // create Static/class variable to track how many Animal objects have been created
   public static void main(String[] args){
      Animal animal1 = new Animal();
      Animal animal2 = new Animal();
      Animal animal3 = new Animal();
      Animal animal4 = new Animal();
      
      animal1.randomAnimalType("bear", 1, "growl");
      animal2.randomAnimalType("tiger", 1, "rah");
      animal3.randomAnimalType("giraffe", 1, "I dont know what a giraffe says");
      animal4.randomAnimalType("Pig", 1, "oink");
      
   
   
   }
    // No-argument constructor:
  public Animal(){
   // - Creates a random animal type using the randomAnimalType() method you should write in this class
      this.animalType = "bear";
      count = 1;
   }
   // Write a constructor that takes an animal type parameter
   public Animal(String animalType, int count, String animalNoise){
      this.animalType = animalType;
      this.count = count;
      this.animalNoise = animalNoise;
   }
    // Create a getter/accessor method that returns the static variable that counts how many
    // animals have been instatiated
   public int getCount(){
      this.count = count; 
      return count;
   }
    // Create a getter/accessor method for returning the animal type
   public String getAnimalType(){
       return this.animalType;
   }
    // Create a getter/ accessor method for updating the animal type
   public void setAnimalType(){
      this.animalType = animalType;
   }
    // Create a speak() method that uses the animal type 
   
  public String speak(){
     
   // returns a sound based on the animal type. You can just return a String with the animal noise
      return animalNoise;
   }
   
   // Create the speakBackward() method that calls speak() and returns the reversed String
 
 // public String speakBackwards(){
   
  
  //}
    // Create the toString() method which returns friendly description of the animal
  
   public String toString(){
   String returnString = "";
   returnString = this.animalType + " " + this.count + " " + this.animalNoise;
   return returnString;
   
   }
    // Create a static method called "randomAnimalType" that returns a random animal type
    public static String randomAnimalType(String animalType, double randomNumber, String animalNoise){
     randomNumber = Math.floor(Math.random() * 10);
     for(int i = 0; i < 2; i++){
      i++;
      randomNumber = i + randomNumber;
      System.out.println("Ammount of "+ animalType + "s" + ": " + randomNumber + ", which say " + animalNoise);
      
     }
      
      return animalType;
      
      
    } 
    
}  
    // HINT: Decide how many animal types you want to be able to create, pick a random number
    // and then use if/else/if statements to determine what the animal should say
    