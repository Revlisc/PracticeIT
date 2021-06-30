public class Marketer extends Employee {
	
        public Marketer() {
           super(); 
        }   
        
        public double getSalary() {
            return super.getSalary() + 10000;
        } 
        
        public void advertise() {
            System.out.print("Act now, while supplies last!");
        }    
    }