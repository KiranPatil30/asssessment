package pkg_generic_class;

public class AreaOfCircle<T extends Number> {

		private T radius;
		
		public void setRadius(T radius) {
			this.radius = radius;
		}
		
		public T get() {
			return radius;
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AreaOfCircle<Double> circleObj = new AreaOfCircle<Double>();
		circleObj.setRadius(2.0);
		
		Double area = Math.PI * circleObj.get() * circleObj.get();
		System.out.println("Aera of Circle: "+area );
		
	}

}
