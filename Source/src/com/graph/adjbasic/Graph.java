package com.graph.adjbasic;
import java.util.ArrayList;


public class Graph {
	public int nVertex=0;
	public int nEdge=0;
	public ArrayList[] adjacent;
	
	
	public Graph(int nVertex) {
		this.nVertex=nVertex;
		this.nEdge=0;
		adjacent= new ArrayList[nVertex];
		for(int i=0;i<nVertex;i++) {
			adjacent[i]=new ArrayList<Object>();	
		}	
	}
	
	public void addEdge(int src,int des) {
		adjacent[src].add(des);
		nEdge++;
		}
	
	
	public Object[] adj(int src) {
		return adjacent[src].toArray();
	}
}

