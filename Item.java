public class Item {
	private String family ;
	private String name ;
	private int amount ;
	private double price  ;
	private boolean availabe ;
	private String Image ;
	private String descriprion ;
	private boolean checked ;//for view
	public String getFamily()
	{
		return family;
	}
	public void setFamily(String family)
	{
		this.family = family;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public int getAmount()
	{
		return amount;
	}
	public void setAmount(int amount)
	{
		this.amount = amount;
	}
	public double getPrice()
	{
		return price;
	}
	public void setPrice(double price)
	{
		this.price = price;
	}
	public boolean isAvailabe()
	{
		return availabe;
	}

	public void setAvailabe(boolean availabe)
	{
		this.availabe = availabe;
	}
	public String getImage()
	{
		return Image;
	}
	public void setImage(String image)
	{
		Image = image;
	}
	public String getDescriprion()
	{
		return descriprion;
	}
	public void setDescriprion(String descriprion)
	{
		this.descriprion = descriprion;
	}
}
