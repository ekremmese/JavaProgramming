package day44_Abstraction.animalTask;

public interface Playable {

      boolean isFriendly = true; //we have to initalize right away

      /*
      public static void method1(){
            System.out.println(isFriendly);
      }

       */

      void play();  //we don t need public and abstract keywords, it is given implicitly

}
