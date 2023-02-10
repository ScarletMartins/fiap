package tipos;

public class Tipo {

	public static void main(String[] args) {
		
		System.out.println("Tipos de dados primitivos");
		System.out.println("_____________________________\n");
	
		byte minB = Byte.MIN_VALUE;
		byte maxB = Byte.MAX_VALUE;
		
		short minS = Short.MIN_VALUE;
		short maxS = Short.MAX_VALUE;
		
		int minI = Integer.MIN_VALUE;
		int maxI = Integer.MAX_VALUE;
		
		long minL = Long.MIN_VALUE;
		long maxL = Long.MAX_VALUE;
		
		float minF = Float.MIN_VALUE;
		float maxF = Float.MAX_VALUE;
		
		double minD = Double.MIN_VALUE;
		double maxD = Double.MAX_VALUE;

		System.out.println("Byte \nMinímo: " + minB + "\nMáximo: " + maxB);
		System.out.println("\nShort \nMinímo: " + minS + "\nMáximo: " + maxS);
		System.out.println("\nInt \nMinímo: " + minI + "\nMáximo: " + maxI);
		System.out.println("\nLong \nMinímo: " + minL + "\nMáximo: " + maxL);		
		
		System.out.println("\nFloat \nMinímo: " + minF + "\nMáximo: " + maxF);
		System.out.println("\nDouble \nMinímo: " + minD + "\nMáximo: " + maxD);

	}

}
