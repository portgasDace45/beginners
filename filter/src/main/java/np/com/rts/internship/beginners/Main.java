package np.com.rts.internship.beginners;

import java.util.*;


public class Main {

  ArrayList<Animal> originalList = new ArrayList<Animal>() {{
    add(new Animal("herbivore", "lamb", 4));
    add(new Animal("herbivore", "cow", 4));
    add(new Animal("herbivore", "giraffe", 4));
    add(new Animal("carnivore", "lion", 4));
    add(new Animal("carnivore", "bear", 4));
    add(new Animal("carnivore", "leopard", 4));
    add(new Animal("carnivore", "panther", 4));
    add(new Animal("omnivore", "human", 2));
  }};

  ArrayList<Animal> herbivores = new ArrayList<>();
  ArrayList<Animal> carnivores = new ArrayList<>();
  ArrayList<Animal> omnivores = new ArrayList<>();

  public Main() {
    for(Animal x:originalList){
      if(x.getType()=="herbivore") {
        herbivores.add(x);
      }
      else if(x.getType()=="carnivore") {
        carnivores.add(x);
      }
      else{
        omnivores.add(x);
      }
    }


  }
  public static void main(String[] args) {
    new Main();
  }
}
