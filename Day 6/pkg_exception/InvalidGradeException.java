package pkg_exception;

public class InvalidGradeException extends Exception {
		
		public InvalidGradeException(String grade) {
			super(grade);
		}
}
