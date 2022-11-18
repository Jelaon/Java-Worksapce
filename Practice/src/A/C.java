package A;

public class C {
	private int lotto;
	
	{
		
		s();
		
			}
			
	public C() {
		information();
	}
	
	public void setLotto(int lotto) {
		this.lotto = lotto;
	}
	public int getLotto() {
		return lotto;
	}
	
	public void information() {
		System.out.println(lotto);
	}
	
	public void s() {
		int lotto [] = new int [6];
		for(int i =0; i< lotto.length; i++) {
			lotto[i] = (int)(Math.random()*100+1);
			for(int j=0; j < lotto.length; j++) {
				if(lotto[i] == lotto[j])
					s();
			}
		}
	}
}
