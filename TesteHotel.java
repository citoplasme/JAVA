public class TesteHotel {
	public static void main(String[] args) {
		Hotel h1 = new Hotel("A33Z", "Hotel 1", "Braga", 3, 44, 56.99);
		HotelStandard h2 = new HotelStandard("B22Z", "Hotel 2", "Esposende", 4, 67, 99.7, true);
		HoteisInc H = new HoteisInc();

		H.adiciona(h1);
		H.adiciona(h2);

		System.out.println(H.toString());
	}
}