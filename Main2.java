import java.util.Scanner;



class Main2{
    public static void main(String... args){
      try(Scanner scanner = new Scanner(System.in)){
        String line = scanner.nextLine();
        System.out.println("line="+line);
      }      
    }
}