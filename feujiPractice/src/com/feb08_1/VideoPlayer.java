package com.feb08_1;



public class VideoPlayer implements RemoteSwitcher{

	

	@Override
	public void remote(String button) {
		switch(button)
		{
		case "on":System.out.println("starting video.....!");
		break;
		case "ON":System.out.println("starting video.....!");
		break;
		case "off":System.out.println("stopping video.....!");
		break;
		case "OFF":System.out.println("stopping video.....!");
		break;
		case "pause":System.out.println("pausing video.....!");
		break;
		case "PAUSE":System.out.println("pausing video.....!");
		break;
		case "resume":System.out.println("resuming video.....!");
		break;
		case "RESUME":System.out.println("resuming video.....!");
		break;
		default:System.out.println("invalid.......!");		
		}
		
	}

}
