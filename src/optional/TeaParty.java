package optional;

public class TeaParty {
	
	public String welcome(String name, boolean isWoman, boolean wasKnighted) {
		String add;
		if(isWoman) {
			add = "Ms.";
			if(wasKnighted)
				add = "Dame";
		}
		else {
			add = "Mr.";
			if(wasKnighted)
				add = "Sir";
		}
		return "Hello " + add + " " + name;
	}

}
