package service;

import entity.Product;
import entity.Transaction;
import entity.User;
import repository.ProductRepository;
import repository.TransactionRepository;
import repository.UserRepository;

public class MainService {

	UserRepository userrepository=new UserRepository();
	ProductRepository productrepository =new ProductRepository();
	TransactionRepository transactionrepository =new TransactionRepository();
	public void AddUser(User user) {
		userrepository.AddUser(user);
	}

	public void AddProduct(Product product) {
		productrepository.AddProduct(product);	
	}

	public void PurchaseProduct(Transaction transaction) {
		transactionrepository.Addtransaction(transaction);
		productrepository.Getproduct(transaction.getPid()).setListUsers(transaction.getUid());
		userrepository.GetUserbyId(transaction.getUid()).setListProducts(transaction.getPid());
	}

	public void ReturnProduct(Integer Tid, Integer uid, Integer pid) {
	transactionrepository.GettransactionbYPid(Tid).setStatus("Returned");
	productrepository.RemoveUserfromProductList(uid,pid);
	userrepository.RemoveProductfromUserList(pid,uid);
		
	}

	public void BlacklistUser(Integer Uid) {
		userrepository.GetUserbyId(Uid).setBlacklist(true);
		transactionrepository.BlacklistTransaction(Uid);
		
	}
	public String getBestProduct() {
		return productrepository.BestProduct();
	}


}
