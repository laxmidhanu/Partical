package package_eg;

public class test_1 {



public static void main(String[] args) {

try {

args = null;

args[0] = "test";

System.out.println(args[0]);

} catch (Exception ex) {

System.out.println("Exception");

}

}

}