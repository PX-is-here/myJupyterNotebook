package cc.openhome;

public class UnicodeDemo {

	public static void main(String[] args) {
		System.out.println(
		    "๐๐๐๐๐๐๐ฉ๐ช๐ซ๐ฌ๐ญ๐ฎ๐ฏ๐บ๐ป๐ผ".matches("(?U)\\d*")
		);
		System.out.println(
		    (
		        "ยฒยณยนยผยฝยพ๐๐๐๐๐๐๐ฉ๐ช๐ซ๐ฌ๐ญ๐ฎ๐ฏ๐บ๐ป๐ผ" + 
		        "ใใใ" +
		        "โ โกโขโฃโคโฅโฆโงโจโฉโชโซโฌโญโฎโฏ" + 
		        "โฐโฑโฒโณโดโตโถโทโธโนโบโปโผโฝโพโฟ"
		    )
		    .matches("\\pN*")
		);
	}

}
