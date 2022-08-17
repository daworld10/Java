package executor;

public enum numb {

	Mamta(89,22),
	Reshma(78,22),
	Rani(88,22),
	Amit(90,22);
	
	int per;
	numb(int newval,int res)
	{
		per=newval;
	}
	
	public int get_res()
	{
		return per;
	}

}
