
public class newMath implements interfaceMath {

	public double mod(double x, double y) {
		if (y > x) {
			return 0;
		} else {
			int i = (int) (x / y);
			double d = (x / y) - i;
			return d * y;
		}
	}

	public double pow(double x, int y) {
		double tempVal = x;
		if (y == 0)
			return 1;
		else {
			for (int i = 0; i < y - 1; i++)
				x *= tempVal;
			return x;
		}
	}

	public double div(double x, double y) {

		return x / y;
	}

	public double mult(double x, double y) {

		return x * y;
	}

	public double negafy(double x) {

		if (x > 0)
			return x * -1;
		else
			return x;
	}

	public double tripMult(double x, double y, double z) {
		return x * y * z;
	}
	public double doubleDiv(double x, double y) {

		return (x / y)/y;
	}
}
