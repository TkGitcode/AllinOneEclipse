package collections;

import java.util.Comparator;

 class CompareById implements Comparator<CompareOne> {

	@Override
	public int compare(CompareOne o1, CompareOne o2) {
		// TODO Auto-generated method stub
		return o1.id - o2.id;
	}

}
