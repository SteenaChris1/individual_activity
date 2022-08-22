package selenium_training;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;


public class Filo {
	public static void main(String[] args) throws FilloException {
        // TODO Auto-generated method stub
        Fillo fillo=new Fillo();
        Connection connection=fillo.getConnection("C:\\Users\\steenac\\Downloads\\Training\\Book1.xlsx");
       String strQuery="Select * from Sheet1 where NAME = 'STEENA' ";
        //String strQuery="UPDATE Sheet1 SET Name = 'Vicky' WHERE Id=12";
        Recordset recordset=connection.executeQuery(strQuery);
        
       while(recordset.next()){
        System.out.println(recordset.getField("AGE"));
        }     
        recordset.close();
        connection.close();



   }
}