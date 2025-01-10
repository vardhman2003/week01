class VolumeOfEarth7 {
	public static void main(String[] args) {

		// Radius of Earth
		int radius = 6378;

		// Value of Pi
		double pi = 3.14;

		// Volume of Earth in kilometer
		double volumeOfEarthKm = (4 / 3) * pi * radius * radius * radius;

		// Volume of Earth in miles
		double volumeOfEarthMiles = (4 / 3) * pi * radius * radius * radius * 1.6;

		// Printing volume of earth in kilometer and miles.
		System.out.println("The volume of earth in cubic kilometers is " + volumeOfEarthMiles + " and cubic miles is "
				+ volumeOfEarthKm + " km");
	}
}