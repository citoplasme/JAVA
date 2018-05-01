import java.util.Set;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;
import java.util.stream.Collectors;
import java.util.Iterator;

public class HoteisInc {
	private Map<String, Hotel> hoteis;

	public HoteisInc() {
		this.hoteis = new HashMap<>();
	}

	public HoteisInc(Map<String, Hotel> hoteis) {
		this.hoteis = new HashMap<>();
		for(Map.Entry<String, Hotel> e : hoteis.entrySet()) {
			this.hoteis.put(e.getKey(), e.getValue());
		} 
	}

	public HoteisInc(HoteisInc h) {
		this.hoteis = new HashMap<>();
		for(Map.Entry<String, Hotel> e : h.hoteis.entrySet()) {
			this.hoteis.put(e.getKey(), e.getValue()).clone();
		}	
	}

	public void setHoteis(Map<String, Hotel> hoteis) {
		this.hoteis = new HashMap<>();
		for(Map.Entry<String, Hotel> e : hoteis.entrySet()) {
			this.hoteis.put(e.getKey(), e.getValue());
		} 
	}

	public boolean exiteHotel (String cod) {
		return this.hoteis.containsKey(cod);
	} 

	public int quantos() {
		return this.hoteis.size();
	}

	public int quantos(String loc) {
		return (int) this.hoteis.values().stream()
					.filter(e -> e.getLocal().equals(loc))
					.count();
	}

	public Hotel getHotel(String cod) {
		return this.hoteis.get(cod);
	}

	public void adiciona(Hotel h) {
		this.hoteis.put(h.getCode(), h);
	}

	public List<Hotel> getHoteis() {
		return this.hoteis.values().stream().collect(Collectors.toList());
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		List<Hotel> l = this.getHoteis();
		
		for (Hotel h : l) {
			sb.append(h.toString() + "\n");
		}
		return sb.toString();
	}

	public void adiciona(Set<Hotel> hs) {
		Iterator<Hotel> it = hs.iterator();
		Hotel s = new Hotel();
		while(it.hasNext()) 
			s = it.next();
			this.hoteis.put(s.getCode(),s);
	}

	public int qtsStandard() {
		
	}
}