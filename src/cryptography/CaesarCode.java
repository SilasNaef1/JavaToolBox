package cryptography;

import java.util.Arrays;

public class CaesarCode {
	public static char[] encrypt(int offset, char[] charArray) {
        char[] cryptArray = new char[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
        	int verschiebung = (charArray[i] + offset)%128;
            cryptArray[i] = (char) (verschiebung);
        }
        return cryptArray;
    }
	
    public static char[] decrypt(int offset, char[] charArray) {
        char[] cryptArray = new char[charArray.length];
        int verschiebung; 
        for (int i = 0; i < charArray.length; i++) {
        	if (charArray[i] - offset < 0)  {
        		verschiebung = charArray[i] - offset + 128;
        	} else  {
        		verschiebung = (charArray[i] - offset) % 128;
        	}
            cryptArray[i] = (char) (verschiebung);
        }
        return cryptArray;
    }
    //test
    public static boolean Test() {
    	char[] array1 = "DASISTEINTEXT".toCharArray();
    	char[] resultat1 = encrypt(7, array1);
    	char[] resultat2 = encrypt(4, array1);
    	char[] expectedresult1 = decrypt(7, resultat1);
    	char[] expectedresult2 = decrypt(4, resultat2);
    	
    	if(Arrays.equals(array1, expectedresult1)) {
    		if(Arrays.equals(array1, expectedresult2)) {
    			return true;
    		}
    		return false;
    	}
    	return false;
    }
}
