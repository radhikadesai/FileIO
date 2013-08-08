import static org.junit.Assert.*;

import org.junit.Test;
import static org.mockito.Mockito.*;
import static org.mockito.BDDMockito.*;
import static org.mockito.Matchers.*;
import junit.framework.Assert;

public class RoomSecurityTest {

	@Test
	public void getIdFromThumbReader(){
		//Given
		int expectedIdFromThumbReader=2;
		RoomSecurity roomSecurity=new RoomSecurity();
		ThumbReader thumbReader=new ThumbReader();
		given(thumbReader.giveId()).willReturn(2);
		
		
		//When
		int actualIdFromThumbReader=roomSecurity.fetchId(thumbReader);
		
		//Then
		Assert.assertEquals(expectedIdFromThumbReader, actualIdFromThumbReader);
	}
	@Test
	public void 

}
