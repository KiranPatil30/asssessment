package pkg_banking;

public class Main {
		public static void main(String[] args) {
			InterestCalculator interestCalculator  = new InterestCalculator() {
				public double simpleInterest(double principal ,double interestRate, int time) {
					return (principal * interestRate * time) / 100;
					
				}
			};

			double interest = interestCalculator.simpleInterest(10000, 8.1, 7);
			System.out.println("Simple Interest: " + interest);
			
			EmiCalculator emiCalculator = new EmiCalculator() {
				public double monthlyEMILoan(double principal , double interestRate , int month) {
					double monthlyRate = interestRate / 12 / 100;
					
					return (principal * monthlyRate * Math.pow(1 + monthlyRate, month)) / (Math.pow(1 + monthlyRate, month) - 1);
				}
			};
			double emi = emiCalculator.monthlyEMILoan(200000, 8, 24);
			System.out.println("Monthly EMI for a loan: " + emi);
			
			CurrencyConverter currencyConverter = new CurrencyConverter() {
				public double converterINRtoUSD(double amount) {
					double conversionRate  =  amount * 86.69;
					return amount / conversionRate ;
				}
			};
			
			double usd = currencyConverter.converterINRtoUSD(10);
		    System.out.println("INR 10 in USD: " + usd);
			
		}
}
