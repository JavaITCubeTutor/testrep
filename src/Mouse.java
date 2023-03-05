public class Mouse {
  String name;
  String color;
  int bodyL;
  int tailL;
  int age;
  public void eatCheese(){
    System.out.println("Я " + name + " съел сыр");
  }
}
class Main{
  public static void main(String[] args) {
    Mouse jerry = new Mouse();
    jerry.name = "Jerry";
    jerry.eatCheese();
  }
}

