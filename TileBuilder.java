//Intarface for Tile
abstract class TileBuilder
{
protected Tile tile;

public void newTile()
{
Tile tile= new Tile();
}
public Tile getTile()
{
	return tile;
}
public abstract void buildHeight();
public abstract void buildWidth();
public abstract void buildArea();
public abstract void buildPrice();
public abstract void buildGlassType();

}
