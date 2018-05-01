public class Hotel {
	private String code;
	private String name;
	private String local;
	private int stars;
	private int bedrooms;
	private double price;

	public void setCode (String x) {
		this.code = x;
	}

	public void setName (String x) {
		this.name = x;
	}

	public void setLocal (String x) {
		this.local = x;
	}

	public void setStars (int x) {
		this.stars = x;
	}

	public void setBeds (int x) {
		this.bedrooms = x;
	}

	public void setPrice (double x) {
		this.price = x;
	}

	public String getCode() {
		return this.code;
	}

	public String getName() {
		return this.name;
	}

	public String getLocal() {
		return this.local;
	}

	public int getStars() {
		return this.stars;
	}

	public int getBeds() {
		return this.bedrooms;
	}

	public double getPrice() {
		return this.price;
	}

	public Hotel() {
		this.code = "";
		this.name = "";
		this.local = "";
		this.stars = 0;
		this.bedrooms = 0;
		this.price = 0;
	}

	public Hotel(String code, String name, String local, int stars, int bedrooms, double price) {
		this.setCode(code);
		this.setName(name);
		this.setLocal(local);
		this.setStars(stars);
		this.setBeds(bedrooms);
		this.setPrice(price);
	}

	public Hotel(Hotel h) {
		this.setCode(h.getCode());
		this.setName(h.getName());
		this.setLocal(h.getLocal());
		this.setStars(h.getStars());
		this.setBeds(h.getBeds());
		this.setPrice(h.getPrice());
	}

	public String toString() {
        StringBuilder sb = new StringBuilder();
        
        sb.append("Código: ");
        sb.append(this.getCode() + "\n");
        sb.append("Nome: ");
        sb.append(this.getName() + "\n");
        sb.append("Local: ");
        sb.append(this.getLocal() + "\n");
        sb.append("Estrelas: ");
        sb.append(this.getStars() + "\n");
        sb.append("Quartos: ");
        sb.append(this.getBeds() + "\n");
        sb.append("Preço: ");
        sb.append(this.getPrice() + "\n");
        return sb.toString();
    }

    public Hotel clone(){
        return new Hotel(this);    
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (o == null || o.getClass() != this.getClass()) return false;
        Hotel e = (Hotel) o;

        return this.getCode().equals(e.getCode())
        	&& this.getName().equals(e.getName())
        	&& this.getLocal().equals(e.getLocal())
        	&& this.getStars() == e.getStars()
        	&& this.getBeds() == e.getBeds()
        	&& this.getPrice() == e.getPrice();
    }
}