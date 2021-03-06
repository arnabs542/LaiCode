package Practice.P18_ExceptionAndEnum;

public class TestScoreComparator {
	public static void main(String[] args) {
		Student s1 = new Student("abc", 100, 2, 3);
		Student s2 = new Student("cde", 2, 3, 4);
		ScoreComparator mathComp = ScoreComparator.valueOf("MathComparator");
		ScoreComparator engComp = ScoreComparator.valueOf("EnglishComparator");
		System.out.println(mathComp.compare(s1, s2));
		System.out.println(engComp.compare(s1, s2));
	}
}
