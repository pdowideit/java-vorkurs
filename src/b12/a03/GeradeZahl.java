package b12.a03;

public class GeradeZahl {
	private int val;
	
	public GeradeZahl(int val) {
		val = val % 2 == 1 ? val - 1 : val;
		this.val = val;
	}

	public GeradeZahl(GeradeZahl gz) {
		this(gz.getVal());
	}
	
	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		val = val % 2 == 1 ? val - 1 : val;
		this.val = val;
	}

	@Override
	public String toString() {
		return "GeradeZahl [val=" + val + "]";
	}
	
	public GeradeZahl getNachfolger() {
		return new GeradeZahl(this.val + 2);
	}
	
	public GeradeZahl getSum(GeradeZahl g) {
		return new GeradeZahl(val + g.val);
	}
	
	public GeradeZahl getProd(GeradeZahl g) {
		return new GeradeZahl(val * g.val);
	}

}
