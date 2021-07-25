package abstractex;

public class ComputerTest {

	public static void main(String[] args) {
		Computer c1 = new Computer();
		Computer c2 = new DeskTop();
		Computer c3 = new NoteBook(); //추상 클레스는 인스턴트 생성불가
		Computer c4 = new MyNoteBook();
	}

}
