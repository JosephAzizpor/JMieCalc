package charts;

public enum ChartType {
	
	QextTimesRWl1("Qext times r�"), DQ1 ("DQ1"), DQ2 ("DQ2"), DQ3 ("DQ3"), DQField ("DQ1/DQ2"), QextTimesRWl2("Qext times r�"), QextTimesRWl3("Qext times r�");
	
	private String value;

	ChartType(String value) {
		this.value=value;
	}
	
	String getValue() {
		return this.value;
	}
}

