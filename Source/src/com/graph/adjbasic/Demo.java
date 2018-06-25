package com.graph.adjbasic;

public class Demo {

	public static void main(String[] args) {
		Graph myGraph=new Graph(5);
		myGraph.addEdge(1, 2);
		myGraph.addEdge(1, 3);
		myGraph.addEdge(1, 5);
		myGraph.addEdge(2, 4);
		myGraph.addEdge(2, 1);
		myGraph.addEdge(3, 2);
		myGraph.addEdge(4, 1);
		myGraph.addEdge(4, 2);
		
		Object [] values = myGraph.adj(1);
		for(Object val : values){
			System.out.println(val);
		}

		
	}

}
