package repository;

import java.util.HashMap;
import java.util.Map;

import entity.Transaction;

public class TransactionRepository {

	private static HashMap<Integer, Transaction> transactioncollection;
	
	public void Addtransaction(Transaction transaction)
	{
		transactioncollection.put(transaction.getId(), transaction);
	}
	
	public Transaction GettransactionbYPid(Integer id) {
		
		
		for(Map.Entry<Integer, Transaction> entry :transactioncollection.entrySet())
		{
			Integer tid=entry.getKey();
			if(id.equals(tid))
				return entry.getValue();
		}
		return null;
	
	}

public Transaction GettransactionbYUid(Integer Pid) {
		
		for(Map.Entry<Integer, Transaction> entry :transactioncollection.entrySet())
		{
			Integer id=entry.getKey();
			if(id.equals(id))
				return entry.getValue();
		}
		return null;
	
	}

	public String GetAlltransactions()
	{
		String s=" ";
		for(Map.Entry<Integer, Transaction> entry :transactioncollection.entrySet())
		{
 		s=s+entry.getValue().toString()+"  ";
		}
		return s;
	}

	/*public void DeleteTransaction(Integer uid) {
		
		for(Map.Entry<Integer, Transaction> entry :transactioncollection.entrySet())
		{
			Integer Uid= entry.getValue().getUid();
			Integer Tid=entry.getKey();
			transactioncollection.remove(Tid);
		}
	}*/

	public void BlacklistTransaction(Integer uid) {
		for(Map.Entry<Integer, Transaction> entry :transactioncollection.entrySet())
		{
			Integer Uid= entry.getValue().getUid();
			if(Uid.equals(uid))
			{
				entry.getValue().setStatus("Blacklisted");
			}
			
		}
		
	}
	
}
