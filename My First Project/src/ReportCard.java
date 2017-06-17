
public class ReportCard {
	public char convertGrades(int testResult){
		char grade;
		if(testResult>=90){
			grade='A';
		}
		else if(testResult>=80&&testResult<90){
			grade='B';
		}
		else if(testResult>=70&&testResult<80){
			grade='C';
		}
		else{
			grade='D';
		}
		return grade;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReportCard rc=new ReportCard();
		char yourGrade=rc.convertGrades(88);
		System.out.println("Your first grade "+yourGrade);
		yourGrade=rc.convertGrades(79);
		System.out.println("Your second grade "+yourGrade);
		switch (yourGrade){
		 case 'A':
		 System.out.println("Accellent work!");
		 break;
		 case 'B':
		 System.out.println("Good work!");
		 break;
		 case 'C':
		 System.out.println("You can better!");
		 break;
		 case 'D':
			 System.out.println("Loser!");
			 break;
			 }
	}

}
