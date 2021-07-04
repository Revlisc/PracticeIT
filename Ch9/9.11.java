public class FilteredAccount extends Account {
	private int zero;
    private int trans;
        
    public FilteredAccount(Client c) {
        super(c);
        zero = 0;
        trans = 0;  
    }
    
    public double percentFiltered() {
        if (trans == 0) {
            return 0.0;
        } else {
            return zero * 100.00 / trans;
        }
    }
    
    public boolean process(Transaction t) {
        trans++;
        if (t.value == 0) {
            zero++;
            return true;
        } else {
            return super.process(t);
        }
    }
}