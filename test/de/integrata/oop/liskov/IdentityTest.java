package de.integrata.oop.liskov;

public class IdentityTest extends CrypterTest<IdentityCrypter> {
	
	@Override
	protected IdentityCrypter createCrypter() {
		return new IdentityCrypter();
	}
	

}
