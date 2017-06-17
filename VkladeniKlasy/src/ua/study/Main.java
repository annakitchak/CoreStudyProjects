package ua.study;

import ua.study.Judge.Punishment.Prison;
import ua.study.OuterClass.MemberClass;

public class Main {

	public static void main(String[] args) {
		Judge.Punishment punishment = new Judge.Punishment();
		Prison prison = new Prison(); //але тоді потрібно зверху імпортувати ua.study.Judge.Punishment.Prison
		punishment.inStaticClassMethod();
		System.out.println();
		OuterClass outerClass = new OuterClass();
		MemberClass memberClass = outerClass.createMemberClass();
		memberClass.memberClassMethod();
		
		outerClass.createLocalClassMethod();
		outerClass.createAnnonymousClass();
		
	}

}
