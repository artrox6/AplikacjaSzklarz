//Final Product
public class Tile {
private int tileHeight;
private int tileWidth;
private int tileArea;
private int tilePrice;
private GlassType tileGlassType;

public void setHeight(int tileHeight)
{
	this.tileHeight = tileHeight;
}

public void setWidth(int tileWidth)
{
	this.tileWidth = tileWidth;
}

public void setArea(int tileArea)
{
	this.tileArea = tileArea;
}

public void tilePrice(int tilePrice)
{
	this.tilePrice = tilePrice;
}

public void tileGlassType(GlassType glassType)
{
	this.tileGlassType = glassType;
}

public void showTile()
{
	if(tileHeight != 0)System.out.println("Wysoko��" + tileHeight);
	if(tileWidth != 0)System.out.println("Wysoko��" + tileWidth);
	if(tileArea != 0)System.out.println("Wysoko��" + tileArea);
	if(tilePrice != 0)System.out.println("Wysoko��" + tilePrice);
	if(glassType != null)System.out.println("Typ Szk�a" + glassType);
}
}
