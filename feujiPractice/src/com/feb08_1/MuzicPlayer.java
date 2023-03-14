package com.feb08_1;



public class MuzicPlayer implements RemoteSwitcher{

	@Override
	public void remote(String button) {
		switch(button)
		{
		case "on":System.out.println("starting muzic.....!");
		break;
		case "ON":System.out.println("starting muzic.....!");
		break;
		case "off":System.out.println("stopping muzic.....!");
		break;
		case "OFF":System.out.println("stopping muzic.....!");
		break;
		case "pause":System.out.println("pausing muzic.....!");
		break;
		case "PAUSE":System.out.println("pausing muzic.....!");
		break;
		case "resume":System.out.println("resuming muzic.....!");
		break;
		case "RESUME":System.out.println("resuming muzic.....!");
		break;
		default:System.out.println("invalid.......!");		
		}
	}

}
