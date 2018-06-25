package com.graph.adjadv;


public class Demo {

	public static void main(String[] args) {
		betterGraph myGraph=new betterGraph(5);
		myGraph.addVertex("Elm"); 
		myGraph.addVertex("State");
        myGraph.addVertex("Avenel");
        myGraph.addVertex("Pocono");
        myGraph.addVertex("William");
         
        myGraph.insertEdge("Avenel", "Pocono");
        myGraph.insertEdge("State", "Elm");
        myGraph.insertEdge("Elm", "Avenel");
        myGraph.insertEdge("Elm", "William");
        myGraph.insertEdge("William", "State");
        myGraph.insertEdge("William", "Pocono");
        myGraph.insertEdge("Pocono", "Elm");
        myGraph.insertEdge("State", "Avenel");
        
        myGraph.print();
	}
}
