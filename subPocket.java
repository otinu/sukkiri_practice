package sukkiri_practice;

public class subPocket<E extends heroUnit> {
	private E data;

	public void put(E d) {
		this.data = d;
	}

	public E get() {
		return this.data;
	}
}