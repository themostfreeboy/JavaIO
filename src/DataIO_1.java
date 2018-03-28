import java.io.*;
public class DataIO_1 
{
	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		FileOutputStream fos=new FileOutputStream("1.txt");
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		DataOutputStream dos=new DataOutputStream(bos);
		byte b=3;
		int i=78;
		char ch='a';
		float f=4.5f;
		dos.writeByte(b);
		dos.writeInt(i);
		dos.writeChar(ch);
		dos.writeFloat(f);
		dos.close();
	}
}
