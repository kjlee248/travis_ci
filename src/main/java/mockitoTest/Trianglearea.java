package mockitoTest;


public class Trianglearea {
	
	Triangleservice service;
	
	public Trianglearea(Triangleservice service) {
		this.service = service;
	}
	
	public int getArea(int a, int b,int c) {
		return service.getTotalLength(a, b, c)*2;


	}
}
