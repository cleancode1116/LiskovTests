package de.integrata.oop.liskov;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class IdentityTest extends CrypterTest<IdentityCrypter> {
	
	@Override
	protected IdentityCrypter createCrypter() {
		return new IdentityCrypter();
	}
	
	@Test
	public void cryptReturnsSameValue() {
		assertThat(crypter.crypt("Hallo"), is(equalTo("Hallo")));
	}
	
	@Test
	public void decryptReturnsSameValue() {
		assertThat(crypter.decrypt("Hallo"), is(equalTo("Hallo")));
	}
}
