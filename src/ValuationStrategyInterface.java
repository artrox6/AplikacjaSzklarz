/**
 * 
 * @author Oskar Szabla
 * Interface for evaluation of glass sheet
 */
interface ValuationStrategyInterface {
	
	//Width of glass sheet
public void setWidth(double width);

	//Height of glass sheet
public void setHeight(double height);

	//Glass type of glass sheet (float, lacobel, ornament glass)
public void setGlassType(String glassType);

	//Price for m^2 of glass type
public void setPrice(double price);

	// Area in m^2
public void setArea(double area);

	// Glass thickness (2, 4, 6, 8, 10, 12, 16, 19)mm
public void setThickness(double thickness);

	// Price for glass sheet 
public void setPriceV(double priceV);

	// Method that counts sheet area
public double countArea();

	// Method that count price for glass sheet (area * price)
public double countValuationPrice();

	// Methods that returns parameters
public double getWidth();
public double getHeight();
public String getGlassType();
public double getPrice();
public double getPriceV();
public double getArea();
public double getThickness();
}