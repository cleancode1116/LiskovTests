package de.integrata.oop.liskov;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Before;
import org.junit.Test;

public abstract class CrypterTest<T extends Crypter>  {

	protected T crypter;
	
	@Before
	public void setUp() throws Exception {
		crypter = createCrypter();
	}

	protected abstract T createCrypter();

	@Test
	public void testCryptDecryptIsEqual() {
		String input = "Hallo";
		String decrypted = crypter.decrypt(crypter.crypt(input));
		
		assertThat(decrypted, is(equalTo(input)));
	}

}
