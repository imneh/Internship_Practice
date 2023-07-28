package bitlabs.PMS;

import java.util.Scanner;

import com.pms.dao.ProductDaoImpl;
import com.pms.dao.SalesDaoImpl;
import com.pms.dao.SupplierDaoImpl;
import com.pms.entity.Product;
import com.pms.entity.Sale;
import com.pms.entity.Supplier;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("***RP company***");
        Scanner s=new Scanner(System.in);
        
        
        try {
        ProductDaoImpl dao=new ProductDaoImpl();
        SupplierDaoImpl supdao=new SupplierDaoImpl();
        SalesDaoImpl sdao=new SalesDaoImpl();
        Supplier sup=null;
        Product pro=null;
        while(true) {
    	System.out.println("enter the role(Admin/supplier/user):");
    	String input=s.next();
    	
    	if(input.equalsIgnoreCase("admin")) {
    		System.out.println("1.Add supplier");
    		System.out.println("2.update supplier by id");
    		System.out.println("3.Add sales");
    		System.out.println("4.update sales by id");
    		System.out.println("5.Display product,supplier and sales");
    		System.out.println("6.sort product by id");
    		System.out.println("7.search product,supplier,sales");
    		System.out.println("8.delete sales");
    		System.out.println("9.delete supplier");
    		System.out.println("Enter your choice");
         	int ch=s.nextInt();
         	switch(ch) {
         	case 1:System.out.println("enter supplier details id,name,phone,email,address");
         	sup=new Supplier(s.nextInt(),s.next(),s.nextLong(),s.next(),s.next());
         	supdao.addSupplier(sup);
         	System.out.println("row added");
         	/*System.out.println("enter product details id,name,info,quantity,price");
         	Product pro=new Product(s.nextInt(),s.next(),s.next(),sup,s.nextInt(),s.nextDouble());
         	dao.addProduct(pro);*/
         	break;
         	case 2:System.out.println("enter id and updated address");
         	supdao.updateSupplier(s.nextInt(), s.next());
         	break;
         	case 3:System.out.println("enter sales details id,date,quantity,revenue");
         	Sale sa=new Sale(s.nextInt(),s.next(),pro,s.nextInt(),s.nextDouble());
         	sdao.addSales(sa);
         	break;
         	case 4:System.out.println("enter id and updated revenue");
         	sdao.updateSales(s.nextInt(), s.nextDouble());
         	break;
         	case 5:System.out.println("Table--Product");
         	dao.getProduct();
         	System.out.println("Table--Supplier");
         	supdao.getSupplier();
         	System.out.println("Table--Sales");
         	sdao.getSales();
         	break;
         	case 6:dao.sortProductBySku();
         	break;
         	case 7:System.out.println("enter id to search product");
         		dao.getProductBySku(s.nextInt());
         		System.out.println("enter id to search supplier");
         		supdao.searchSupplierById(s.nextInt());
         		System.out.println("enter id to search sales");
         		sdao.searchSalesById(s.nextInt());
         	break;
         	case 8:System.out.println("enter id to delete sales");
         	sdao.deleteSalesById(s.nextInt());
         	break;
         	case 9:System.out.println("enter id to delete supplier");
         	supdao.deleteSupplier(s.nextInt());
         	default:System.out.println("Invalid choice");
         	}
         	
    	}
    	else if(input.equalsIgnoreCase("supplier")){
    		System.out.println("1.Add product");
    		System.out.println("2.update product by id");
    		System.out.println("3.Display product");
    		System.out.println("4.sort product by id");
    		System.out.println("5.search product,supplier");
    		System.out.println("Enter your choice");
         	int ch=s.nextInt();
         	switch(ch) {
         	/*case 1:System.out.println("enter supplier details id,name,phone,email,address");
         	sup=new Supplier(s.nextInt(),s.next(),s.nextLong(),s.next(),s.next());
         	supdao.addSupplier(sup);
         	break;*/
         	case 1:
         	System.out.println("enter product details id,name,info,quantity,price");
         	pro=new Product(s.nextInt(),s.next(),s.next(),sup,s.nextInt(),s.nextDouble());
         	dao.addProduct(pro);
         	System.out.println("row added");
         	break;
         	case 2:System.out.println("enter sku and price");
         		dao.updateProduct(s.nextInt(), s.nextDouble());
         	break;
         	
         	case 3:dao.getProduct();
         	
         	break;
         	case 4:dao.sortProductBySku();
         	break;
         	case 5:System.out.println("enter id to search product");
         		dao.getProductBySku(s.nextInt());
         		System.out.println("enter id to search supplier");
         		supdao.searchSupplierById(s.nextInt());
         		
         	break;
         	default:System.out.println("Invalid choice");
         	}
    	}
    	else if(input.equalsIgnoreCase("user")) {
    		
    		System.out.println("1.sort product by id");
    		System.out.println("2.search product");
    		System.out.println("3.search supplier");
    		System.out.println("Enter your choice");
         	int ch=s.nextInt();
         	switch(ch) {
         	
         	case 1:dao.sortProductBySku();
         	break;
         	case 2:System.out.println("enter id to search product");
         		dao.getProductBySku(s.nextInt());
         		break;
         	case 3:System.out.println("enter id to search supplier");
     		supdao.searchSupplierById(s.nextInt());	
            break;
         	default:System.out.println("Invalid choice");
         	}
    	}
    	else {
    		System.out.println("enter proper role");
    	}
    	}
        }
        catch(Exception e) {
        	System.out.println(e);
        }
    }
}