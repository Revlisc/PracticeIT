public class DiscountBill extends GroceryBill {
	
        private boolean preferred;
        private double discount;
        private int discounted;
        
        public DiscountBill(Employee clerk, boolean preferred) {
            super(clerk);
            this.preferred = preferred;
            double discount = 0.0;
            int discounted = 0;       
        }
        
        public int getDiscountCount() {
            return discounted;
        }
        
        public double getDiscountAmount() {
            return discount;
        }
        
        public double getDiscountPercent() {
            return discount * 100 / super.getTotal();
        }
        
        public void add(Item i) {
            super.add(i);
            if (preferred && i.getDiscount() > 0) {
                discounted++;
                discount += i.getDiscount();
            }
        }
        
        public double getTotal() {
            return super.getTotal() - discount;
        }
        
        public String toString() {
           return getTotal() + "" + discount + "" + discounted;
           
        }
    
    }