package com.cryptography;

import com.cryptography.util.BytesToHex;
import java.security.SecureRandom;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class SymmetricExample {

  private static final String ALGO = "AES";
  private static final String CIPHER = "AES/CBC/PKCS5PADDING";

  public static void main(String[] args) {

    // generate a new key and initVrctor each time this runs. Real imple you would need to store the key and initvector as sec to later decrypt.
    SecureRandom sr = new SecureRandom();
    byte[] key = new byte[16];
    sr.nextBytes(key); // 128 bit key
    byte[] initVector = new byte[16];
    sr.nextBytes(initVector); // 16 bytes IV
    System.out.println("Random key = " + new BytesToHex().apply(key));
    System.out.println("initVector = " + new BytesToHex().apply(initVector));

    final String payload = "This is the plaintext from Daedalus memoirs.";
    System.out.println("Original text = " + payload);

//    encrypt()
  }

  public static String encrypt(byte[] key, byte[] initVector, String value) throws Exception {
    final IvParameterSpec ivParameterSpec = new IvParameterSpec(initVector);
    final SecretKeySpec secretKeySpec = new SecretKeySpec(key, ALGO);
    //@TODO: Fill in more here.
    return null;
  }
}
