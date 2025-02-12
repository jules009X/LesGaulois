package personnages;

public enum Grade {
	SOLDAT("soldat"), TESSERARIUS("tesserarius"), OPTIO("optio"), CENTURION("centurion");
	
	private String nomGrade;

	private Grade(String nomGrade) {
		this.nomGrade = nomGrade;
	}
	
	@Override
	public String toString() {
		return nomGrade;
	}
	
}
