public class Edge {
  double dist;
  Vertex source; //source
  Vertex destination; //destination

  public Edge(Vertex v, Vertex w, double d){
    source = v;
    destination = w;
    dist = d;
  }
  public String print() {
    return (String.valueOf(dist));
  }

  public double dist(){
    return dist;
  }
}