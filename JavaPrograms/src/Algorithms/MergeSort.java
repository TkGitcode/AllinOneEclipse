package Algorithms;


class MergeSortAlgorithm
{
	
	void merge(int leftindex , int midindex, int rightindex)
	{
		int leftarr[]=new int[leftindex];
		int rightarr[] =new int[rightindex];
	}
}
public class MergeSort {

	
	public static void main(String[] args) {
		MergeSortAlgorithm msa=new MergeSortAlgorithm();
		 int a[]= {48,16,53,4,1,52,10};
		 int mid= 0 + a.length/2;
		 msa.merge(0, mid, a.length);

	}

}
