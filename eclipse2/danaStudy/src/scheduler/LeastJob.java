package scheduler;

public class LeastJob implements Scheduler {
	@Override
	public void getNextCall() {
		System.out.println("��� ��ȭ�� ������δ�⿭���� �����ɴϴ�.");
	}
	@Override
	public void sendCallToAgent() {
		System.out.println("���� ��� ������ ���ų� "
				+ "��Ⱑ ���� ���� �������� �Ҵ��մϴ�.");
	}
}
