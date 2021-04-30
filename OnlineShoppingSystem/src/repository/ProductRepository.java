package repository;

import java.util.HashMap;
import java.util.Map;

import entity.Product;

public class ProductRepository {
	
	private static HashMap<Integer, Product> productcollection;
	
	public void AddProduct(Product product)
	{
		productcollection.put(product.getId(), product);
	}
	
	public Product Getproduct(Integer Pid) {
		
		for(Map.Entry<Integer, Product> entry :productcollection.entrySet())
		{
			Integer id=entry.getKey();
			if(id.equals(Pid))
				return entry.getValue();
		}
		return null;
	
	}

public void RemoveUserfromProductList(Integer Uid, Integer Pid) {
		
		for(Map.Entry<Integer, Product> entry :productcollection.entrySet())
		{
			Integer id=entry.getKey();
			if(id.equals(Pid))
			{
				entry.getValue().DeleteListUsers(Uid);
			}
		}
	
	
	}
	public String GetAllProducts()
	{
		String s=" ";
		for(Map.Entry<Integer, Product> entry :productcollection.entrySet())
		{
 		s=s+entry.getValue().toString()+"  ";
		}
		return s;
	}

	public String BestProduct() {
		Integer sale,max=-1;
		String best="";
		for(Map.Entry<Integer, Product> entry :productcollection.entrySet())
		{
			sale=entry.getValue().getListUsers().size();
			if(sale>max)
			{
				max=sale;
				best=entry.getValue().getName();
			}
		}
		
		return best;
	}
	
	
	
}
