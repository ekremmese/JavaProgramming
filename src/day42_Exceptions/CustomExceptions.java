package day42_Exceptions;

class FadyException extends RuntimeException{

    public FadyException(String message){
       super(message);
    }

    public FadyException(){
        super("Time for short break");
    }

}

public class CustomExceptions  {

    public static void main(String[] args) {

        //throw  new FadyException();
        throw  new FadyException("It is time for short break");

    }


}
