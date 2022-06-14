package mockitoTest;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;


import org.junit.jupiter.api.Test;

//Travis ¿¬µ¿

class TriangleTestcase {

	Triangleservice service = mock(Triangleservice.class);
	Trianglearea test = new Trianglearea(service);
	
	@Test
	public void testGetLength() {
		when(service.getTotalLength(3, 4, 5)).thenReturn(12);
		assertEquals(24, test.getArea(3,4,5));
		verify(service).getTotalLength(3,4,5);

	
	}

}
