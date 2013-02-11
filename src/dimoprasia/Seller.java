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

public class Seller {
    



private String Surname;
 
public String getSurname()
{
	return Surname;
}


public void setSurname(String Surname ){
	this.Surname = Surname;
}

private String Name;
 

public String getName()
{
	return Name;
}


public void setName(String Name ){
	this.Name = Name;
}

private String Username;
 
public String getUsername()
{
	return Username;
}

public void setUsername(String Username ){
	this.Username = Username;
}

private int UserId;
 
public int getUserId()
{
	return UserId;
}

public void setUserId(int UserId ){
	this.UserId = UserId;
}

private String Password;
 
public String getPassword()
{
	return Password;
}

public void setPassword(String Password ){
	this.Password = Password;
}

/**
 *
 */
private Collection<Seller> seller;

public Collection<Seller> getSeller()
{
	return seller;
}
 

public Iterator<Seller> sellerIterator(){
	return seller.iterator();
}


public boolean isSellerEmpty(){
	return seller.isEmpty();
}


public boolean containsSeller(Seller seller){
	return this.seller.contains(seller);
}


public boolean containsAllSeller(Collection<Seller> seller){
	return this.seller.containsAll(seller);
}


public int sellerSize(){
	return seller.size();
}


public Seller[] sellerToArray(){
	return seller.toArray(new Seller[seller.size()]);
}



public boolean addSeller(Seller seller){
	return this.seller.add(seller);
}


public void setSeller(Collection<Seller> seller){
	this.seller = seller;
}


public boolean removeSeller(Seller seller){
	return this.seller.remove(seller);
}


public void clearSeller(){
	this.seller.clear();
}

/**
 *
 */


public Iterator<Item> itemIterator(){
	return item.iterator();
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



public boolean addItem(Item item){
	return this.item.add(item);
}


public void setItem(Collection<Item> item){
	this.item = item;
}


public boolean removeItem(Item item){
	return this.item.remove(item);
}


public void clearItem(){
	this.item.clear();
}


private Collection<Item> item;


public Collection<Item> getItem()
{
	return item;
}
 

public Iterator<Item> itemIterator(){
	return item.iterator();
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


public boolean addItem(Item item){
	return this.item.add(item);
}


public void setItem(Collection<Item> item){
	this.item = item;
}


public boolean removeItem(Item item){
	return this.item.remove(item);
}


public void clearItem(){
	this.item.clear();
}

public Main.Seller searchSeller(){
	return null;

}

public double printReceipt(){
	return 0;

}

public void ShowMessage(){

}}
