import static com.jayway.restassured.RestAssured.given;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import java.util.Collections;
import org.json.JSONException;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import com.jayway.restassured.path.json.JsonPath;
import com.sun.org.apache.bcel.internal.generic.LCONST;

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;


public class ReadJSONFile {

	private static final Object[] Car = null;
	@Test
	public static String jsonobject() throws ParseException, JSONException 
	{    JSONParser parser =new JSONParser();
		try{
			Object car=parser.parse(new FileReader("myJSON.json"));
		 
		JSONObject jsonobject=(JSONObject) car;
		System.out.println(jsonobject);
		}

		catch(FileNotFoundException e ){e.printStackTrace();}
		catch(IOException e ){e.printStackTrace();}
		catch(ParseException e ){e.printStackTrace();}
	}
	
@Test
public void printBlueTesla() throws IOException {
			
	  String res = jsonobject();

	   JsonPath jsRes=new JsonPath(res);
	
     String count = jsRes.get().toString();
      If((jsRes.get(Car(res).make).equals("Tesla") )&&(jsRes.get(Car(res).metadata.Color).equals("Blue")))
  	{

    	  
			System.out.println("Car Model:" +jsRes.get(Car["+i+"].make));
    	    System.out.println("Car Color:"+jsRes.get(Car["+i+"].metadata.Notes));
    	       }
}		



@Test
public void priceOnly(){
		
	String res =  jsonobject();

	JsonPath jsRes=new JsonPath(res);
	
	Integer minPrice = jsRes.get(Car.perdayrent.price.min());
	
	System.out.println("Details of Car whose rent is lowest :"+ jsRes.get("Car.findAll{it->it.perdayrent.price == "+minPrice+"}"));
}
	

Public  List<Float> List<Float> discountPrice(String res)
{

List<Float> listOfPrice= res.get(Car.length.Price);

List<Float> listOfDiscount= jsRes.get(Car.length.Discount);

List<Float> listOfPriceWithDiscount=(List<Float>) new ArrayList();
for(int i=0; i<((ArrayList) listOfPrice).size();i++)
{ listOfPriceWithDiscount.add(listOfPrice.get(i)-(listOfPrice.get(i)*listOfPriceWithDiscount.get(i))/100);	}
 return listOfPriceWithDiscount;
}




/*price after discount*/
@Test
public void priceAfterDiscount(){
	
	String res =  jsonobject();

	JsonPath jsRes=new JsonPath(res);
	List<Float> listOfPriceWithDiscount = discountPrice(res);
Integer minPriceIndex=listOfPriceWithDiscount.indexOf(Collections.min(listOfPriceWithDiscount));
System.out.println (jsRes.get(Car["minPriceIndex"]));

}



@Test
public void highestRevenueCar(){
		
	String res =  jsonobject();

	List<Float> listOfPriceWithDiscount = discountPrice(res);

	JsonPath jsRes=new JsonPath(res);

List<Float> listOfPrice= jsRes.get(Car.length.Price);

List<Float> listOfDiscount= jsRes.get(Car.length.Discount);
List<Float> listOfPriceWithDiscount=new ArrayList();
/*get list of rental count year to date*/
List<Integer> listOfRentalCount= jsRes.get(Car. length.rentalcount.yeartodate);
List<Float> listOfRevenue=new ArrayList();
for(int i=0; i<listOfPrice.size();i++)
{             
  listOfPriceWithDiscount.add(listOfPrice.get(i)-         
(listOfPrice.get(i)*listOfPriceWithDiscount.get(i))/100);
}
	for(int i=0; i<listOfPrice.size();i++){
		listOfRevenue .add(listOfPriceWithDiscount.get(i)* listOfRentalCount.get(i));
}

Int index = listOfRevenue.indexOf(Collections.max(listOfRevenue));

System.out.println(jsRes.get(Car["index"]));

}

@Test
public void highestProfitCar(){
			
	String res =  jsonobject();

	JsonPath jsRes=new JsonPath(res);
	ArrayList<Float> llistOfPrice=new ArrayList();
LCONST listOfPrice= jsRes.get(Car.perdayrent.Price);
List<Float> listOfDiscount= jsRes.get(Car.perdayrent.Discount);
List<Float> listOfMaintanceCost= jsRes.get(Car. length.yoymaintenancecost);
List<Float> listOfDepreciation= jsRes.get(Car.perdayrent. metrics. depreciation);
List<Float> listOfPriceWithDiscount=new ArrayList();

LCONST listOfRentalCount= jsRes.get(Car. 
		 length.rentalcount.yeartodate);
		ArrayList listOfProfit=new ArrayList();
for(int i=0; i<listOfPrice.size();i++)
{           
      listOfPriceWithDiscount.add(listOfPrice.get(i)-         
(listOfPrice.get(i)*listOfPriceWithDiscount.get(i))/100);
}

	for(int i=0; i<listOfPrice.size();i++){
		listOfProfit .add((listOfPriceWithDiscount.get(i)* listOfRentalCount.get(i))-(
listOfMaintanceCost.get(i)+ listOfDepreciation.get(i)));
}

Object index = listOfProfit.indexOf(Collections.max(listOfProfit));

System.out.println(jsRes.get(Car["index"]));
}
}


	                          
		                          
	

