/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dimoprasia;

/**
 *
 * @author john
 */
import java.util.Collection;
import java.util.Iterator;

public class Buyer {

private String Name;
 

public String getName()
{
	return Name;
}


public void setName(String Name ){
	this.Name = Name;
}


private String Surname;
 

public String getSurname()
{
	return Surname;
}


public void setSurname(String Surname ){
	this.Surname = Surname;
}





private Collection<Item> item;


public Collection<Item> getItem()
{
	return item;
}
 



public boolean isItemEmpty(){
	return item.isEmpty();
}


public boolean containsItem(Item item){
	return this.item.contains(item);
}


public boolean containsAllItem(Collection<Item> item){
	return this.item.containsAll(item);
}


public int ItemSize(){
	return item.size();
}


public Item[] itemToArray(){
	return item.toArray(new Item[item.size()]);
}






private Collection<Item> item;

public Collection<Item> getItem()
{
	return item;
}
 


public boolean isItemEmpty(){
	return item.isEmpty();
}


public boolean containsItem(Item item){
	return this.item.contains(item);
}


public boolean containsAllItem(Collection<Item> item){
	return this.item.containsAll(item);
}




public Item[] itemToArray(){
	return item.toArray(new Item[item.size()]);
}




public Main.Item searchItem(){
	return null;

}

public String getBuyerID(){
	return "";

}

}