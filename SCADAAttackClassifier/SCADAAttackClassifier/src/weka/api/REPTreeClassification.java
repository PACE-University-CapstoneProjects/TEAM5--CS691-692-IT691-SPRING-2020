package weka.api;
import weka.core.Attribute;
//import required classes
import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;
import weka.classifiers.trees.REPTree;
import weka.classifiers.functions.SMO;
import java.util.Scanner;


public class REPTreeClassification{
	private static final char[] Attribute = null;
	private static Scanner obj;


	public static void main(String args[]) throws Exception{
	
		DataSource source = new DataSource("C:\\Users\\peter\\Documents\\CapstoneProjectInfo\\10_gas_final.arff");
		Instances dataset = source.getDataSet();	
		obj = new Scanner(System.in);
		System.out.println("Parameter List \n command_address \n response_address \n resp_length \n comm_read_function \n resp_read_fun \n sub_function \n setpoint \n control_mode \n control_scheme \n measurement  ");
		System.out.println("\n Enter Parameter Name From Above");
		
		String ParamName = obj.nextLine();
		
		//dataset.setClassIndex(dataset.numAttributes() - 6);

		dataset.setClass(dataset.attribute(ParamName));
		
		//Below are to output the user enter parameter name, for debugging purposes
		//System.out.println(dataset.attribute(ParamName));
		//System.out.println(dataset.attribute(26));
		
		
		
		String[] options = new String[12];
		options[0] = "-M"; options[1] = "2";
		options[2] = "-V"; options[3] = "0.001";
		options[4] = "-N"; options[5] = "3";
		options[6] = "-S"; options[7] = "1";
		options[8] = "-L"; options[9] = "-1";
		options[10] = "-I"; options[11] = "0.0";

		REPTree rept1 = new REPTree();
		rept1.setOptions(options);
		rept1.buildClassifier(dataset);
		System.out.println(rept1 + "\n");
		
		//Below is to read the dataset results as long if else statement, for debugging
		//System.out.println(rept1.toSource(ParamName));

		
		switch (ParamName) {
		case "command_address":
			System.out.println("You are suffering from a DOS ATTACK!");
			break;
		case "response_address":
			System.out.println("You are suffering from a Recon Attack!");
			break;
		case "resp_length":
			System.out.println("You are suffering from a Recon Attack!");
			break;
		case "comm_read_function":
			System.out.println("You are suffering from a DOS Attack!");
			break;
		case "resp_read_fun":
			System.out.println("You are suffering from a CMRI Attack!");
			break; 
		case "sub_function":
			System.out.println("You are suffering from a MFCI Attack!");
			break;
		case "setpoint":
			System.out.println("You are suffering from a MPCI Attack!");
			break;
		case "control_mode":
			System.out.println("You are suffering from a MSCI Attack!");
			break;
		case "control_scheme":
			System.out.println("You are suffering from a MSCI Attack!");
			break;
		case "measurement":
			System.out.println("Dataset Outlier, disregard");
			break;
		}
		
		
		//Switch is more efficient than an if else
		//To make more efficient, could implement a hash table or even put switch in a separate file and import it like an API
		
		
		/*if (ParamName.equals("command_address")){
			System.out.println("You are suffering from a DOS ATTACK!");
		}
		else if (ParamName.equals("response_address")) {
			System.out.println("You are suffering from a Recon Attack!");
		}
		else if (ParamName.equals("resp_length")) {
			System.out.println("You are suffering from a Recon Attack!");
		}
		else if (ParamName.equals("comm_read_function")) {
			System.out.println("You are suffering from a DOS Attack!");
		}
		else if (ParamName.equals("resp_read_fun")) {
			System.out.println("You are suffering from a CMRI Attack!");
		}
		else if (ParamName.equals("sub_function")) {
			System.out.println("You are suffering from a MFCI Attack!");
		}
		else if (ParamName.equals("setpoint")) {
			System.out.println("You are suffering from a MPCI Attack!");
		}
		else if (ParamName.equals("control_mode")) {
			System.out.println("You are suffering from a MSCI Attack!");
		}
		else if (ParamName.equals("control_scheme")) {
			System.out.println("You are suffering from a MSCI Attack!");
		}
		else if (ParamName.equals("measurement")) {
			System.out.println("Dataset Outlier, disregard");
		}*/
		
	
	}
}