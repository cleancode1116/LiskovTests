package de.integrata.oop.liskov;

import org.junit.Ignore;
import org.junit.Test;

public class UpperCaseCrypterTest extends CrypterTest<UpperCaseCrypter> {
	
	@Override
	protected UpperCaseCrypter createCrypter() {
		return new UpperCaseCrypter();
	}

	@Test
	@Ignore("Non Liskov")
	public void testCryptDecryptIsEqual() {
	}
	
}
