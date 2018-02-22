

public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] c=  {1,-1,2,-2,3,-3,4,-4,5,-5};
		System.out.println(PartitionAroundN(c,0,c.length,0));
	}



static int[] PartitionAroundN(int[] a,int lo,int hi,int n){
		int j = 0,i,temp;
		for (i = lo; i <= hi; i++) {
			if (a[i]<n) {
				//swap(a[i],a[j]);
				temp = a[i];
				a[i]=a[j];
				a[j]=temp;
				j++;
			}
		}
		return a;
	}
