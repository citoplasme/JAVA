public class HotelStandard extends Hotel{
	private boolean epoca;

	public boolean getEpoca() {
		return this.epoca;
	}

	public HotelStandard() {
		super();
		this.epoca = false;
	}

	public HotelStandard(String code, String name, String local, int stars, int bedrooms, double price, boolean epoca) {
		super(code, name, local, stars, bedrooms, price);
		this.epoca = epoca;
	}

	public HotelStandard(Hotel h) {
		super(h);
		this.epoca = false;
	}


	public void epoca_alta() {
		setPrice(this.getPrice() + 20);
	}

	public void epoca_baixa() {
		setPrice(this.getPrice() - 20);	
	}

	public void preco() {
		if (this.getEpoca() == true) this.epoca_alta();
		else this.epoca_baixa();
	}

	public String toString() {
        StringBuilder sb = new StringBuilder();
        
        sb.append(super.toString());
        sb.append("Época alta: ");
        sb.append(this.getEpoca() + "\n");
        return sb.toString();
    }

    public HotelStandard clone(){
        return new HotelStandard(this);    
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (o == null || o.getClass() != this.getClass()) return false;
        HotelStandard e = (HotelStandard) o;

         return super.getCode().equals(e.getCode())
        	&& super.getName().equals(e.getName())
        	&& super.getLocal().equals(e.getLocal())
        	&& super.getStars() == e.getStars()
        	&& super.getBeds() == e.getBeds()
        	&& super.getPrice() == e.getPrice()
        	&& this.getEpoca() == e.getEpoca();
    }
}