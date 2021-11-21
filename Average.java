class Average_of_any_range {

	public static void main(String[] args) {
		
		int sr=3;
		int er=8; double sum=0; int count=0;
		for(int i=sr; i<=er; i++)
		{
			sum=sum+i;
			count++;
		}
          double avg=sum/count;
          System.out.println(avg);
	}

}
