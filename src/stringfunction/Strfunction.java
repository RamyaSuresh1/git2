package stringfunction;

public class Strfunction {
	 public static void main(String[] args) 
	
		{
	 String s1="Greens Technology";
	 String s0="Greens Technology";
	String s2= new String ("SeleniumAutomationtool");
	String s12= new String ("SeleniumAutomationtool");
	String s3="velmurugan";
	String s4=" j a v a p r o g r a m";
	String s5="9095484678";
	String s6= "rrgmail.com";
	 String s7= "7, bharathi nagar,613002";
	int len=s1.length();
	int len1=s2.length();
int len2=s3.length();
int len3=s4.length();
System.out.println(len);
System.out.println(len1);
System.out.println(len2);
System.out.println(len3);
int l1 = s1.lastIndexOf('o');
System.out.println(l1);
	int i1 = s2.indexOf('o');
	System.out.println(i1);
	int i2 = s3.indexOf('n');
	System.out.println(i2);
	int i3=s4.lastIndexOf("");
	System.out.println(i3);
	int i4=s5.indexOf('8');
	System.out.println(i4);
	char c1 = s1.charAt(10);
	System.out.println(c1);
	char c2 = s2.charAt(11);
	System.out.println(c2);
	char c3 = s3.charAt(4);
	System.out.println(c3);	
	char c4 = s4.charAt(8);
	System.out.println(c4);
	char c5 = s5.charAt(8);
	System.out.println(c5);
	boolean e1 = s1.equals("Greens Technology");
	System.out.println(e1);
	boolean e2 = s1.equals("GreensTechnology");
	System.out.println(e2);
	boolean e3 = s1.equals("greens Technology");
	System.out.println(e3);
	boolean ee1 = s1.equalsIgnoreCase("greens Technology");
	System.out.println(ee1);
	boolean cc1 = s6.contains("@");
	if(cc1==true) {
	System.out.println("valid emailid");}
	boolean cc2 = s7.contains("6");	
	System.out.println(cc2);
	String r1=s1.replace("Greens", "greens");
	System.out.println(r1);
	String r2=s4.replace("", "*");
	System.out.println(r2);
	String r3 = s1.toUpperCase();
	System.out.println(r3);
	System.out.println("length upper" +r3.length());
	String r4=s2.toLowerCase();
	System.out.println(r4);
	System.out.println("length lower" +r3.length());
	boolean sw1 = s1.startsWith("Greens");
	System.out.println(sw1);
	boolean  sw2 = s2.endsWith("tool");
	System.out.println(sw2);
	boolean empty = s3.isEmpty();
	System.out.println(empty);
	String trim = s4.trim();
	System.out.println(trim);
	System.out.println(System.identityHashCode(s1));
	System.out.println(System.identityHashCode(s0));
	System.out.println(System.identityHashCode(s12));
	System.out.println(System.identityHashCode(s2));
	System.out.println(System.identityHashCode(s3));
	System.out.println(System.identityHashCode(s4));
	String con=s3.concat(s4);
	System.out.println(con);
	System.out.println(System.identityHashCode(con));
	//StringBuffer app=s6.append(s7);
	//System.out.println(System.identityHashCode(s6));
	//System.out.println(System.identityHashCode(s7));
	//System.out.println(System.identityHashCode(app));
	
		
		}
}
