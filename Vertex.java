public class Vertex {
  String name;
  double dist; //initialized as infinity

  public Vertex(){
    final double INFINITY = 1000000;
    dist = INFINITY;
  }

  public Vertex(String n){
    final double INFINITY = 1000000;
    dist = INFINITY;
    name = n; //name of the city
  }
}