public class MinMaxAccount extends BankingAccount {
	
        private int min;
        private int max;
        
        public MinMaxAccount(Startup s) {
            super(s);
            min = s.startup_getBalance();
            max = s.startup_getBalance();
        }
        
        public void debit(Debit d) {
            super.debit(d);
            
            int balance = super.getBalance();
            
            if (balance < min) {
                min = balance;
            }
            if (balance > max) {
                max = balance;
            }
        }
        
        public void credit(Credit c) {
            super.credit(c);
            int balance = super.getBalance();
            
            if (balance < min) {
                min = balance;
            }
            if (balance > max) {
                max = balance;
            }
            
        }
        public int getMin() {
            return min;
        }
        
        public int getMax() {
            return max;
        }
    }