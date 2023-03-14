package com.feb08_1;

public class User {

	public static void main(String[] args) {
		RemoteSwitcher remote=new MuzicPlayer();
		if(remote instanceof MuzicPlayer)
		{
			remote.remote("off");
		}
		remote=new VideoPlayer();
		if(remote instanceof VideoPlayer)
		{
			remote.remote("odfghn");
		}
	
		
	}

}
