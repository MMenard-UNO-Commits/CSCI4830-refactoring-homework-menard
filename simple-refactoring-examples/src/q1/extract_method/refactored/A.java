package q1.extract_method.refactored;

import java.util.List;

public class A {
   Node m1(List<Node> nodes, String p) {
      searchList(nodes, p);
      // other implementation
      return null;
   }

   Edge m2(List<Edge> edgeList, String p) {
      searchList(edgeList, p);
      // other implementation
      return null;
   }
   
   /**
    * extracted method for searching a list of things that extend Graph for a string. Prints out all
    * objects that represent the thing that is being searcehd for.
    * @param <T> the type of thing that the list contains
    * @param objs the list of things to be searched
    * @param p the string to search for
    */
   <T extends Graph> void searchList(List<T> objs, String p) {
	   for(T obj : objs) {
		   if(obj.contains(p))
			   System.out.println(obj);
	   }
   }
}

class Graph {
	String name;

	public boolean contains(String p) {
	   return name.contains(p);
	}
}

class Node extends Graph {
 
}

class Edge extends Graph {
	
}