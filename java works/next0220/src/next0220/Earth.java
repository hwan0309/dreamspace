package next0220;
public class Earth {

	static final double EARTH_RADIUS = 6400;
	static final double EARTH_SURFACE_AREA;
	
	static {
		EARTH_SURFACE_AREA =  Math.PI / EARTH_RADIUS;
	}
public static void main(String[] args) {
	System.out.println("EARTH_RADIUS" + EARTH_RADIUS +"km");
	System.out.println("EARTH_SURFACE_AREA" + EARTH_SURFACE_AREA + "km^2");
}
}