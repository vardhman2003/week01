class CalculatePen5 {
	public static void main(String[] args) {

		// We have number of pen and student number.
		int pens = 14, students = 3;

		// Calculating distributed pen
		int distributedPen = pens / students;

		// Calculating remaining pens
		int remainingPen = pens % students;

		// Printing pen per student and remaining pen
		System.out.println("The Pen Per Student is " + distributedPen + " and the remaining pen not distributed is "
				+ remainingPen);
	}
}