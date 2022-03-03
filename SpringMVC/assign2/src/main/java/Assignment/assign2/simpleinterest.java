package Assignment.assign2;

class simpleinterest
{
	public int principal;
	public int rate;
	public int time;
	public int getPrincipal() {
		return principal;
	}
	public void setPrincipal(int principal) {
		this.principal = principal;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public double Interest()
	{
		return ((principal*rate*time)/100);
	}
		

}