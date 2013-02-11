/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dimoprasia;

/**
 *
 * @author john
 */
public class Item {
   
    private int NumItems;
    
    private String ItemId;
 

public String getItemId()
{
	return ItemId;
}


public void setItemId(String ItemId ){
	this.ItemId = ItemId;
}
       
    
private boolean ItemAvailability;
 

public boolean getItemAvailability()
{
	return ItemAvailability;
}

public void setItemAvailability(boolean ItemAvailability ){
	this.ItemAvailability = ItemAvailability;
}    
    
    private double AuctionPrice;
    
    public double getAuctionPrice()
{
	return AuctionPrice;
}

    
public void setAuctionPrice(double AuctionPrice ){
	this.AuctionPrice = AuctionPrice;
}

public Dimoprasia.Auction searchAuction(){
	return null;

}

public void returnAuctionBook(){

}

}
