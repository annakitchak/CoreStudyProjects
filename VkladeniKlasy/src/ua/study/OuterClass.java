package ua.study;

public class OuterClass {
	private String name;
	
	public class MemberClass implements InnerInterface{
		public void memberClassMethod(){
			name = "some";
			System.out.println("in memeber class");
		}

		@Override
		public void add() {
			// TODO Auto-generated method stub
			
		}
	}
	public MemberClass createMemberClass() {
		return new MemberClass();
	}
	
	public Object createLocalClassMethod(){
		class LocalClass{
//			public LocalClass(){
//				localClassMethod();
//			}
			
//			{
//				localClassMethod();
//			}
			public void localClassMethod(){
				System.out.println("in local class");
			}
		}
		LocalClass localClass = new LocalClass();
		localClass.localClassMethod();
		return new LocalClass();
	}
	
	
	
	public Object createAnnonymousClass(){
		return new Object(){
			{
				annonymousClassMethod();
			}
			private String name;
			private int age;
			public void annonymousClassMethod(){
				System.out.println("in annonymous class");
			}
		};
	}
	
	public interface InnerInterface{
		void add();
	}
}
