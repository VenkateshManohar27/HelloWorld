package com.vm;

public class QuickFind {
	private int[] id;

	public QuickFind(int numOfElems) {
		id = new int[numOfElems];
		for (int i = 0; i < numOfElems; i++) {
			id[i] = i;
		}
	}

	public boolean connected(int p, int q) {
		boolean connected = (id[p] == id[q]);

		if (connected) {
			System.out.println(p + " and " + q + " are connected");
		} else {
			System.out.println(p + " and " + q + " are not connected");
		}

		return connected;
	}
	/*Union operation is too expensive and has complexity of N^2 which is not efficient
	 * 
	 * 
	 */
	public void union(int p, int q) {
		int pid = id[p];
		int qid = id[q];
				
		for(int i = 0; i < id.length; i++){
			if(id[i] == pid){
				id[i] = qid;
			}
		}
	}

	public void printIdArray() {
		System.out.println("Contents of the array is :");

		for (int i = 0; i < id.length; i++) {
			System.out.print(id[i] + "| ");
		}
		System.out.println();
		System.out.println("*******************************************************************");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		QuickFind qf = new QuickFind(10);
		qf.printIdArray();
		qf.union(0, 5);
		
		qf.printIdArray();
		qf.union(1, 2);
		
		qf.printIdArray();
		qf.union(5, 6);
		
		qf.printIdArray();
		qf.union(3, 4);
		
		qf.printIdArray();
		qf.union(2, 8);
		
		qf.printIdArray();
		qf.union(7, 8);
		
		qf.printIdArray();
		qf.union(1, 9);
		
		qf.printIdArray();
		
		qf.connected(0, 5);

		qf.connected(5, 5);
		
		qf.connected(5, 9);
		
		qf.connected(1, 2);
		
		qf.connected(1, 3);
		
		qf.connected(3, 4);
		
		qf.connected(4, 5);
	}

}
