package library;

import org.openqa.selenium.support.ui.Select;

public class implementation extends utilclass{

	public static void main(String[] args) {
	
		getDriver();
		
		browser("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569900%7Cb%7Cfacebook%20log%20in%7C&placement=&creative=589460569900&keyword=facebook%20log%20in&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221912%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-1409266755%26loc_physical_ms%3D1007809%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMIip3v5Kr2-QIVeZpmAh2mawMdEAAYASAAEgIp3PD_BwE");
		facebookpage obj=new facebookpage();
		datainput(obj.getname(),"ram");
		datainput(obj.getlast(),"sri");
		datainput(obj.getemail(),"sri@gmail.com");
		datainput(obj.getreenter(),"sri@gmail.com");
		datainput(obj.password(),"123654987");
		
				
		

	}

}
