package ru.mpei.LR2;


/**
 *  В данном классе задаем вид функиий расчета каждого из агентов
 */
public class Function {


	public double doCalculation(String name, double x) {

		double result = 0;

		switch (name) {
			case "first":
				result = (Math.exp(0.3 * x));
				break;
			case "second":
				result = (Math.pow(x, 2));
				break;
			case "third":
				result = Math.sin(x);
				break;
			default:
				break;
		}

		return result;
	}
}
