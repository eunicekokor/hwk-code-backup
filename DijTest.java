import java.io.*;
import java.util.*;

public class DijTest{
  public static void main(String[] args){
    Scanner sc = null;
    ArrayList<Edge> cityArr = new ArrayList<Edge>();
    try{
      sc = new Scanner(new BufferedReader(new FileReader("citypairs.dat"))); //do NOT hardcode file name
      while(sc.hasNextLine()) {
        String line = sc.nextLine();
        String delims = "[ ]";
        String[] words = line.split(delims);
        double foo = Double.valueOf(words[2]);
        cityArr.add(new Edge(new Vertex(words[0]), new Vertex(words[1]), foo));
      }
    }

    catch(FileNotFoundException e) {
      e.printStackTrace();
    }

    System.out.println(cityArr.get(4).dist);


  }
}

/* Dijstra procedure:
Input Graph G = (V,E)
Edge lengths
Output = distance from s to u

H = makeheap(V)(dist values between verticies)
while H is not empty;
u = deletemin(H)
for all edges (u,v) in edges
if dist(v) > dist(u) + length (u, v)
  dist(v) = dist(u) + l(u, v)
  prev(v) = u
  decreasekey(H, v)

Time Complexity is O(|E|+|V|)log|V| 
 */