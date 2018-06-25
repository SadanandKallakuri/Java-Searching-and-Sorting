package com.graph.adjadv;


public class betterGraph {
	public int vertexInit= -1;
	Vertex[] vertex;

	public betterGraph(int i) {
		// TODO Auto-generated constructor stub
		vertex=new Vertex[i];
	}
	class Node{
		public int vIndex;
		public Node next;
		public Node(int ind, Node nexNode) {
			this.vIndex=ind;
			this.next=nexNode;
		}
	}
	class Vertex{
		String vertexName;
		Node adjList;
		Vertex(String vname,Node nexnode) {
			this.vertexName=vname;
			this.adjList=nexnode;
		}	
	}
	
	public void addVertex(String string) {
		// TODO Auto-generated method stub
		vertexInit++;
		vertex[vertexInit]=new Vertex(string,null);
	}
	public void insertEdge(String srcVertex,String desVertex) {
		int v1Ind=getIndex(srcVertex);
		int v2Ind=getIndex(desVertex);
		vertex[v1Ind].adjList=new Node(v2Ind,vertex[v1Ind].adjList);
	}
	public int getIndex(String verName) {
		for(int v=0;v<vertex.length;v++) {
			if(vertex[v].vertexName==verName) {
				return v;
			}
		}
		return -1;
	}
	public void print() {
		for(int v=0;v<vertex.length;v++) {
			System.out.print(vertex[v].vertexName);
			for(Node aNode=vertex[v].adjList;aNode!=null;aNode=aNode.next) {
				System.out.print("--->"+vertex[aNode.vIndex].vertexName);
			}
			System.out.println();
		}
	}

}
