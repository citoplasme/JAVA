public class HotelPremium extends Hotel{
	private double taxa;

	public double getTaxa() {
		return this.taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}

	public HotelPremium() {
		super();
		this.taxa = 0;
	}

	public HotelPremium(String code, String name, String local, int stars, int bedrooms, double price, double taxa) {
		super(code, name, local, stars, bedrooms, price);
		this.taxa = taxa;
	}

	public HotelPremium(Hotel h) {
		super(h);
		this.taxa = 0;
	}

	public HotelPremium(HotelPremium h) {
		super(h);
		this.taxa = h.getTaxa();
	}

	public String toString() {
        StringBuilder sb = new StringBuilder();
        
        sb.append(super.toString());
        sb.append("Taxa: ");
        sb.append(this.getTaxa() + "\n");
        return sb.toString();
    }

    public HotelPremium clone(){
        return new HotelPremium(this);    
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (o == null || o.getClass() != this.getClass()) return false;
        HotelPremium e = (HotelPremium) o;

         return super.getCode().equals(e.getCode())
        	&& super.getName().equals(e.getName())
        	&& super.getLocal().equals(e.getLocal())
        	&& super.getStars() == e.getStars()
        	&& super.getBeds() == e.getBeds()
        	&& super.getPrice() == e.getPrice()
        	&& this.getTaxa() == e.getTaxa();
    }

}