package lgs;

public class Main {
public static void main(String[] args) {
		
		Pet cov = s -> System.out.println(s);
		cov.voice("� ������- ����-����");

		Pet dog = s -> System.out.println(s);
		dog.voice("� ��� - �����-�����");

		Pet cat = s -> System.out.println(s);
		cat.voice("� ��- �����-�����");
}
}
